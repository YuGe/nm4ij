package me.yuge.nonmem.parser;

import com.intellij.lexer.FlexAdapter;

public class NonmemLexerAdapter extends FlexAdapter {
    public NonmemLexerAdapter() {
        super(new _NonmemLexer(null));
    }
}
