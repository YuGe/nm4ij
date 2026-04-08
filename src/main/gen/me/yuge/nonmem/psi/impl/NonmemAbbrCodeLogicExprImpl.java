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

public class NonmemAbbrCodeLogicExprImpl extends ASTWrapperPsiElement implements NonmemAbbrCodeLogicExpr {

  public NonmemAbbrCodeLogicExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NonmemVisitor visitor) {
    visitor.visitAbbrCodeLogicExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NonmemVisitor) accept((NonmemVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NonmemAbbrCodeFunction getAbbrCodeFunction() {
    return findChildByClass(NonmemAbbrCodeFunction.class);
  }

  @Override
  @Nullable
  public NonmemAbbrCodeLiteral getAbbrCodeLiteral() {
    return findChildByClass(NonmemAbbrCodeLiteral.class);
  }

  @Override
  @Nullable
  public NonmemAbbrCodeMulExpr getAbbrCodeMulExpr() {
    return findChildByClass(NonmemAbbrCodeMulExpr.class);
  }

  @Override
  @Nullable
  public NonmemAbbrCodeParenthesis getAbbrCodeParenthesis() {
    return findChildByClass(NonmemAbbrCodeParenthesis.class);
  }

  @Override
  @Nullable
  public NonmemAbbrCodePlusExpr getAbbrCodePlusExpr() {
    return findChildByClass(NonmemAbbrCodePlusExpr.class);
  }

  @Override
  @Nullable
  public NonmemAbbrCodeReference getAbbrCodeReference() {
    return findChildByClass(NonmemAbbrCodeReference.class);
  }

  @Override
  @Nullable
  public NonmemAbbrCodeVariable getAbbrCodeVariable() {
    return findChildByClass(NonmemAbbrCodeVariable.class);
  }

}
