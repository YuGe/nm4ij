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

public class NonmemEstimationRecordImpl extends NonmemRecordImpl implements NonmemEstimationRecord {

  public NonmemEstimationRecordImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull NonmemVisitor visitor) {
    visitor.visitEstimationRecord(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NonmemVisitor) accept((NonmemVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<NonmemEstimationNamedParam> getEstimationNamedParamList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NonmemEstimationNamedParam.class);
  }

  @Override
  @NotNull
  public List<NonmemEstimationOptionParam> getEstimationOptionParamList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NonmemEstimationOptionParam.class);
  }

}
