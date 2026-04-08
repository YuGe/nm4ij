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

public class NonmemTableRecordImpl extends NonmemRecordImpl implements NonmemTableRecord {

  public NonmemTableRecordImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull NonmemVisitor visitor) {
    visitor.visitTableRecord(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NonmemVisitor) accept((NonmemVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<NonmemErrorReservedParam> getErrorReservedParamList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NonmemErrorReservedParam.class);
  }

  @Override
  @NotNull
  public List<NonmemInputReservedParam> getInputReservedParamList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NonmemInputReservedParam.class);
  }

  @Override
  @NotNull
  public List<NonmemPkReservedParam> getPkReservedParamList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NonmemPkReservedParam.class);
  }

  @Override
  @NotNull
  public List<NonmemTableFileParam> getTableFileParamList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NonmemTableFileParam.class);
  }

  @Override
  @NotNull
  public List<NonmemTableFormatParam> getTableFormatParamList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NonmemTableFormatParam.class);
  }

  @Override
  @NotNull
  public List<NonmemTableOptionParam> getTableOptionParamList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NonmemTableOptionParam.class);
  }

}
