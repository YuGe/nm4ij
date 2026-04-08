package me.yuge.nonmem.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import me.yuge.nonmem.psi.NonmemNamedElement;
import org.jetbrains.annotations.NotNull;

public abstract class NonmemNamedElementImpl extends ASTWrapperPsiElement implements NonmemNamedElement {
    public NonmemNamedElementImpl(@NotNull ASTNode node) {
        super(node);
    }
}
