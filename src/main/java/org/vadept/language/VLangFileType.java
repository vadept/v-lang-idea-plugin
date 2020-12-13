package org.vadept.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import javax.swing.Icon;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class VLangFileType extends LanguageFileType {

  public static final VLangFileType INSTANCE = new VLangFileType();

  private VLangFileType() {
    super(VLang.INSTANCE);
  }

  @NotNull
  @Override
  public String getName() {
    return "V File";
  }

  @NotNull
  @Override
  public String getDescription() {
    return "V language file";
  }

  @NotNull
  @Override
  public String getDefaultExtension() {
    return "v";
  }

  @Nullable
  @Override
  public Icon getIcon() {
    return VLangIcons.FILE;
  }

}
