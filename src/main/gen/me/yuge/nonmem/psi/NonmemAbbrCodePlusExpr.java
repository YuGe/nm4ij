// This is a generated file. Not intended for manual editing.
package me.yuge.nonmem.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NonmemAbbrCodePlusExpr extends PsiElement {

  @NotNull
  List<NonmemAbbrCodeFunction> getAbbrCodeFunctionList();

  @NotNull
  List<NonmemAbbrCodeLiteral> getAbbrCodeLiteralList();

  @NotNull
  List<NonmemAbbrCodeMulExpr> getAbbrCodeMulExprList();

  @NotNull
  List<NonmemAbbrCodeParenthesis> getAbbrCodeParenthesisList();

  @Nullable
  NonmemAbbrCodePlusExpr getAbbrCodePlusExpr();

  @NotNull
  List<NonmemAbbrCodeReference> getAbbrCodeReferenceList();

  @NotNull
  List<NonmemAbbrCodeVariable> getAbbrCodeVariableList();

}
