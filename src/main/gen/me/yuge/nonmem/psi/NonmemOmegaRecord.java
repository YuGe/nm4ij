// This is a generated file. Not intended for manual editing.
package me.yuge.nonmem.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NonmemOmegaRecord extends NonmemRecord {

  @NotNull
  List<NonmemInitialValue> getInitialValueList();

  @Nullable
  NonmemOmegaIntParam getOmegaIntParam();

  @Nullable
  NonmemOmegaOptionParam getOmegaOptionParam();

}
