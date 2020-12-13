package org.vadept.language;

import com.intellij.lexer.FlexAdapter;

public class VLangLexerAdapter extends FlexAdapter {

  public VLangLexerAdapter() {
    super(new VLangLexer(null));
  }

}
