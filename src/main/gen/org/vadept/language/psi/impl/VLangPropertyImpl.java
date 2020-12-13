// This is a generated file. Not intended for manual editing.
package org.vadept.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.vadept.language.psi.VLangTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.vadept.language.psi.*;

public class VLangPropertyImpl extends ASTWrapperPsiElement implements VLangProperty {

  public VLangPropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VLangVisitor visitor) {
    visitor.visitProperty(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VLangVisitor) accept((VLangVisitor)visitor);
    else super.accept(visitor);
  }

}
