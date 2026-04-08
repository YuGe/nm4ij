package me.yuge.nonmem.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.parser.GeneratedParserUtilBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import me.yuge.nonmem.psi.NonmemTypes;
import org.jetbrains.annotations.NotNull;

public class NonmemParserUtil extends GeneratedParserUtilBase {
    public static boolean anything(PsiBuilder builder, int level, Parser condition) {
        return anything(builder, level, condition, null);
    }

    public static boolean anything(PsiBuilder builder, int level, Parser condition, Parser condition1) {
        int totalCount = 0;
        while (true) {
            if (condition1 != null && totalCount > 0 && !condition1.parse(builder, level + 1)) {
                break;
            }
            if (!condition.parse(builder, level + 1)) {
                break;
            }
            if (!TOKEN_ADVANCER.parse(builder, level + 1)) {
                break;
            }
            totalCount++;
        }
        return totalCount != 0;
    }

    public static boolean isSpace(@NotNull PsiBuilder builder, int level) {
        if (builder.eof()) return true;
        return builder.rawLookup(-1) == TokenType.WHITE_SPACE;
    }

    public static boolean isNewline(@NotNull PsiBuilder builder, int level) {
        if (builder.eof()) return true;
        for (int i = -1; ; i--) {
            IElementType type = builder.rawLookup(i);
            if (type == TokenType.WHITE_SPACE || type == NonmemTypes.COMMENT) {
                continue;
            }
            if (type == null) {
                continue;
            }
            for (int j = builder.rawTokenTypeStart(i + 1); j < builder.rawTokenTypeStart(i + 2); j++) {
                if (builder.getOriginalText().charAt(j) == '\n') {
                    return true;
                }
            }
            return false;
        }
    }

    public static boolean prefixOf(@NotNull PsiBuilder builder, int level, String template) {
        var text = builder.getTokenText();
        return text != null
                && text.length() > 1
                && template.startsWith(text)
                && TOKEN_ADVANCER.parse(builder, level + 1);
    }
}
