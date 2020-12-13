package org.vadept.language.psi;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.vadept.language.VLang;

public class VLangTokenType extends IElementType {

  public VLangTokenType(@NotNull @NonNls String debugName) {
    super(debugName, VLang.INSTANCE);
  }

  @Override
  public String toString() {
    return "VLangTokenType." + super.toString();
  }

}
