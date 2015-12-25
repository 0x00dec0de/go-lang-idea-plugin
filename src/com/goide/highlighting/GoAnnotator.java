/*
 * Copyright 2013-2015 Sergey Ignatov, Alexander Zolotov, Florin Patan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.goide.highlighting;

import com.goide.psi.GoCompositeElement;
import com.goide.psi.GoContinueStatement;
import com.goide.psi.GoForStatement;
import com.goide.psi.GoFunctionLit;
import com.goide.quickfix.GoReplaceWithReturnStatementQuickFix;
import com.intellij.lang.annotation.Annotation;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;

public class GoAnnotator implements Annotator {

  @Override
  public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
    if (!(element instanceof GoCompositeElement) || !element.isValid()) {
      return;
    }

    if (element instanceof GoContinueStatement) {
      if (!(PsiTreeUtil.getParentOfType(element, GoForStatement.class, GoFunctionLit.class) instanceof GoForStatement)) {
        Annotation annotation = holder.createErrorAnnotation(element, "Continue statement not inside a for loop.");
        annotation.registerFix(new GoReplaceWithReturnStatementQuickFix(element));
      }
    }
  }
}
