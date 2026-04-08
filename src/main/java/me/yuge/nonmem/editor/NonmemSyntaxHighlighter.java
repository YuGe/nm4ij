package me.yuge.nonmem.editor;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import me.yuge.nonmem.parser.NonmemLexerAdapter;
import me.yuge.nonmem.psi.NonmemTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class NonmemSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey COMMA = createTextAttributesKey("NONMEM_COMMA", DefaultLanguageHighlighterColors.COMMA);
    public static final TextAttributesKey COMMENT = createTextAttributesKey("NONMEM_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey PARENTHESES = createTextAttributesKey("NONMEM_PARENTHESES", DefaultLanguageHighlighterColors.PARENTHESES);
    public static final TextAttributesKey NUMBER = createTextAttributesKey("NONMEM_NUMBER", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey OPERATION = createTextAttributesKey("NONMEM_OPERATION_SIGN", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey STRING = createTextAttributesKey("NONMEM_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey ILLEGAL = createTextAttributesKey("NONMEM_ILLEGAL", DefaultLanguageHighlighterColors.INVALID_STRING_ESCAPE);

    public static final TextAttributesKey RECORD = createTextAttributesKey("NONMEM_RECORD", DefaultLanguageHighlighterColors.FUNCTION_DECLARATION);
    public static final TextAttributesKey INPUT = createTextAttributesKey("NONMEM_INPUT", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey PK = createTextAttributesKey("NONMEM_PK", DefaultLanguageHighlighterColors.METADATA);
    public static final TextAttributesKey ERROR = createTextAttributesKey("NONMEM_ERROR", DefaultLanguageHighlighterColors.METADATA);
    public static final TextAttributesKey CODE_VARIABLE = createTextAttributesKey("NONMEM_CODE_VARIABLE", DefaultLanguageHighlighterColors.FUNCTION_DECLARATION);
    public static final TextAttributesKey CODE_EXPONENTIAL = createTextAttributesKey("NONMEM_CODE_EXPONENTIAL", DefaultLanguageHighlighterColors.KEYWORD);

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new NonmemLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType type) {
        if (type == TokenType.BAD_CHARACTER) {
            return pack(ILLEGAL);
        }
        if (type == NonmemTypes.COMMA) {
            return pack(COMMA);
        }
        if (type == NonmemTypes.DOLLAR) {
            return pack(RECORD);
        }
        if (type == NonmemTypes.COMMENT) {
            return pack(COMMENT);
        }
        if (type == NonmemTypes.STRING) {
            return pack(STRING);
        }
        if (type == NonmemTypes.NUMBER || type == NonmemTypes.DATA_FORMAT || type == NonmemTypes.TABLE_FORMAT) {
            return pack(NUMBER);
        }
        if (type == NonmemTypes.OP_PLUS || type == NonmemTypes.OP_MINUS
                || type == NonmemTypes.OP_MUL || type == NonmemTypes.OP_QUOTIENT
                || type == NonmemTypes.OP_POWER || type == NonmemTypes.OP_ASSIGN) {
            return pack(OPERATION);
        }
        if (type == NonmemTypes.LEFT_PAREN || type == NonmemTypes.RIGHT_PAREN) {
            return pack(PARENTHESES);
        }
        return TextAttributesKey.EMPTY_ARRAY;
    }
}
