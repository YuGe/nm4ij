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

public class NonmemAbbrCodeImpl extends ASTWrapperPsiElement implements NonmemAbbrCode {

  public NonmemAbbrCodeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NonmemVisitor visitor) {
    visitor.visitAbbrCode(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NonmemVisitor) accept((NonmemVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NonmemAbbrCodeDoWhile getAbbrCodeDoWhile() {
    return findChildByClass(NonmemAbbrCodeDoWhile.class);
  }

  @Override
  @Nullable
  public NonmemAbbrCodeEquation getAbbrCodeEquation() {
    return findChildByClass(NonmemAbbrCodeEquation.class);
  }

  @Override
  @Nullable
  public NonmemAbbrCodeIf getAbbrCodeIf() {
    return findChildByClass(NonmemAbbrCodeIf.class);
  }

}
