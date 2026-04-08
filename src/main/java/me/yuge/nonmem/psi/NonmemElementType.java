package me.yuge.nonmem.psi;

import com.intellij.psi.tree.IElementType;
import me.yuge.nonmem.NonmemLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class NonmemElementType extends IElementType {
    public NonmemElementType(@NonNls @NotNull String debugName) {
        super(debugName, NonmemLanguage.INSTANCE);
    }
}
