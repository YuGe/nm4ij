// This is a generated file. Not intended for manual editing.
package me.yuge.nonmem.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static me.yuge.nonmem.psi.NonmemTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import me.yuge.nonmem.psi.*;

public class NonmemAbbrCodeEquationImpl extends ASTWrapperPsiElement implements NonmemAbbrCodeEquation {

  public NonmemAbbrCodeEquationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NonmemVisitor visitor) {
    visitor.visitAbbrCodeEquation(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NonmemVisitor) accept((NonmemVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<NonmemAbbrCodeFunction> getAbbrCodeFunctionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NonmemAbbrCodeFunction.class);
  }

  @Override
  @NotNull
  public List<NonmemAbbrCodeLiteral> getAbbrCodeLiteralList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NonmemAbbrCodeLiteral.class);
  }

  @Override
  @NotNull
  public List<NonmemAbbrCodeLogicExpr> getAbbrCodeLogicExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NonmemAbbrCodeLogicExpr.class);
  }

  @Override
  @Nullable
  public NonmemAbbrCodeMulExpr getAbbrCodeMulExpr() {
    return findChildByClass(NonmemAbbrCodeMulExpr.class);
  }

  @Override
  @NotNull
  public List<NonmemAbbrCodeParenthesis> getAbbrCodeParenthesisList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NonmemAbbrCodeParenthesis.class);
  }

  @Override
  @Nullable
  public NonmemAbbrCodePlusExpr getAbbrCodePlusExpr() {
    return findChildByClass(NonmemAbbrCodePlusExpr.class);
  }

  @Override
  @NotNull
  public List<NonmemAbbrCodeReference> getAbbrCodeReferenceList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NonmemAbbrCodeReference.class);
  }

  @Override
  @NotNull
  public List<NonmemAbbrCodeVariable> getAbbrCodeVariableList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NonmemAbbrCodeVariable.class);
  }

}
