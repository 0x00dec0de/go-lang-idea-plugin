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
import com.intellij.codeInsight.highlighting.ReadWriteAccessDetector.Access;

public class GoReferenceExpressionImpl extends GoExpressionImpl implements GoReferenceExpression {

  public GoReferenceExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GoVisitor visitor) {
    visitor.visitReferenceExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GoVisitor) accept((GoVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(IDENTIFIER);
  }

  @NotNull
  public GoReference getReference() {
    return GoPsiImplUtil.getReference(this);
  }

  @Nullable
  public GoReferenceExpression getQualifier() {
    return GoPsiImplUtil.getQualifier(this);
  }

  @Nullable
  public PsiElement resolve() {
    return GoPsiImplUtil.resolve(this);
  }

  @NotNull
  public Access getReadWriteAccess() {
    return GoPsiImplUtil.getReadWriteAccess(this);
  }

}
