// This is a generated file. Not intended for manual editing.
package org.vadept.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.vadept.language.psi.impl.*;

public interface VLangTypes {

  IElementType PROPERTY = new VLangElementType("PROPERTY");

  IElementType COMMENT = new VLangTokenType("COMMENT");
  IElementType CRLF = new VLangTokenType("CRLF");
  IElementType KEY = new VLangTokenType("KEY");
  IElementType SEPARATOR = new VLangTokenType("SEPARATOR");
  IElementType VALUE = new VLangTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new VLangPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
