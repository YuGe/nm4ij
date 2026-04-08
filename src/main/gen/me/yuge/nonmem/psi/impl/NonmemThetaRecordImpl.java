// This is a generated file. Not intended for manual editing.
package me.yuge.nonmem.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static me.yuge.nonmem.psi.NonmemTypes.*;
import me.yuge.nonmem.psi.*;

public class NonmemThetaRecordImpl extends NonmemRecordImpl implements NonmemThetaRecord {

  public NonmemThetaRecordImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull NonmemVisitor visitor) {
    visitor.visitThetaRecord(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NonmemVisitor) accept((NonmemVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<NonmemInitialValue> getInitialValueList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NonmemInitialValue.class);
  }

}
