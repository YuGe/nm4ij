package me.yuge.nonmem;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class NonmemFileType extends LanguageFileType {
    public static final NonmemFileType INSTANCE = new NonmemFileType();

    private NonmemFileType() {
        super(NonmemLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Nonmem File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Nonmem";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "ctl";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return NonmemIcons.FILE;
    }
}
