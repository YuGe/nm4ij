package me.yuge.nonmem.editor;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import me.yuge.nonmem.NonmemIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

import java.util.Map;

import static me.yuge.nonmem.editor.NonmemSyntaxHighlighter.*;

public class NonmemColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Illegal", ILLEGAL),
            new AttributesDescriptor("Comment", COMMENT),
            new AttributesDescriptor("String", STRING),
            new AttributesDescriptor("Number", NUMBER),
            new AttributesDescriptor("Parenthesis", PARENTHESES),
            new AttributesDescriptor("Operation", OPERATION),
    };

    @Nullable
    @Override
    public Icon getIcon() {
        return NonmemIcons.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new NonmemSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "; comment\n" +
                "\n" +
                "$SIZES PD=-150\n" +
                "$PROBLEM\n" +
                "$DATA nonmem_data.csv IGNORE=C\n" +
                "$INPUT C ID ST SID DOSE AMT TIME TAD DV MDV EVID II ADDL AGE WT LWT HT BMI SEX\n" +
                "$SUBROUTINE ADVAN2 TRANS2\n" +
                "$PK\n" +
                "\n" +
                "TVKA=THETA(1)\n" +
                "KA=TVKA\n" +
                "\n" +
                "TVCL=THETA(2)\n" +
                "CL=TVCL*EXP(ETA(1))\n" +
                "\n" +
                "TVV=THETA(3)\n" +
                "V=TVV*EXP(ETA(2))\n" +
                "\n" +
                "S2=V\n" +
                "\n" +
                "$ERROR\n" +
                "IPRED=F\n" +
                "IRES=DV-IPRED\n" +
                "DEL=0\n" +
                "IF(DV .EQ. 0) DEL=1\n" +
                "IWRES=(1-DEL)*IRES/(DV+DEL)\n" +
                "Y=F+F*EPS(1)+EPS(2)\n" +
                "\n" +
                "$THETA\n" +
                "(0, 0.355) ; KA\n" +
                "(0, 16.9) ; CL\n" +
                "(0, 994) ; V\n" +
                "\n" +
                "$OMEGA\n" +
                " 0.0903 ;        CL_\n" +
                " 0.196 ;         V_\n" +
                "\n" +
                "$SIGMA\n" +
                " 0.0821 ;       prop\n" +
                " 0.0948 ;        add\n" +
                "\n" +
                "$ESTIMATION METHOD=1 INTER MAXEVALS=9999 PRINT=5 POSTHOC\n" +
                "$COVARIANCE\n" +
                "\n" +
                "$TABLE ID TIME DV MDV PRED IPRED AMT EVID IWRES CWRES NOPRINT NOAPPEND ONEHEADER FILE=run010.fit FORMAT=s1PE13.6\n";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Nonmem";
    }
}
