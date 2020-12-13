package org.vadept.language;

import com.intellij.lang.Language;

public class VLang extends Language {

  public static final VLang INSTANCE = new VLang();

  private VLang() {
    super("V");
  }

}
