// This is a generated file. Not intended for manual editing.
package me.yuge.nonmem.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import me.yuge.nonmem.psi.impl.*;

public interface NonmemTypes {

  IElementType ABBR_CODE = new NonmemElementType("ABBR_CODE");
  IElementType ABBR_CODE_DO_WHILE = new NonmemElementType("ABBR_CODE_DO_WHILE");
  IElementType ABBR_CODE_EQUATION = new NonmemElementType("ABBR_CODE_EQUATION");
  IElementType ABBR_CODE_FUNCTION = new NonmemElementType("ABBR_CODE_FUNCTION");
  IElementType ABBR_CODE_IF = new NonmemElementType("ABBR_CODE_IF");
  IElementType ABBR_CODE_LITERAL = new NonmemElementType("ABBR_CODE_LITERAL");
  IElementType ABBR_CODE_LOGIC_EXPR = new NonmemElementType("ABBR_CODE_LOGIC_EXPR");
  IElementType ABBR_CODE_MUL_EXPR = new NonmemElementType("ABBR_CODE_MUL_EXPR");
  IElementType ABBR_CODE_PARENTHESIS = new NonmemElementType("ABBR_CODE_PARENTHESIS");
  IElementType ABBR_CODE_PLUS_EXPR = new NonmemElementType("ABBR_CODE_PLUS_EXPR");
  IElementType ABBR_CODE_REFERENCE = new NonmemElementType("ABBR_CODE_REFERENCE");
  IElementType ABBR_CODE_VARIABLE = new NonmemElementType("ABBR_CODE_VARIABLE");
  IElementType ABBR_PARAM = new NonmemElementType("ABBR_PARAM");
  IElementType ABBR_RECORD = new NonmemElementType("ABBR_RECORD");
  IElementType COVARIANCE_NAMED_PARAM = new NonmemElementType("COVARIANCE_NAMED_PARAM");
  IElementType COVARIANCE_OPTION_PARAM = new NonmemElementType("COVARIANCE_OPTION_PARAM");
  IElementType COVARIANCE_RECORD = new NonmemElementType("COVARIANCE_RECORD");
  IElementType DATA_FILE_PARAM = new NonmemElementType("DATA_FILE_PARAM");
  IElementType DATA_FORMAT_PARAM = new NonmemElementType("DATA_FORMAT_PARAM");
  IElementType DATA_NAMED_PARAM = new NonmemElementType("DATA_NAMED_PARAM");
  IElementType DATA_RECORD = new NonmemElementType("DATA_RECORD");
  IElementType DES_RECORD = new NonmemElementType("DES_RECORD");
  IElementType ERROR_RECORD = new NonmemElementType("ERROR_RECORD");
  IElementType ERROR_RESERVED_PARAM = new NonmemElementType("ERROR_RESERVED_PARAM");
  IElementType ESTIMATION_NAMED_PARAM = new NonmemElementType("ESTIMATION_NAMED_PARAM");
  IElementType ESTIMATION_OPTION_PARAM = new NonmemElementType("ESTIMATION_OPTION_PARAM");
  IElementType ESTIMATION_RECORD = new NonmemElementType("ESTIMATION_RECORD");
  IElementType FILE_PARAM = new NonmemElementType("FILE_PARAM");
  IElementType INITIAL_VALUE = new NonmemElementType("INITIAL_VALUE");
  IElementType INPUT_NAMED_PARAM = new NonmemElementType("INPUT_NAMED_PARAM");
  IElementType INPUT_RECORD = new NonmemElementType("INPUT_RECORD");
  IElementType INPUT_RESERVED_PARAM = new NonmemElementType("INPUT_RESERVED_PARAM");
  IElementType MODEL_PARAM = new NonmemElementType("MODEL_PARAM");
  IElementType MODEL_RECORD = new NonmemElementType("MODEL_RECORD");
  IElementType OMEGA_INT_PARAM = new NonmemElementType("OMEGA_INT_PARAM");
  IElementType OMEGA_OPTION_PARAM = new NonmemElementType("OMEGA_OPTION_PARAM");
  IElementType OMEGA_RECORD = new NonmemElementType("OMEGA_RECORD");
  IElementType PK_RECORD = new NonmemElementType("PK_RECORD");
  IElementType PK_RESERVED_PARAM = new NonmemElementType("PK_RESERVED_PARAM");
  IElementType PRED_RECORD = new NonmemElementType("PRED_RECORD");
  IElementType PROBLEM_OPTION_PARAM = new NonmemElementType("PROBLEM_OPTION_PARAM");
  IElementType PROBLEM_RECORD = new NonmemElementType("PROBLEM_RECORD");
  IElementType RECORD = new NonmemElementType("RECORD");
  IElementType SIGMA_RECORD = new NonmemElementType("SIGMA_RECORD");
  IElementType SIMULATION_NAMED_PARAM = new NonmemElementType("SIMULATION_NAMED_PARAM");
  IElementType SIMULATION_OPTION_PARAM = new NonmemElementType("SIMULATION_OPTION_PARAM");
  IElementType SIMULATION_PARAM = new NonmemElementType("SIMULATION_PARAM");
  IElementType SIMULATION_RECORD = new NonmemElementType("SIMULATION_RECORD");
  IElementType SIMULATION_SEED_PARAM = new NonmemElementType("SIMULATION_SEED_PARAM");
  IElementType SIZES_NAMED_PARAM = new NonmemElementType("SIZES_NAMED_PARAM");
  IElementType SIZES_RECORD = new NonmemElementType("SIZES_RECORD");
  IElementType SUBROUTINE_INT_PARAM = new NonmemElementType("SUBROUTINE_INT_PARAM");
  IElementType SUBROUTINE_OPTION_PARAM = new NonmemElementType("SUBROUTINE_OPTION_PARAM");
  IElementType SUBROUTINE_PARAM = new NonmemElementType("SUBROUTINE_PARAM");
  IElementType SUBROUTINE_RECORD = new NonmemElementType("SUBROUTINE_RECORD");
  IElementType TABLE_FILE_PARAM = new NonmemElementType("TABLE_FILE_PARAM");
  IElementType TABLE_FORMAT_PARAM = new NonmemElementType("TABLE_FORMAT_PARAM");
  IElementType TABLE_OPTION_PARAM = new NonmemElementType("TABLE_OPTION_PARAM");
  IElementType TABLE_RECORD = new NonmemElementType("TABLE_RECORD");
  IElementType THETA_RECORD = new NonmemElementType("THETA_RECORD");

