package me.yuge.nonmem.editor;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.psi.PsiElement;
import com.intellij.psi.impl.source.tree.TreeElement;
import me.yuge.nonmem.psi.*;
import org.jetbrains.annotations.NotNull;

public class NonmemAnnotator implements Annotator {
    @Override
    public void annotate(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        PsiElement parent = psiElement.getParent();
        if (parent instanceof NonmemRecord && parent.getFirstChild() == psiElement) {
            createHighlight(annotationHolder, NonmemSyntaxHighlighter.RECORD);
        } else if (parent instanceof NonmemFileParam) {
            createHighlight(annotationHolder, NonmemSyntaxHighlighter.STRING);
        } else if (parent instanceof NonmemNamedParam && parent.getFirstChild() != psiElement
                && ((TreeElement) psiElement).getElementType() == NonmemTypes.ID) {
            createHighlight(annotationHolder, NonmemSyntaxHighlighter.STRING);
        } else if (parent instanceof NonmemProblemRecord) {
            createHighlight(annotationHolder, NonmemSyntaxHighlighter.STRING);
        } else if (parent instanceof NonmemInputReservedParam) {
            createHighlight(annotationHolder, NonmemSyntaxHighlighter.INPUT);
        } else if (parent instanceof NonmemPkReservedParam) {
            createHighlight(annotationHolder, NonmemSyntaxHighlighter.PK);
        } else if (parent instanceof NonmemErrorReservedParam) {
            createHighlight(annotationHolder, NonmemSyntaxHighlighter.ERROR);
        } else if (parent instanceof NonmemAbbrCodeVariable && parent.getFirstChild() == psiElement) {
            createHighlight(annotationHolder, NonmemSyntaxHighlighter.CODE_VARIABLE);
        } else if (parent instanceof NonmemAbbrCodeFunction && parent.getFirstChild() == psiElement) {
            createHighlight(annotationHolder, NonmemSyntaxHighlighter.CODE_EXPONENTIAL);
        }
    }

    private static void createHighlight(@NotNull AnnotationHolder annotationHolder,
                                        TextAttributesKey attributesKey) {
        annotationHolder
                .newSilentAnnotation(HighlightSeverity.INFORMATION)
                .textAttributes(attributesKey)
                .create();
    }
}
