// This is a generated file. Not intended for manual editing.
package com.goide.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;

public interface GoFieldName extends GoReferenceExpressionBase {

  @NotNull
  PsiElement getIdentifier();

  @NotNull
  PsiReference getReference();

  @Nullable
  GoReferenceExpression getQualifier();

  @Nullable
  PsiElement resolve();

}