  IElementType COMMA = new NonmemTokenType(",");
  IElementType COMMENT = new NonmemTokenType("comment");
  IElementType DATA_FORMAT = new NonmemTokenType("data_format");
  IElementType DOLLAR = new NonmemTokenType("$");
  IElementType FILE_PARAM_1_0_0_5_0 = new NonmemTokenType("file_param_1_0_0_5_0");
  IElementType ID = new NonmemTokenType("id");
  IElementType LEFT_PAREN = new NonmemTokenType("(");
  IElementType NUMBER = new NonmemTokenType("number");
  IElementType OP_ASSIGN = new NonmemTokenType("=");
  IElementType OP_MINUS = new NonmemTokenType("-");
  IElementType OP_MUL = new NonmemTokenType("*");
  IElementType OP_PLUS = new NonmemTokenType("+");
  IElementType OP_POWER = new NonmemTokenType("**");
  IElementType OP_QUOTIENT = new NonmemTokenType("/");
  IElementType RIGHT_PAREN = new NonmemTokenType(")");
  IElementType STRING = new NonmemTokenType("string");
  IElementType TABLE_FORMAT = new NonmemTokenType("table_format");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ABBR_CODE) {
        return new NonmemAbbrCodeImpl(node);
      }
      else if (type == ABBR_CODE_DO_WHILE) {
        return new NonmemAbbrCodeDoWhileImpl(node);
      }
      else if (type == ABBR_CODE_EQUATION) {
        return new NonmemAbbrCodeEquationImpl(node);
      }
      else if (type == ABBR_CODE_FUNCTION) {
        return new NonmemAbbrCodeFunctionImpl(node);
      }
      else if (type == ABBR_CODE_IF) {
        return new NonmemAbbrCodeIfImpl(node);
      }
      else if (type == ABBR_CODE_LITERAL) {
        return new NonmemAbbrCodeLiteralImpl(node);
      }
      else if (type == ABBR_CODE_LOGIC_EXPR) {
        return new NonmemAbbrCodeLogicExprImpl(node);
      }
      else if (type == ABBR_CODE_MUL_EXPR) {
        return new NonmemAbbrCodeMulExprImpl(node);
      }
      else if (type == ABBR_CODE_PARENTHESIS) {
        return new NonmemAbbrCodeParenthesisImpl(node);
      }
      else if (type == ABBR_CODE_PLUS_EXPR) {
        return new NonmemAbbrCodePlusExprImpl(node);
      }
      else if (type == ABBR_CODE_REFERENCE) {
        return new NonmemAbbrCodeReferenceImpl(node);
      }
      else if (type == ABBR_CODE_VARIABLE) {
        return new NonmemAbbrCodeVariableImpl(node);
      }
      else if (type == ABBR_PARAM) {
        return new NonmemAbbrParamImpl(node);
      }
      else if (type == ABBR_RECORD) {
        return new NonmemAbbrRecordImpl(node);
      }
      else if (type == COVARIANCE_NAMED_PARAM) {
        return new NonmemCovarianceNamedParamImpl(node);
      }
      else if (type == COVARIANCE_OPTION_PARAM) {
        return new NonmemCovarianceOptionParamImpl(node);
      }
      else if (type == COVARIANCE_RECORD) {
        return new NonmemCovarianceRecordImpl(node);
      }
      else if (type == DATA_FILE_PARAM) {
        return new NonmemDataFileParamImpl(node);
      }
      else if (type == DATA_FORMAT_PARAM) {
        return new NonmemDataFormatParamImpl(node);
      }
      else if (type == DATA_NAMED_PARAM) {
        return new NonmemDataNamedParamImpl(node);
      }
      else if (type == DATA_RECORD) {
        return new NonmemDataRecordImpl(node);
      }
      else if (type == DES_RECORD) {
        return new NonmemDesRecordImpl(node);
      }
      else if (type == ERROR_RECORD) {
        return new NonmemErrorRecordImpl(node);
      }
      else if (type == ERROR_RESERVED_PARAM) {
        return new NonmemErrorReservedParamImpl(node);
      }
      else if (type == ESTIMATION_NAMED_PARAM) {
        return new NonmemEstimationNamedParamImpl(node);
      }
      else if (type == ESTIMATION_OPTION_PARAM) {
        return new NonmemEstimationOptionParamImpl(node);
      }
      else if (type == ESTIMATION_RECORD) {
        return new NonmemEstimationRecordImpl(node);
      }
      else if (type == FILE_PARAM) {
        return new NonmemFileParamImpl(node);
      }
      else if (type == INITIAL_VALUE) {
        return new NonmemInitialValueImpl(node);
      }
      else if (type == INPUT_NAMED_PARAM) {
        return new NonmemInputNamedParamImpl(node);
      }
      else if (type == INPUT_RECORD) {
        return new NonmemInputRecordImpl(node);
      }
      else if (type == INPUT_RESERVED_PARAM) {
        return new NonmemInputReservedParamImpl(node);
      }
      else if (type == MODEL_PARAM) {
        return new NonmemModelParamImpl(node);
      }
      else if (type == MODEL_RECORD) {
        return new NonmemModelRecordImpl(node);
      }
      else if (type == OMEGA_INT_PARAM) {
        return new NonmemOmegaIntParamImpl(node);
      }
      else if (type == OMEGA_OPTION_PARAM) {
        return new NonmemOmegaOptionParamImpl(node);
      }
      else if (type == OMEGA_RECORD) {
        return new NonmemOmegaRecordImpl(node);
      }
      else if (type == PK_RECORD) {
        return new NonmemPkRecordImpl(node);
      }
      else if (type == PK_RESERVED_PARAM) {
        return new NonmemPkReservedParamImpl(node);
      }
      else if (type == PRED_RECORD) {
        return new NonmemPredRecordImpl(node);
      }
      else if (type == PROBLEM_OPTION_PARAM) {
        return new NonmemProblemOptionParamImpl(node);
      }
      else if (type == PROBLEM_RECORD) {
        return new NonmemProblemRecordImpl(node);
      }
      else if (type == SIGMA_RECORD) {
        return new NonmemSigmaRecordImpl(node);
      }
      else if (type == SIMULATION_NAMED_PARAM) {
        return new NonmemSimulationNamedParamImpl(node);
      }
      else if (type == SIMULATION_OPTION_PARAM) {
        return new NonmemSimulationOptionParamImpl(node);
      }
      else if (type == SIMULATION_PARAM) {
        return new NonmemSimulationParamImpl(node);
      }
      else if (type == SIMULATION_RECORD) {
        return new NonmemSimulationRecordImpl(node);
      }
      else if (type == SIMULATION_SEED_PARAM) {
        return new NonmemSimulationSeedParamImpl(node);
      }
      else if (type == SIZES_NAMED_PARAM) {
        return new NonmemSizesNamedParamImpl(node);
      }
      else if (type == SIZES_RECORD) {
        return new NonmemSizesRecordImpl(node);
      }
      else if (type == SUBROUTINE_INT_PARAM) {
        return new NonmemSubroutineIntParamImpl(node);
      }
      else if (type == SUBROUTINE_OPTION_PARAM) {
        return new NonmemSubroutineOptionParamImpl(node);
      }
      else if (type == SUBROUTINE_PARAM) {
        return new NonmemSubroutineParamImpl(node);
      }
      else if (type == SUBROUTINE_RECORD) {
        return new NonmemSubroutineRecordImpl(node);
      }
      else if (type == TABLE_FILE_PARAM) {
        return new NonmemTableFileParamImpl(node);
      }
      else if (type == TABLE_FORMAT_PARAM) {
        return new NonmemTableFormatParamImpl(node);
      }
      else if (type == TABLE_OPTION_PARAM) {
        return new NonmemTableOptionParamImpl(node);
      }
      else if (type == TABLE_RECORD) {
        return new NonmemTableRecordImpl(node);
      }
      else if (type == THETA_RECORD) {
        return new NonmemThetaRecordImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
