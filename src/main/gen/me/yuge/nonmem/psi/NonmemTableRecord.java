// This is a generated file. Not intended for manual editing.
package me.yuge.nonmem.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NonmemTableRecord extends NonmemRecord {

  @NotNull
  List<NonmemErrorReservedParam> getErrorReservedParamList();

  @NotNull
  List<NonmemInputReservedParam> getInputReservedParamList();

  @NotNull
  List<NonmemPkReservedParam> getPkReservedParamList();

  @NotNull
  List<NonmemTableFileParam> getTableFileParamList();

  @NotNull
  List<NonmemTableFormatParam> getTableFormatParamList();

  @NotNull
  List<NonmemTableOptionParam> getTableOptionParamList();

}
