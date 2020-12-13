package org.vadept.language.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;
import org.vadept.language.VLang;
import org.vadept.language.VLangFileType;

public class VLangFile extends PsiFileBase {

  public VLangFile(@NotNull FileViewProvider viewProvider) {
    super(viewProvider, VLang.INSTANCE);
  }

  @NotNull
  @Override
  public FileType getFileType() {
    return VLangFileType.INSTANCE;
  }

  @Override
  public String toString() {
    return "V File";
  }

}
