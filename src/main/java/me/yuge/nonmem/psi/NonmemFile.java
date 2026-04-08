package me.yuge.nonmem.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import me.yuge.nonmem.NonmemFileType;
import me.yuge.nonmem.NonmemLanguage;
import org.jetbrains.annotations.NotNull;

public class NonmemFile extends PsiFileBase {
    public NonmemFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, NonmemLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return NonmemFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Nonmem File";
    }
}
