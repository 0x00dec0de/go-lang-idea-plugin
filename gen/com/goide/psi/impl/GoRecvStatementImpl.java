// This is a generated file. Not intended for manual editing.
package com.goide.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.goide.GoTypes.*;
import com.goide.psi.*;
import com.intellij.psi.stubs.IStubElementType;

public class GoRecvStatementImpl extends GoVarSpecImpl implements GoRecvStatement {

  public GoRecvStatementImpl(ASTNode node) {
    super(node);
  }

  public GoRecvStatementImpl(com.goide.stubs.GoVarSpecStub stub, IStubElementType nodeType) {
    super(stub, nodeType);
  }

  public void accept(@NotNull GoVisitor visitor) {
    visitor.visitRecvStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GoVisitor) accept((GoVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<GoExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GoExpression.class);
  }

  @Override
  @NotNull
  public List<GoVarDefinition> getVarDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GoVarDefinition.class);
  }

  @Override
  @Nullable
  public PsiElement getAssign() {
    return findChildByType(ASSIGN);
  }

  @Override
  @Nullable
  public PsiElement getVarAssign() {
    return findChildByType(VAR_ASSIGN);
  }

  @Nullable
  public GoExpression getRecvExpression() {
    return GoPsiImplUtil.getRecvExpression(this);
  }

  @NotNull
  public List<GoExpression> getLeftExpressionsList() {
    return GoPsiImplUtil.getLeftExpressionsList(this);
  }

  @NotNull
  public List<GoExpression> getRightExpressionsList() {
    return GoPsiImplUtil.getRightExpressionsList(this);
  }

}
