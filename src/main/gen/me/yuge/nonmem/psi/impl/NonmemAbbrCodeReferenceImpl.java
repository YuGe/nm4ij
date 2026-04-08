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

public class NonmemAbbrCodeReferenceImpl extends ASTWrapperPsiElement implements NonmemAbbrCodeReference {

  public NonmemAbbrCodeReferenceImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NonmemVisitor visitor) {
    visitor.visitAbbrCodeReference(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NonmemVisitor) accept((NonmemVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NonmemErrorReservedParam getErrorReservedParam() {
    return findChildByClass(NonmemErrorReservedParam.class);
  }

  @Override
  @Nullable
  public NonmemPkReservedParam getPkReservedParam() {
    return findChildByClass(NonmemPkReservedParam.class);
  }

  @Override
  @Nullable
  public PsiElement getId() {
    return findChildByType(ID);
  }

}
