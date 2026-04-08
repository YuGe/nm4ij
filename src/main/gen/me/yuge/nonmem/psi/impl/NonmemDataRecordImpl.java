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

public class NonmemDataRecordImpl extends NonmemRecordImpl implements NonmemDataRecord {

  public NonmemDataRecordImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull NonmemVisitor visitor) {
    visitor.visitDataRecord(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NonmemVisitor) accept((NonmemVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public NonmemDataFileParam getDataFileParam() {
    return findNotNullChildByClass(NonmemDataFileParam.class);
  }

  @Override
  @Nullable
  public NonmemDataFormatParam getDataFormatParam() {
    return findChildByClass(NonmemDataFormatParam.class);
  }

  @Override
  @NotNull
  public List<NonmemDataNamedParam> getDataNamedParamList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NonmemDataNamedParam.class);
  }

}
