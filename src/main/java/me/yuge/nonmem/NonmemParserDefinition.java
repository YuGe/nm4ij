package me.yuge.nonmem;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import me.yuge.nonmem.parser.NonmemLexerAdapter;
import me.yuge.nonmem.parser.NonmemParser;
import me.yuge.nonmem.psi.NonmemFile;
import me.yuge.nonmem.psi.NonmemTypes;
import org.jetbrains.annotations.NotNull;

public class NonmemParserDefinition implements ParserDefinition {
    public static final IFileElementType FILE = new IFileElementType(NonmemLanguage.INSTANCE);

    public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
    public static final IElementType COMMENT = NonmemTypes.COMMENT;

    public static final TokenSet COMMENTS = TokenSet.create(COMMENT);

    public static final TokenSet LITERALS = TokenSet.create(NonmemTypes.STRING);
    public static final TokenSet PARENS_L = TokenSet.create(NonmemTypes.LEFT_PAREN);
    public static final TokenSet PARENS_R = TokenSet.create(NonmemTypes.RIGHT_PAREN);
    public static final TokenSet PARENS = TokenSet.andSet(PARENS_L, PARENS_R);
    public static final TokenSet OPERATORS = TokenSet.create(NonmemTypes.OP_ASSIGN,
            NonmemTypes.OP_PLUS, NonmemTypes.OP_MINUS,
            NonmemTypes.OP_MINUS, NonmemTypes.OP_QUOTIENT);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new NonmemLexerAdapter();
    }

    @NotNull
    @Override
    public TokenSet getWhitespaceTokens() {
        return WHITE_SPACES;
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return LITERALS;
    }

    @NotNull
    @Override
    public PsiParser createParser(final Project project) {
        return new NonmemParser();
    }

    @NotNull
    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new NonmemFile(viewProvider);
    }

    @NotNull
    @Override
    public SpaceRequirements spaceExistenceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return NonmemTypes.Factory.createElement(node);
    }
}
