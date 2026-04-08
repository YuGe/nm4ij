// This is a generated file. Not intended for manual editing.
package me.yuge.nonmem.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static me.yuge.nonmem.psi.NonmemTypes.*;
import static me.yuge.nonmem.parser.NonmemParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class NonmemParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return nonmem(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(COVARIANCE_NAMED_PARAM, DATA_NAMED_PARAM, ESTIMATION_NAMED_PARAM, INPUT_NAMED_PARAM,
      SIMULATION_NAMED_PARAM, SIZES_NAMED_PARAM),
    create_token_set_(ABBR_RECORD, COVARIANCE_RECORD, DATA_RECORD, DES_RECORD,
      ERROR_RECORD, ESTIMATION_RECORD, INPUT_RECORD, MODEL_RECORD,
      OMEGA_RECORD, PK_RECORD, PRED_RECORD, PROBLEM_RECORD,
      RECORD, SIGMA_RECORD, SIMULATION_RECORD, SIZES_RECORD,
      SUBROUTINE_RECORD, TABLE_RECORD, THETA_RECORD),
  };

  /* ********************************************************** */
  // abbr_code_if | abbr_code_do_while | abbr_code_equation
  public static boolean abbr_code(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_code")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ABBR_CODE, "<abbr code>");
    r = abbr_code_if(b, l + 1);
    if (!r) r = abbr_code_do_while(b, l + 1);
    if (!r) r = abbr_code_equation(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'DOWHILE' '(' abbr_code_expr ')' (abbr_code_equation | abbr_code_if)+ 'ENDDO'
  public static boolean abbr_code_do_while(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_code_do_while")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ABBR_CODE_DO_WHILE, "<abbr code do while>");
    r = consumeToken(b, "DOWHILE");
    r = r && consumeToken(b, LEFT_PAREN);
    r = r && abbr_code_expr(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    r = r && abbr_code_do_while_4(b, l + 1);
    r = r && consumeToken(b, "ENDDO");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (abbr_code_equation | abbr_code_if)+
  private static boolean abbr_code_do_while_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_code_do_while_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = abbr_code_do_while_4_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!abbr_code_do_while_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "abbr_code_do_while_4", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // abbr_code_equation | abbr_code_if
  private static boolean abbr_code_do_while_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_code_do_while_4_0")) return false;
    boolean r;
    r = abbr_code_equation(b, l + 1);
    if (!r) r = abbr_code_if(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // abbr_code_primary '=' abbr_code_expr
  public static boolean abbr_code_equation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_code_equation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ABBR_CODE_EQUATION, "<abbr code equation>");
    r = abbr_code_primary(b, l + 1);
    r = r && consumeToken(b, OP_ASSIGN);
    r = r && abbr_code_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // abbr_code_plus_factor abbr_code_logic_expr *
  static boolean abbr_code_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_code_expr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = abbr_code_plus_factor(b, l + 1);
    r = r && abbr_code_expr_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // abbr_code_logic_expr *
  private static boolean abbr_code_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_code_expr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!abbr_code_logic_expr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "abbr_code_expr_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ('DEXP' | 'EXP' | 'SQRT' | 'LOG' | 'ABS' | 'SIN' | id) '(' abbr_code_expr ')'
  public static boolean abbr_code_function(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_code_function")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ABBR_CODE_FUNCTION, "<abbr code function>");
    r = abbr_code_function_0(b, l + 1);
    r = r && consumeToken(b, LEFT_PAREN);
    r = r && abbr_code_expr(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'DEXP' | 'EXP' | 'SQRT' | 'LOG' | 'ABS' | 'SIN' | id
  private static boolean abbr_code_function_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_code_function_0")) return false;
    boolean r;
    r = consumeToken(b, "DEXP");
    if (!r) r = consumeToken(b, "EXP");
    if (!r) r = consumeToken(b, "SQRT");
    if (!r) r = consumeToken(b, "LOG");
    if (!r) r = consumeToken(b, "ABS");
    if (!r) r = consumeToken(b, "SIN");
    if (!r) r = consumeToken(b, ID);
    return r;
  }

  /* ********************************************************** */
  // 'IF' '(' abbr_code_expr ')' ('THEN' ('ELSE' | abbr_code_equation)+ 'ENDIF')?
  public static boolean abbr_code_if(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_code_if")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ABBR_CODE_IF, "<abbr code if>");
    r = consumeToken(b, "IF");
    r = r && consumeToken(b, LEFT_PAREN);
    r = r && abbr_code_expr(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    r = r && abbr_code_if_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('THEN' ('ELSE' | abbr_code_equation)+ 'ENDIF')?
  private static boolean abbr_code_if_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_code_if_4")) return false;
    abbr_code_if_4_0(b, l + 1);
    return true;
  }

  // 'THEN' ('ELSE' | abbr_code_equation)+ 'ENDIF'
  private static boolean abbr_code_if_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_code_if_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "THEN");
    r = r && abbr_code_if_4_0_1(b, l + 1);
    r = r && consumeToken(b, "ENDIF");
    exit_section_(b, m, null, r);
    return r;
  }

  // ('ELSE' | abbr_code_equation)+
  private static boolean abbr_code_if_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_code_if_4_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = abbr_code_if_4_0_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!abbr_code_if_4_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "abbr_code_if_4_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // 'ELSE' | abbr_code_equation
  private static boolean abbr_code_if_4_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_code_if_4_0_1_0")) return false;
    boolean r;
    r = consumeToken(b, "ELSE");
    if (!r) r = abbr_code_equation(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // number
  public static boolean abbr_code_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_code_literal")) return false;
    if (!nextTokenIs(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUMBER);
    exit_section_(b, m, ABBR_CODE_LITERAL, r);
    return r;
  }

  /* ********************************************************** */
  // abbr_code_logic_op abbr_code_plus_factor
  public static boolean abbr_code_logic_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_code_logic_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ABBR_CODE_LOGIC_EXPR, "<abbr code logic expr>");
    r = abbr_code_logic_op(b, l + 1);
    r = r && abbr_code_plus_factor(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '.EQ.' | '.NE.' | '.LE.' | '.GE.' | '.LT.' | '.GT.' | '.AND.' | '.OR.' | '<=' | '>=' | '<' | '>'
  static boolean abbr_code_logic_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_code_logic_op")) return false;
    boolean r;
    r = consumeToken(b, ".EQ.");
    if (!r) r = consumeToken(b, ".NE.");
    if (!r) r = consumeToken(b, ".LE.");
    if (!r) r = consumeToken(b, ".GE.");
    if (!r) r = consumeToken(b, ".LT.");
    if (!r) r = consumeToken(b, ".GT.");
    if (!r) r = consumeToken(b, ".AND.");
    if (!r) r = consumeToken(b, ".OR.");
    if (!r) r = consumeToken(b, "<=");
    if (!r) r = consumeToken(b, ">=");
    if (!r) r = consumeToken(b, "<");
    if (!r) r = consumeToken(b, ">");
    return r;
  }

  /* ********************************************************** */
  // abbr_code_mul_op abbr_code_primary
  public static boolean abbr_code_mul_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_code_mul_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, ABBR_CODE_MUL_EXPR, "<abbr code mul expr>");
    r = abbr_code_mul_op(b, l + 1);
    r = r && abbr_code_primary(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // abbr_code_primary abbr_code_mul_expr *
  static boolean abbr_code_mul_factor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_code_mul_factor")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = abbr_code_primary(b, l + 1);
    r = r && abbr_code_mul_factor_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // abbr_code_mul_expr *
  private static boolean abbr_code_mul_factor_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_code_mul_factor_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!abbr_code_mul_expr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "abbr_code_mul_factor_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // '*' | '/' | '**'
  static boolean abbr_code_mul_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_code_mul_op")) return false;
    boolean r;
    r = consumeToken(b, OP_MUL);
    if (!r) r = consumeToken(b, OP_QUOTIENT);
    if (!r) r = consumeToken(b, OP_POWER);
    return r;
  }

  /* ********************************************************** */
  // '(' abbr_code_expr ')'
  public static boolean abbr_code_parenthesis(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_code_parenthesis")) return false;
    if (!nextTokenIs(b, LEFT_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PAREN);
    r = r && abbr_code_expr(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, ABBR_CODE_PARENTHESIS, r);
    return r;
  }

  /* ********************************************************** */
  // abbr_code_plus_op abbr_code_mul_factor
  public static boolean abbr_code_plus_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_code_plus_expr")) return false;
    if (!nextTokenIs(b, "<abbr code plus expr>", OP_MINUS, OP_PLUS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, ABBR_CODE_PLUS_EXPR, "<abbr code plus expr>");
    r = abbr_code_plus_op(b, l + 1);
    r = r && abbr_code_mul_factor(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // abbr_code_mul_factor abbr_code_plus_expr *
  static boolean abbr_code_plus_factor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_code_plus_factor")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = abbr_code_mul_factor(b, l + 1);
    r = r && abbr_code_plus_factor_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // abbr_code_plus_expr *
  private static boolean abbr_code_plus_factor_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_code_plus_factor_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!abbr_code_plus_expr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "abbr_code_plus_factor_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // '+'|'-'
  static boolean abbr_code_plus_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_code_plus_op")) return false;
    if (!nextTokenIs(b, "", OP_MINUS, OP_PLUS)) return false;
    boolean r;
    r = consumeToken(b, OP_PLUS);
    if (!r) r = consumeToken(b, OP_MINUS);
    return r;
  }

  /* ********************************************************** */
  // abbr_code_variable | abbr_code_function | abbr_code_parenthesis | abbr_code_literal | abbr_code_reference
  static boolean abbr_code_primary(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_code_primary")) return false;
    boolean r;
    r = abbr_code_variable(b, l + 1);
    if (!r) r = abbr_code_function(b, l + 1);
    if (!r) r = abbr_code_parenthesis(b, l + 1);
    if (!r) r = abbr_code_literal(b, l + 1);
    if (!r) r = abbr_code_reference(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // '-'? (pk_reserved_param | error_reserved_param | id)
  public static boolean abbr_code_reference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_code_reference")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ABBR_CODE_REFERENCE, "<abbr code reference>");
    r = abbr_code_reference_0(b, l + 1);
    r = r && abbr_code_reference_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '-'?
  private static boolean abbr_code_reference_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_code_reference_0")) return false;
    consumeToken(b, OP_MINUS);
    return true;
  }

  // pk_reserved_param | error_reserved_param | id
  private static boolean abbr_code_reference_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_code_reference_1")) return false;
    boolean r;
    r = pk_reserved_param(b, l + 1);
    if (!r) r = error_reserved_param(b, l + 1);
    if (!r) r = consumeToken(b, ID);
    return r;
  }

  /* ********************************************************** */
  // ('THETA' | 'ETA' | 'EPS' | 'DADT' | 'ERR' | 'A' | 'A_0') '(' number ')'
  public static boolean abbr_code_variable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_code_variable")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ABBR_CODE_VARIABLE, "<abbr code variable>");
    r = abbr_code_variable_0(b, l + 1);
    r = r && consumeTokens(b, 0, LEFT_PAREN, NUMBER, RIGHT_PAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'THETA' | 'ETA' | 'EPS' | 'DADT' | 'ERR' | 'A' | 'A_0'
  private static boolean abbr_code_variable_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_code_variable_0")) return false;
    boolean r;
    r = consumeToken(b, "THETA");
    if (!r) r = consumeToken(b, "ETA");
    if (!r) r = consumeToken(b, "EPS");
    if (!r) r = consumeToken(b, "DADT");
    if (!r) r = consumeToken(b, "ERR");
    if (!r) r = consumeToken(b, "A");
    if (!r) r = consumeToken(b, "A_0");
    return r;
  }

  /* ********************************************************** */
  // ('DERIV2' '=' ('NO' | 'NOCOMMON')) | ('COMRES' '=' number) | ( 'DECLARE' 'DOWHILE'? id ('(' number ')')?)
  public static boolean abbr_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_param")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ABBR_PARAM, "<abbr param>");
    r = abbr_param_0(b, l + 1);
    if (!r) r = abbr_param_1(b, l + 1);
    if (!r) r = abbr_param_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'DERIV2' '=' ('NO' | 'NOCOMMON')
  private static boolean abbr_param_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_param_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "DERIV2");
    r = r && consumeToken(b, OP_ASSIGN);
    r = r && abbr_param_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'NO' | 'NOCOMMON'
  private static boolean abbr_param_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_param_0_2")) return false;
    boolean r;
    r = consumeToken(b, "NO");
    if (!r) r = consumeToken(b, "NOCOMMON");
    return r;
  }

  // 'COMRES' '=' number
  private static boolean abbr_param_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_param_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "COMRES");
    r = r && consumeTokens(b, 0, OP_ASSIGN, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'DECLARE' 'DOWHILE'? id ('(' number ')')?
  private static boolean abbr_param_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_param_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "DECLARE");
    r = r && abbr_param_2_1(b, l + 1);
    r = r && consumeToken(b, ID);
    r = r && abbr_param_2_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'DOWHILE'?
  private static boolean abbr_param_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_param_2_1")) return false;
    consumeToken(b, "DOWHILE");
    return true;
  }

  // ('(' number ')')?
  private static boolean abbr_param_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_param_2_3")) return false;
    abbr_param_2_3_0(b, l + 1);
    return true;
  }

  // '(' number ')'
  private static boolean abbr_param_2_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_param_2_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LEFT_PAREN, NUMBER, RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // << prefixOf "ABBR" >> abbr_param*
  public static boolean abbr_record(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_record")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, ABBR_RECORD, "<abbr record>");
    r = prefixOf(b, l + 1, "ABBR");
    r = r && abbr_record_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // abbr_param*
  private static boolean abbr_record_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_record_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!abbr_param(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "abbr_record_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // 'PRINT' | 'MATRIX'
  static boolean covariance_chr_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "covariance_chr_param")) return false;
    boolean r;
    r = consumeToken(b, "PRINT");
    if (!r) r = consumeToken(b, "MATRIX");
    return r;
  }

  /* ********************************************************** */
  // 'TOL' | 'ATOL'
  static boolean covariance_int_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "covariance_int_param")) return false;
    boolean r;
    r = consumeToken(b, "TOL");
    if (!r) r = consumeToken(b, "ATOL");
    return r;
  }

  /* ********************************************************** */
  // (covariance_int_param '=' number) | (covariance_chr_param '=' id)
  public static boolean covariance_named_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "covariance_named_param")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COVARIANCE_NAMED_PARAM, "<covariance named param>");
    r = covariance_named_param_0(b, l + 1);
    if (!r) r = covariance_named_param_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // covariance_int_param '=' number
  private static boolean covariance_named_param_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "covariance_named_param_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = covariance_int_param(b, l + 1);
    r = r && consumeTokens(b, 0, OP_ASSIGN, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  // covariance_chr_param '=' id
  private static boolean covariance_named_param_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "covariance_named_param_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = covariance_chr_param(b, l + 1);
    r = r && consumeTokens(b, 0, OP_ASSIGN, ID);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'SPECIAL' | 'RESUME' | 'UNCONDITIONAL'
  public static boolean covariance_option_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "covariance_option_param")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COVARIANCE_OPTION_PARAM, "<covariance option param>");
    r = consumeToken(b, "SPECIAL");
    if (!r) r = consumeToken(b, "RESUME");
    if (!r) r = consumeToken(b, "UNCONDITIONAL");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // covariance_option_param | covariance_named_param
  static boolean covariance_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "covariance_param")) return false;
    boolean r;
    r = covariance_option_param(b, l + 1);
    if (!r) r = covariance_named_param(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // << prefixOf "COVARIANCE" >> covariance_param *
  public static boolean covariance_record(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "covariance_record")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, COVARIANCE_RECORD, "<covariance record>");
    r = prefixOf(b, l + 1, "COVARIANCE");
    r = r && covariance_record_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // covariance_param *
  private static boolean covariance_record_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "covariance_record_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!covariance_param(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "covariance_record_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // 'IGNORE' | 'ACCEPT'
  static boolean data_char_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_char_param")) return false;
    boolean r;
    r = consumeToken(b, "IGNORE");
    if (!r) r = consumeToken(b, "ACCEPT");
    return r;
  }

  /* ********************************************************** */
  // file_param | '*'
  public static boolean data_file_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_file_param")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DATA_FILE_PARAM, "<data file param>");
    r = file_param(b, l + 1);
    if (!r) r = consumeToken(b, OP_MUL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '(' data_format ')'
  public static boolean data_format_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_format_param")) return false;
    if (!nextTokenIs(b, LEFT_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LEFT_PAREN, DATA_FORMAT, RIGHT_PAREN);
    exit_section_(b, m, DATA_FORMAT_PARAM, r);
    return r;
  }

  /* ********************************************************** */
  // (pk_reserved_param | id) abbr_code_logic_op number
  static boolean data_logic_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_logic_item")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = data_logic_item_0(b, l + 1);
    r = r && abbr_code_logic_op(b, l + 1);
    r = r && consumeToken(b, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  // pk_reserved_param | id
  private static boolean data_logic_item_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_logic_item_0")) return false;
    boolean r;
    r = pk_reserved_param(b, l + 1);
    if (!r) r = consumeToken(b, ID);
    return r;
  }

  /* ********************************************************** */
  // '(' data_logic_item (',' data_logic_item)* ')'
  static boolean data_logic_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_logic_param")) return false;
    if (!nextTokenIs(b, LEFT_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PAREN);
    r = r && data_logic_item(b, l + 1);
    r = r && data_logic_param_2(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' data_logic_item)*
  private static boolean data_logic_param_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_logic_param_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!data_logic_param_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "data_logic_param_2", c)) break;
    }
    return true;
  }

  // ',' data_logic_item
  private static boolean data_logic_param_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_logic_param_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && data_logic_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // data_char_param '=' (id | '@' | data_logic_param)
  public static boolean data_named_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_named_param")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DATA_NAMED_PARAM, "<data named param>");
    r = data_char_param(b, l + 1);
    r = r && consumeToken(b, OP_ASSIGN);
    r = r && data_named_param_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // id | '@' | data_logic_param
  private static boolean data_named_param_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_named_param_2")) return false;
    boolean r;
    r = consumeToken(b, ID);
    if (!r) r = consumeToken(b, "@");
    if (!r) r = data_logic_param(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // << prefixOf "DATA" >> data_file_param data_format_param? data_named_param*
  public static boolean data_record(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_record")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DATA_RECORD, "<data record>");
    r = prefixOf(b, l + 1, "DATA");
    r = r && data_file_param(b, l + 1);
    r = r && data_record_2(b, l + 1);
    r = r && data_record_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // data_format_param?
  private static boolean data_record_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_record_2")) return false;
    data_format_param(b, l + 1);
    return true;
  }

  // data_named_param*
  private static boolean data_record_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_record_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!data_named_param(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "data_record_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // << prefixOf "DES" >> abbr_code +
  public static boolean des_record(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "des_record")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DES_RECORD, "<des record>");
    r = prefixOf(b, l + 1, "DES");
    r = r && des_record_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // abbr_code +
  private static boolean des_record_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "des_record_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = abbr_code(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!abbr_code(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "des_record_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // << prefixOf "ERROR" >> abbr_code +
  public static boolean error_record(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "error_record")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ERROR_RECORD, "<error record>");
    r = prefixOf(b, l + 1, "ERROR");
    r = r && error_record_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // abbr_code +
  private static boolean error_record_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "error_record_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = abbr_code(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!abbr_code(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "error_record_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'F' | 'Y' | 'PRED' | 'IPRED' | 'CIPRED' | 'RES' | 'IRES' | 'CWRES' | 'IWRES' | 'CIWRES' | 'WRES'
  public static boolean error_reserved_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "error_reserved_param")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ERROR_RESERVED_PARAM, "<error reserved param>");
    r = consumeToken(b, "F");
    if (!r) r = consumeToken(b, "Y");
    if (!r) r = consumeToken(b, "PRED");
    if (!r) r = consumeToken(b, "IPRED");
    if (!r) r = consumeToken(b, "CIPRED");
    if (!r) r = consumeToken(b, "RES");
    if (!r) r = consumeToken(b, "IRES");
    if (!r) r = consumeToken(b, "CWRES");
    if (!r) r = consumeToken(b, "IWRES");
    if (!r) r = consumeToken(b, "CIWRES");
    if (!r) r = consumeToken(b, "WRES");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // << prefixOf "METHOD" >> | <<prefixOf "MAXEVALS" >> | 'PRINT' | 'NSIG' | 'SIGL' | 'MCETA'
  static boolean estimation_int_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "estimation_int_param")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = prefixOf(b, l + 1, "METHOD");
    if (!r) r = prefixOf(b, l + 1, "MAXEVALS");
    if (!r) r = consumeToken(b, "PRINT");
    if (!r) r = consumeToken(b, "NSIG");
    if (!r) r = consumeToken(b, "SIGL");
    if (!r) r = consumeToken(b, "MCETA");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // estimation_int_param '=' number
  public static boolean estimation_named_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "estimation_named_param")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ESTIMATION_NAMED_PARAM, "<estimation named param>");
    r = estimation_int_param(b, l + 1);
    r = r && consumeTokens(b, 0, OP_ASSIGN, NUMBER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'INTER' | 'POSTHOC' | 'NOABORT' | 'LIKE' | 'LAPLACE'
  public static boolean estimation_option_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "estimation_option_param")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ESTIMATION_OPTION_PARAM, "<estimation option param>");
    r = consumeToken(b, "INTER");
    if (!r) r = consumeToken(b, "POSTHOC");
    if (!r) r = consumeToken(b, "NOABORT");
    if (!r) r = consumeToken(b, "LIKE");
    if (!r) r = consumeToken(b, "LAPLACE");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // estimation_option_param | estimation_named_param
  static boolean estimation_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "estimation_param")) return false;
    boolean r;
    r = estimation_option_param(b, l + 1);
    if (!r) r = estimation_named_param(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // << prefixOf "ESTIMATION" >> estimation_param *
  public static boolean estimation_record(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "estimation_record")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, ESTIMATION_RECORD, "<estimation record>");
    r = prefixOf(b, l + 1, "ESTIMATION");
    r = r && estimation_record_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // estimation_param *
  private static boolean estimation_record_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "estimation_record_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!estimation_param(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "estimation_record_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // string | <<anything !(newline | '(' | ')' | ',' | ';' | ) !space>>
  public static boolean file_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_param")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FILE_PARAM, "<file param>");
    r = consumeToken(b, STRING);
    if (!r) r = anything(b, l + 1, NonmemParser::file_param_1_0, NonmemParser::file_param_1_1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // !(newline | '(' | ')' | ',' | ';' | )
  private static boolean file_param_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_param_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !file_param_1_0_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // newline | '(' | ')' | ',' | ';' | 
  private static boolean file_param_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_param_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = newline(b, l + 1);
    if (!r) r = consumeToken(b, LEFT_PAREN);
    if (!r) r = consumeToken(b, RIGHT_PAREN);
    if (!r) r = consumeToken(b, COMMA);
    if (!r) r = consumeToken(b, ";");
    if (!r) r = consumeToken(b, FILE_PARAM_1_0_0_5_0);
    exit_section_(b, m, null, r);
    return r;
  }

  // !space
  private static boolean file_param_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_param_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !space(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // << prefixOf "FIXED" >>
  static boolean fixed(PsiBuilder b, int l) {
    return prefixOf(b, l + 1, "FIXED");
  }

  /* ********************************************************** */
  // (number fixed?) | ('(' number (',' number)* fixed? ')' fixed?)
  public static boolean initial_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initial_value")) return false;
    if (!nextTokenIs(b, "<initial value>", LEFT_PAREN, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INITIAL_VALUE, "<initial value>");
    r = initial_value_0(b, l + 1);
    if (!r) r = initial_value_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // number fixed?
  private static boolean initial_value_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initial_value_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUMBER);
    r = r && initial_value_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // fixed?
  private static boolean initial_value_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initial_value_0_1")) return false;
    fixed(b, l + 1);
    return true;
  }

  // '(' number (',' number)* fixed? ')' fixed?
  private static boolean initial_value_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initial_value_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LEFT_PAREN, NUMBER);
    r = r && initial_value_1_2(b, l + 1);
    r = r && initial_value_1_3(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    r = r && initial_value_1_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' number)*
  private static boolean initial_value_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initial_value_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!initial_value_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "initial_value_1_2", c)) break;
    }
    return true;
  }

  // ',' number
  private static boolean initial_value_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initial_value_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  // fixed?
  private static boolean initial_value_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initial_value_1_3")) return false;
    fixed(b, l + 1);
    return true;
  }

  // fixed?
  private static boolean initial_value_1_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initial_value_1_5")) return false;
    fixed(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (input_reserved_param | id) ('=' (id | 'DROP'))?
  public static boolean input_named_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "input_named_param")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INPUT_NAMED_PARAM, "<input named param>");
    r = input_named_param_0(b, l + 1);
    r = r && input_named_param_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // input_reserved_param | id
  private static boolean input_named_param_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "input_named_param_0")) return false;
    boolean r;
    r = input_reserved_param(b, l + 1);
    if (!r) r = consumeToken(b, ID);
    return r;
  }

  // ('=' (id | 'DROP'))?
  private static boolean input_named_param_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "input_named_param_1")) return false;
    input_named_param_1_0(b, l + 1);
    return true;
  }

  // '=' (id | 'DROP')
  private static boolean input_named_param_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "input_named_param_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_ASSIGN);
    r = r && input_named_param_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // id | 'DROP'
  private static boolean input_named_param_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "input_named_param_1_0_1")) return false;
    boolean r;
    r = consumeToken(b, ID);
    if (!r) r = consumeToken(b, "DROP");
    return r;
  }

  /* ********************************************************** */
  // << prefixOf "INPUT" >> (input_named_param) +
  public static boolean input_record(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "input_record")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INPUT_RECORD, "<input record>");
    r = prefixOf(b, l + 1, "INPUT");
    r = r && input_record_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (input_named_param) +
  private static boolean input_record_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "input_record_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = input_record_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!input_record_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "input_record_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // (input_named_param)
  private static boolean input_record_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "input_record_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = input_named_param(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'ID' | 'DV' | 'MDV' | 'TIME' | 'DATE' | 'AMT' | 'RATE' | 'EVID' | 'CMT' | 'II' | 'ADDL'
  public static boolean input_reserved_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "input_reserved_param")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INPUT_RESERVED_PARAM, "<input reserved param>");
    r = consumeToken(b, "ID");
    if (!r) r = consumeToken(b, "DV");
    if (!r) r = consumeToken(b, "MDV");
    if (!r) r = consumeToken(b, "TIME");
    if (!r) r = consumeToken(b, "DATE");
    if (!r) r = consumeToken(b, "AMT");
    if (!r) r = consumeToken(b, "RATE");
    if (!r) r = consumeToken(b, "EVID");
    if (!r) r = consumeToken(b, "CMT");
    if (!r) r = consumeToken(b, "II");
    if (!r) r = consumeToken(b, "ADDL");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (<< prefixOf "COMPARTMENT" >> '=' '(' id (','? id)* ')')+
  public static boolean model_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "model_param")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODEL_PARAM, "<model param>");
    r = model_param_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!model_param_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "model_param", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // << prefixOf "COMPARTMENT" >> '=' '(' id (','? id)* ')'
  private static boolean model_param_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "model_param_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = prefixOf(b, l + 1, "COMPARTMENT");
    r = r && consumeTokens(b, 0, OP_ASSIGN, LEFT_PAREN, ID);
    r = r && model_param_0_4(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // (','? id)*
  private static boolean model_param_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "model_param_0_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!model_param_0_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "model_param_0_4", c)) break;
    }
    return true;
  }

  // ','? id
  private static boolean model_param_0_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "model_param_0_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = model_param_0_4_0_0(b, l + 1);
    r = r && consumeToken(b, ID);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean model_param_0_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "model_param_0_4_0_0")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // << prefixOf "MODEL" >> model_param*
  public static boolean model_record(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "model_record")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, MODEL_RECORD, "<model record>");
    r = prefixOf(b, l + 1, "MODEL");
    r = r && model_record_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // model_param*
  private static boolean model_record_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "model_record_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!model_param(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "model_record_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // &<<isNewline>>
  static boolean newline(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "newline")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = isNewline(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // nonmem_record *
  static boolean nonmem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nonmem")) return false;
    while (true) {
      int c = current_position_(b);
      if (!nonmem_record(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "nonmem", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // !<<eof>> '$' record
  static boolean nonmem_record(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nonmem_record")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = nonmem_record_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, DOLLAR));
    r = p && record(b, l + 1) && r;
    exit_section_(b, l, m, r, p, NonmemParser::nonmem_record_recover);
    return r || p;
  }

  // !<<eof>>
  private static boolean nonmem_record_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nonmem_record_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !eof(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // !('$')
  static boolean nonmem_record_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nonmem_record_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, DOLLAR);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ('DIAGONAL' | 'BLOCK') '(' number ')'
  public static boolean omega_int_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "omega_int_param")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OMEGA_INT_PARAM, "<omega int param>");
    r = omega_int_param_0(b, l + 1);
    r = r && consumeTokens(b, 0, LEFT_PAREN, NUMBER, RIGHT_PAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'DIAGONAL' | 'BLOCK'
  private static boolean omega_int_param_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "omega_int_param_0")) return false;
    boolean r;
    r = consumeToken(b, "DIAGONAL");
    if (!r) r = consumeToken(b, "BLOCK");
    return r;
  }

  /* ********************************************************** */
  // 'SAME' | ( 'VARIANCE' | 'STANDARD' ) | ( 'COVARIANCE' | 'CORRELATON' ) | 'CHOLESKY'
  public static boolean omega_option_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "omega_option_param")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OMEGA_OPTION_PARAM, "<omega option param>");
    r = consumeToken(b, "SAME");
    if (!r) r = omega_option_param_1(b, l + 1);
    if (!r) r = omega_option_param_2(b, l + 1);
    if (!r) r = consumeToken(b, "CHOLESKY");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'VARIANCE' | 'STANDARD'
  private static boolean omega_option_param_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "omega_option_param_1")) return false;
    boolean r;
    r = consumeToken(b, "VARIANCE");
    if (!r) r = consumeToken(b, "STANDARD");
    return r;
  }

  // 'COVARIANCE' | 'CORRELATON'
  private static boolean omega_option_param_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "omega_option_param_2")) return false;
    boolean r;
    r = consumeToken(b, "COVARIANCE");
    if (!r) r = consumeToken(b, "CORRELATON");
    return r;
  }

  /* ********************************************************** */
  // << prefixOf  "OMEGA" >> omega_int_param? omega_option_param? initial_value*
  public static boolean omega_record(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "omega_record")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, OMEGA_RECORD, "<omega record>");
    r = prefixOf(b, l + 1, "OMEGA");
    r = r && omega_record_1(b, l + 1);
    r = r && omega_record_2(b, l + 1);
    r = r && omega_record_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // omega_int_param?
  private static boolean omega_record_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "omega_record_1")) return false;
    omega_int_param(b, l + 1);
    return true;
  }

  // omega_option_param?
  private static boolean omega_record_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "omega_record_2")) return false;
    omega_option_param(b, l + 1);
    return true;
  }

  // initial_value*
  private static boolean omega_record_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "omega_record_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!initial_value(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "omega_record_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // << prefixOf "PK" >> abbr_code +
  public static boolean pk_record(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pk_record")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PK_RECORD, "<pk record>");
    r = prefixOf(b, l + 1, "PK");
    r = r && pk_record_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // abbr_code +
  private static boolean pk_record_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pk_record_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = abbr_code(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!abbr_code(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "pk_record_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'KA' | 'CL' | 'V' | 'S1' | 'S2' | 'S3' | 'V1' | 'V2' | 'V3' | 'Q' | 'Q1' | 'Q2' | 'Q3' | 'ALAG1' | 'ALAG2' | 'ALAG3'
  public static boolean pk_reserved_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pk_reserved_param")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PK_RESERVED_PARAM, "<pk reserved param>");
    r = consumeToken(b, "KA");
    if (!r) r = consumeToken(b, "CL");
    if (!r) r = consumeToken(b, "V");
    if (!r) r = consumeToken(b, "S1");
    if (!r) r = consumeToken(b, "S2");
    if (!r) r = consumeToken(b, "S3");
    if (!r) r = consumeToken(b, "V1");
    if (!r) r = consumeToken(b, "V2");
    if (!r) r = consumeToken(b, "V3");
    if (!r) r = consumeToken(b, "Q");
    if (!r) r = consumeToken(b, "Q1");
    if (!r) r = consumeToken(b, "Q2");
    if (!r) r = consumeToken(b, "Q3");
    if (!r) r = consumeToken(b, "ALAG1");
    if (!r) r = consumeToken(b, "ALAG2");
    if (!r) r = consumeToken(b, "ALAG3");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // << prefixOf "PRED" >> abbr_code +
  public static boolean pred_record(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pred_record")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRED_RECORD, "<pred record>");
    r = prefixOf(b, l + 1, "PRED");
    r = r && pred_record_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // abbr_code +
  private static boolean pred_record_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pred_record_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = abbr_code(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!abbr_code(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "pred_record_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<anything !newline>>
  public static boolean problem_option_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "problem_option_param")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROBLEM_OPTION_PARAM, "<problem option param>");
    r = anything(b, l + 1, NonmemParser::problem_option_param_0_0);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // !newline
  private static boolean problem_option_param_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "problem_option_param_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !newline(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // << prefixOf "PROBLEM" >> problem_option_param?
  public static boolean problem_record(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "problem_record")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, PROBLEM_RECORD, "<problem record>");
    r = prefixOf(b, l + 1, "PROBLEM");
    r = r && problem_record_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // problem_option_param?
  private static boolean problem_record_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "problem_record_1")) return false;
    problem_option_param(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // sizes_record | problem_record | data_record | input_record |
  //     subroutine_record | model_record  | abbr_record | pk_record | des_record |
  //     pred_record | error_record | theta_record | omega_record | sigma_record |
  //     estimation_record | covariance_record | simulation_record | table_record
  public static boolean record(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, RECORD, "<record>");
    r = sizes_record(b, l + 1);
    if (!r) r = problem_record(b, l + 1);
    if (!r) r = data_record(b, l + 1);
    if (!r) r = input_record(b, l + 1);
    if (!r) r = subroutine_record(b, l + 1);
    if (!r) r = model_record(b, l + 1);
    if (!r) r = abbr_record(b, l + 1);
    if (!r) r = pk_record(b, l + 1);
    if (!r) r = des_record(b, l + 1);
    if (!r) r = pred_record(b, l + 1);
    if (!r) r = error_record(b, l + 1);
    if (!r) r = theta_record(b, l + 1);
    if (!r) r = omega_record(b, l + 1);
    if (!r) r = sigma_record(b, l + 1);
    if (!r) r = estimation_record(b, l + 1);
    if (!r) r = covariance_record(b, l + 1);
    if (!r) r = simulation_record(b, l + 1);
    if (!r) r = table_record(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // << prefixOf "SIGMA" >> initial_value *
  public static boolean sigma_record(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sigma_record")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, SIGMA_RECORD, "<sigma record>");
    r = prefixOf(b, l + 1, "SIGMA");
    r = r && sigma_record_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // initial_value *
  private static boolean sigma_record_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sigma_record_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!initial_value(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "sigma_record_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // 'SUBPROBLEMS' '=' number
  public static boolean simulation_named_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simulation_named_param")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMULATION_NAMED_PARAM, "<simulation named param>");
    r = consumeToken(b, "SUBPROBLEMS");
    r = r && consumeTokens(b, 0, OP_ASSIGN, NUMBER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // << prefixOf "ONLYSIMULATION" >>
  public static boolean simulation_option_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simulation_option_param")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMULATION_OPTION_PARAM, "<simulation option param>");
    r = prefixOf(b, l + 1, "ONLYSIMULATION");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // simulation_seed_param | simulation_option_param | simulation_named_param
  public static boolean simulation_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simulation_param")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMULATION_PARAM, "<simulation param>");
    r = simulation_seed_param(b, l + 1);
    if (!r) r = simulation_option_param(b, l + 1);
    if (!r) r = simulation_named_param(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // << prefixOf "SIMULATION" >> simulation_param *
  public static boolean simulation_record(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simulation_record")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, SIMULATION_RECORD, "<simulation record>");
    r = prefixOf(b, l + 1, "SIMULATION");
    r = r && simulation_record_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // simulation_param *
  private static boolean simulation_record_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simulation_record_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!simulation_param(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "simulation_record_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // '(' number number? ')'
  public static boolean simulation_seed_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simulation_seed_param")) return false;
    if (!nextTokenIs(b, LEFT_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LEFT_PAREN, NUMBER);
    r = r && simulation_seed_param_2(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, SIMULATION_SEED_PARAM, r);
    return r;
  }

  // number?
  private static boolean simulation_seed_param_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simulation_seed_param_2")) return false;
    consumeToken(b, NUMBER);
    return true;
  }

  /* ********************************************************** */
  // 'LTH' | 'LVR' | 'LVR2' | 'NO' | 'MMX' | 'LNP4' | 'LSUPP' | 'LIM7' | 'LWS3' | 'MAXIDS' | 'LIM1' | 'LIM2' | 'LIM3' | 'LIM4' | 'LIM5' | 'LIM6' | 'LIM8' | 'LIM11' | 'LIM13' | 'LIM15' | 'LIM16' | 'MAXRECID' | 'PC' | 'PCT' | 'PIR' | 'PD' | 'PDT' | 'PAL' | 'MAXFCN' | 'DIMTMP' | 'DIMCNS' | 'DIMNEW' | 'DIMVRB' | 'PL' | 'NPOPMIXMAX' | 'MAXOMEG' | 'MAXPTHETA' | 'MAXITER' | 'ISAMPLEMAX' | 'MAXSIDL' | 'PNM_MAXNODES'
  static boolean sizes_int_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sizes_int_param")) return false;
    boolean r;
    r = consumeToken(b, "LTH");
    if (!r) r = consumeToken(b, "LVR");
    if (!r) r = consumeToken(b, "LVR2");
    if (!r) r = consumeToken(b, "NO");
    if (!r) r = consumeToken(b, "MMX");
    if (!r) r = consumeToken(b, "LNP4");
    if (!r) r = consumeToken(b, "LSUPP");
    if (!r) r = consumeToken(b, "LIM7");
    if (!r) r = consumeToken(b, "LWS3");
    if (!r) r = consumeToken(b, "MAXIDS");
    if (!r) r = consumeToken(b, "LIM1");
    if (!r) r = consumeToken(b, "LIM2");
    if (!r) r = consumeToken(b, "LIM3");
    if (!r) r = consumeToken(b, "LIM4");
    if (!r) r = consumeToken(b, "LIM5");
    if (!r) r = consumeToken(b, "LIM6");
    if (!r) r = consumeToken(b, "LIM8");
    if (!r) r = consumeToken(b, "LIM11");
    if (!r) r = consumeToken(b, "LIM13");
    if (!r) r = consumeToken(b, "LIM15");
    if (!r) r = consumeToken(b, "LIM16");
    if (!r) r = consumeToken(b, "MAXRECID");
    if (!r) r = consumeToken(b, "PC");
    if (!r) r = consumeToken(b, "PCT");
    if (!r) r = consumeToken(b, "PIR");
    if (!r) r = consumeToken(b, "PD");
    if (!r) r = consumeToken(b, "PDT");
    if (!r) r = consumeToken(b, "PAL");
    if (!r) r = consumeToken(b, "MAXFCN");
    if (!r) r = consumeToken(b, "DIMTMP");
    if (!r) r = consumeToken(b, "DIMCNS");
    if (!r) r = consumeToken(b, "DIMNEW");
    if (!r) r = consumeToken(b, "DIMVRB");
    if (!r) r = consumeToken(b, "PL");
    if (!r) r = consumeToken(b, "NPOPMIXMAX");
    if (!r) r = consumeToken(b, "MAXOMEG");
    if (!r) r = consumeToken(b, "MAXPTHETA");
    if (!r) r = consumeToken(b, "MAXITER");
    if (!r) r = consumeToken(b, "ISAMPLEMAX");
    if (!r) r = consumeToken(b, "MAXSIDL");
    if (!r) r = consumeToken(b, "PNM_MAXNODES");
    return r;
  }

  /* ********************************************************** */
  // sizes_int_param '=' number
  public static boolean sizes_named_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sizes_named_param")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIZES_NAMED_PARAM, "<sizes named param>");
    r = sizes_int_param(b, l + 1);
    r = r && consumeTokens(b, 0, OP_ASSIGN, NUMBER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // << prefixOf "SIZES" >> sizes_named_param *
  public static boolean sizes_record(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sizes_record")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, SIZES_RECORD, "<sizes record>");
    r = prefixOf(b, l + 1, "SIZES");
    r = r && sizes_record_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // sizes_named_param *
  private static boolean sizes_record_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sizes_record_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!sizes_named_param(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "sizes_record_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // &<<isSpace>>
  static boolean space(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "space")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = isSpace(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'TOL' '=' number
  public static boolean subroutine_int_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subroutine_int_param")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUBROUTINE_INT_PARAM, "<subroutine int param>");
    r = consumeToken(b, "TOL");
    r = r && consumeTokens(b, 0, OP_ASSIGN, NUMBER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'ADVAN1' | 'ADVAN2' | 'ADVAN3' | 'ADVAN4' | 'ADVAN5' | 'ADVAN6' | 'ADVAN11' | 'ADVAN12' | 'ADVAN13' | 'TRANS1' | 'TRANS2'| 'TRANS3' | 'TRANS4'
  public static boolean subroutine_option_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subroutine_option_param")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUBROUTINE_OPTION_PARAM, "<subroutine option param>");
    r = consumeToken(b, "ADVAN1");
    if (!r) r = consumeToken(b, "ADVAN2");
    if (!r) r = consumeToken(b, "ADVAN3");
    if (!r) r = consumeToken(b, "ADVAN4");
    if (!r) r = consumeToken(b, "ADVAN5");
    if (!r) r = consumeToken(b, "ADVAN6");
    if (!r) r = consumeToken(b, "ADVAN11");
    if (!r) r = consumeToken(b, "ADVAN12");
    if (!r) r = consumeToken(b, "ADVAN13");
    if (!r) r = consumeToken(b, "TRANS1");
    if (!r) r = consumeToken(b, "TRANS2");
    if (!r) r = consumeToken(b, "TRANS3");
    if (!r) r = consumeToken(b, "TRANS4");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // subroutine_option_param | subroutine_int_param
  public static boolean subroutine_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subroutine_param")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUBROUTINE_PARAM, "<subroutine param>");
    r = subroutine_option_param(b, l + 1);
    if (!r) r = subroutine_int_param(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // << prefixOf "SUBROUTINES" >> subroutine_param *
  public static boolean subroutine_record(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subroutine_record")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, SUBROUTINE_RECORD, "<subroutine record>");
    r = prefixOf(b, l + 1, "SUBROUTINES");
    r = r && subroutine_record_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // subroutine_param *
  private static boolean subroutine_record_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subroutine_record_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!subroutine_param(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "subroutine_record_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // 'FILE' '=' file_param
  public static boolean table_file_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_file_param")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TABLE_FILE_PARAM, "<table file param>");
    r = consumeToken(b, "FILE");
    r = r && consumeToken(b, OP_ASSIGN);
    r = r && file_param(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'FORMAT' '=' table_format
  public static boolean table_format_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_format_param")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TABLE_FORMAT_PARAM, "<table format param>");
    r = consumeToken(b, "FORMAT");
    r = r && consumeTokens(b, 0, OP_ASSIGN, TABLE_FORMAT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ('PRINT' | 'NOPRINT') | ('NOHEADER' | 'ONEHEADER') | ('APPEND' | 'NOAPPEND')
  public static boolean table_option_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_option_param")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TABLE_OPTION_PARAM, "<table option param>");
    r = table_option_param_0(b, l + 1);
    if (!r) r = table_option_param_1(b, l + 1);
    if (!r) r = table_option_param_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'PRINT' | 'NOPRINT'
  private static boolean table_option_param_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_option_param_0")) return false;
    boolean r;
    r = consumeToken(b, "PRINT");
    if (!r) r = consumeToken(b, "NOPRINT");
    return r;
  }

  // 'NOHEADER' | 'ONEHEADER'
  private static boolean table_option_param_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_option_param_1")) return false;
    boolean r;
    r = consumeToken(b, "NOHEADER");
    if (!r) r = consumeToken(b, "ONEHEADER");
    return r;
  }

  // 'APPEND' | 'NOAPPEND'
  private static boolean table_option_param_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_option_param_2")) return false;
    boolean r;
    r = consumeToken(b, "APPEND");
    if (!r) r = consumeToken(b, "NOAPPEND");
    return r;
  }

  /* ********************************************************** */
  // table_option_param | table_file_param | table_format_param | input_reserved_param | pk_reserved_param | error_reserved_param | id
  static boolean table_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_param")) return false;
    boolean r;
    r = table_option_param(b, l + 1);
    if (!r) r = table_file_param(b, l + 1);
    if (!r) r = table_format_param(b, l + 1);
    if (!r) r = input_reserved_param(b, l + 1);
    if (!r) r = pk_reserved_param(b, l + 1);
    if (!r) r = error_reserved_param(b, l + 1);
    if (!r) r = consumeToken(b, ID);
    return r;
  }

  /* ********************************************************** */
  // << prefixOf "TABLE" >> table_param +
  public static boolean table_record(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_record")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, TABLE_RECORD, "<table record>");
    r = prefixOf(b, l + 1, "TABLE");
    r = r && table_record_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // table_param +
  private static boolean table_record_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_record_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = table_param(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!table_param(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "table_record_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // << prefixOf "THETA" >> initial_value*
  public static boolean theta_record(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "theta_record")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, THETA_RECORD, "<theta record>");
    r = prefixOf(b, l + 1, "THETA");
    r = r && theta_record_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // initial_value*
  private static boolean theta_record_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "theta_record_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!initial_value(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "theta_record_1", c)) break;
    }
    return true;
  }

}
