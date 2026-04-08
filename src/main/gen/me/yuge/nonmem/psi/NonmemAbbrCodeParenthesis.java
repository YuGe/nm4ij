// This is a generated file. Not intended for manual editing.
package me.yuge.nonmem.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NonmemAbbrCodeParenthesis extends PsiElement {

  @Nullable
  NonmemAbbrCodeFunction getAbbrCodeFunction();

  @Nullable
  NonmemAbbrCodeLiteral getAbbrCodeLiteral();

  @NotNull
  List<NonmemAbbrCodeLogicExpr> getAbbrCodeLogicExprList();

  @Nullable
  NonmemAbbrCodeMulExpr getAbbrCodeMulExpr();

  @Nullable
  NonmemAbbrCodeParenthesis getAbbrCodeParenthesis();

  @Nullable
  NonmemAbbrCodePlusExpr getAbbrCodePlusExpr();

  @Nullable
  NonmemAbbrCodeReference getAbbrCodeReference();

  @Nullable
  NonmemAbbrCodeVariable getAbbrCodeVariable();

}
