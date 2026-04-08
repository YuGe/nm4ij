// This is a generated file. Not intended for manual editing.
package me.yuge.nonmem.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NonmemAbbrCodeMulExpr extends PsiElement {

  @NotNull
  List<NonmemAbbrCodeFunction> getAbbrCodeFunctionList();

  @NotNull
  List<NonmemAbbrCodeLiteral> getAbbrCodeLiteralList();

  @Nullable
  NonmemAbbrCodeMulExpr getAbbrCodeMulExpr();

  @NotNull
  List<NonmemAbbrCodeParenthesis> getAbbrCodeParenthesisList();

  @NotNull
  List<NonmemAbbrCodeReference> getAbbrCodeReferenceList();

  @NotNull
  List<NonmemAbbrCodeVariable> getAbbrCodeVariableList();

}
