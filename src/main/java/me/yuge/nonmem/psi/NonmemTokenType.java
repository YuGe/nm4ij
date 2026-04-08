package me.yuge.nonmem.psi;

import com.intellij.psi.tree.IElementType;
import me.yuge.nonmem.NonmemLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class NonmemTokenType extends IElementType {
    public NonmemTokenType(@NotNull @NonNls String debugName) {
        super(debugName, NonmemLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "NonmemTokenType." + super.toString();
    }
}
