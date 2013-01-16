package jrag;

import java.util.Set;

import jrag.AST.*;

public class Unparser implements JragParserVisitor {
  public static void unparseImport(SimpleNode node, Set imports) {
      Token t = new Token();
      t.next = node.firstToken;

      StringBuffer buf = new StringBuffer(64);

      while(t != null && t != node.lastToken) {
        t = t.next;
        if (t.specialToken != null)
          buf.append(' ');
        buf.append(Util.addUnicodeEscapes(t.image));
      }

      imports.add(buf.toString().trim());
  }

  public static void unparseComment(SimpleNode node, StringBuffer buf) {
        Token tt = node.firstToken.specialToken;
        if (tt != null) {
            while (tt.specialToken != null) tt = tt.specialToken;
            while (tt != null) {
                buf.append(Util.addUnicodeEscapes(tt.image));
                tt = tt.next;
            }
        }
  }

  public static String unparseComment(SimpleNode node) {
    StringBuffer buf = new StringBuffer();
    unparseComment(node, buf);
    return buf.toString();
  }

  public Object visit(SimpleNode node, Object data) {
    return null;
  }
  public Object visit(ASTCompilationUnit node, Object data) {
    return null;
  }
  public Object visit(ASTPackageDeclaration node, Object data) {
    return null;
  }
  public Object visit(ASTImportDeclaration node, Object data) {
    return null;
  }
  public Object visit(ASTModifiers node, Object data) {
    return null;
  }
  public Object visit(ASTTypeDeclaration node, Object data) {
    return null;
  }
  public Object visit(ASTAspectDeclaration node, Object data) {
    return null;
  }
  public Object visit(ASTAspectBody node, Object data) {
    return null;
  }
  public Object visit(ASTAspectBodyDeclaration node, Object data) {
    return null;
  }
  public Object visit(ASTAspectClassDeclaration node, Object data) {
    return null;
  }
  public Object visit(ASTAspectClassBody node, Object data) {
    return null;
  }
  public Object visit(ASTAspectInterfaceDeclaration node, Object data) {
    return null;
  }
  public Object visit(ASTAspectInterfaceMemberDeclaration node, Object data) {
    return null;
  }
  public Object visit(ASTAspectSonsDeclaration node, Object data) {
    return null;
  }
  public Object visit(ASTAspectInterfaceSynAttributeDeclaration node, Object data) {
    return null;
  }
  public Object visit(ASTAspectInterfaceInhAttributeDeclaration node, Object data) {
    return null;
  }
  public Object visit(ASTAspectInterfaceMethodDeclarationLookahead node, Object data) {
    return null;
  }
  public Object visit(ASTAspectInterfaceMethodDeclaration node, Object data) {
    return null;
  }
  public Object visit(ASTAspectInterfaceFieldDeclaration node, Object data) {
    return null;
  }
  public Object visit(ASTAspectNestedInterfaceDeclaration node, Object data) {
    return null;
  }
  public Object visit(ASTAspectNestedClassDeclaration node, Object data) {
    return null;
  }
  public Object visit(ASTAspectMethodDeclarationLookahead node, Object data) {
    return null;
  }
  public Object visit(ASTAspectMethodDeclaration node, Object data) {
    return null;
  }
  public Object visit(ASTAspectRefineMethodDeclarationLookahead node, Object data) {
    return null;
  }
  public Object visit(ASTAspectRefineMethodDeclaration node, Object data) {
    return null;
  }
  public Object visit(ASTAspectConstructorDeclaration node, Object data) {
    return null;
  }
  public Object visit(ASTAspectRefineConstructorDeclaration node, Object data) {
    return null;
  }
  public Object visit(ASTAspectFieldDeclaration node, Object data) {
    return null;
  }
  public Object visit(ASTAspectSynAttributeDeclaration node, Object data) {
    return null;
  }
  public Object visit(ASTAspectInhAttributeDeclaration node, Object data) {
    return null;
  }
  public Object visit(ASTAspectRewrite node, Object data) {
    return null;
  }
  public Object visit(ASTAspectSynEquation node, Object data) {
    return null;
  }
  public Object visit(ASTAspectRefineSynEquation node, Object data) {
    return null;
  }
  public Object visit(ASTAspectInhEquation node, Object data) {
    return null;
  }
  public Object visit(ASTAspectRefineInhEquation node, Object data) {
    return null;
  }
  public Object visit(ASTCollectionAttribute node, Object data) {
    return null;
  }
  public Object visit(ASTCollectionContribution node, Object data) {
    return null;
  }
  public Object visit(ASTAspectAddInterface node, Object data) {
    return null;
  }
  public Object visit(ASTAspectExtendInterface node, Object data) {
    return null;
  }
  public Object visit(ASTClassDeclaration node, Object data) {
    return null;
  }
  public Object visit(ASTTypeNameList node, Object data) {
    return null;
  }
  public Object visit(ASTUnmodifiedClassDeclaration node, Object data) {
    return null;
  }
  public Object visit(ASTEnumDeclaration node, Object data) {
    return null;
  }
  public Object visit(ASTEnumBody node, Object data) {
    return null;
  }
  public Object visit(ASTEnumConstant node, Object data) {
    return null;
  }
  public Object visit(ASTTypeParameters node, Object data) {
    return null;
  }
  public Object visit(ASTTypeParameter node, Object data) {
    return null;
  }
  public Object visit(ASTTypeBound node, Object data) {
    return null;
  }
  public Object visit(ASTClassBody node, Object data) {
    return null;
  }
  public Object visit(ASTClassBodyDeclaration node, Object data) {
    return null;
  }
  public Object visit(ASTInterfaceDeclaration node, Object data) {
    return null;
  }
  public Object visit(ASTUnmodifiedInterfaceDeclaration node, Object data) {
    return null;
  }
  public Object visit(ASTInterfaceMemberDeclaration node, Object data) {
    return null;
  }
  public Object visit(ASTFieldDeclaration node, Object data) {
    return null;
  }
  public Object visit(ASTVariableDeclarator node, Object data) {
    return null;
  }
  public Object visit(ASTVariableDeclaratorId node, Object data) {
    return null;
  }
  public Object visit(ASTVariableInitializer node, Object data) {
    return null;
  }
  public Object visit(ASTArrayInitializer node, Object data) {
    return null;
  }
  public Object visit(ASTMethodDeclaration node, Object data) {
    return null;
  }
  public Object visit(ASTMethodDeclarator node, Object data) {
    return null;
  }
  public Object visit(ASTFormalParameters node, Object data) {
    return null;
  }
  public Object visit(ASTFormalParameter node, Object data) {
    return null;
  }
  public Object visit(ASTConstructorDeclaration node, Object data) {
    return null;
  }
  public Object visit(ASTExplicitConstructorInvocation node, Object data) {
    return null;
  }
  public Object visit(ASTInitializer node, Object data) {
    return null;
  }
  public Object visit(ASTType node, Object data) {
    return null;
  }
  public Object visit(ASTReferenceType node, Object data) {
    return null;
  }
  public Object visit(ASTClassOrInterfaceType node, Object data) {
    return null;
  }
  public Object visit(ASTTypeArguments node, Object data) {
    return null;
  }
  public Object visit(ASTTypeArgument node, Object data) {
    return null;
  }
  public Object visit(ASTWildcardBounds node, Object data) {
    return null;
  }
  public Object visit(ASTPrimitiveType node, Object data) {
    return null;
  }
  public Object visit(ASTResultType node, Object data) {
    return null;
  }
  public Object visit(ASTName node, Object data) {
    return null;
  }
  public Object visit(ASTNameList node, Object data) {
    return null;
  }
  public Object visit(ASTExpression node, Object data) {
    return null;
  }
  public Object visit(ASTAssignmentOperator node, Object data) {
    return null;
  }
  public Object visit(ASTConditionalExpression node, Object data) {
    return null;
  }
  public Object visit(ASTConditionalOrExpression node, Object data) {
    return null;
  }
  public Object visit(ASTConditionalAndExpression node, Object data) {
    return null;
  }
  public Object visit(ASTInclusiveOrExpression node, Object data) {
    return null;
  }
  public Object visit(ASTExclusiveOrExpression node, Object data) {
    return null;
  }
  public Object visit(ASTAndExpression node, Object data) {
    return null;
  }
  public Object visit(ASTEqualityExpression node, Object data) {
    return null;
  }
  public Object visit(ASTInstanceOfExpression node, Object data) {
    return null;
  }
  public Object visit(ASTRelationalExpression node, Object data) {
    return null;
  }
  public Object visit(ASTShiftExpression node, Object data) {
    return null;
  }
  public Object visit(ASTAdditiveExpression node, Object data) {
    return null;
  }
  public Object visit(ASTMultiplicativeExpression node, Object data) {
    return null;
  }
  public Object visit(ASTUnaryExpression node, Object data) {
    return null;
  }
  public Object visit(ASTPreIncrementExpression node, Object data) {
    return null;
  }
  public Object visit(ASTPreDecrementExpression node, Object data) {
    return null;
  }
  public Object visit(ASTUnaryExpressionNotPlusMinus node, Object data) {
    return null;
  }
  public Object visit(ASTCastLookahead node, Object data) {
    return null;
  }
  public Object visit(ASTPostfixExpression node, Object data) {
    return null;
  }
  public Object visit(ASTCastExpression node, Object data) {
    return null;
  }
  public Object visit(ASTPrimaryExpression node, Object data) {
    return null;
  }
  public Object visit(ASTMemberSelector node, Object data) {
    return null;
  }
  public Object visit(ASTPrimaryPrefix node, Object data) {
    return null;
  }
  public Object visit(ASTPrimarySuffix node, Object data) {
    return null;
  }
  public Object visit(ASTLiteral node, Object data) {
    return null;
  }
  public Object visit(ASTBooleanLiteral node, Object data) {
    return null;
  }
  public Object visit(ASTNullLiteral node, Object data) {
    return null;
  }
  public Object visit(ASTArguments node, Object data) {
    return null;
  }
  public Object visit(ASTArgumentList node, Object data) {
    return null;
  }
  public Object visit(ASTAllocationExpression node, Object data) {
    return null;
  }
  public Object visit(ASTArrayDimsAndInits node, Object data) {
    return null;
  }
  public Object visit(ASTStatement node, Object data) {
    return null;
  }
  public Object visit(ASTAssertStatement node, Object data) {
    return null;
  }
  public Object visit(ASTLabeledStatement node, Object data) {
    return null;
  }
  public Object visit(ASTBlock node, Object data) {
    return null;
  }
  public Object visit(ASTBlockStatement node, Object data) {
    return null;
  }
  public Object visit(ASTLocalVariableDeclaration node, Object data) {
    return null;
  }
  public Object visit(ASTEmptyStatement node, Object data) {
    return null;
  }
  public Object visit(ASTStatementExpression node, Object data) {
    return null;
  }
  public Object visit(ASTSwitchStatement node, Object data) {
    return null;
  }
  public Object visit(ASTSwitchLabel node, Object data) {
    return null;
  }
  public Object visit(ASTIfStatement node, Object data) {
    return null;
  }
  public Object visit(ASTWhileStatement node, Object data) {
    return null;
  }
  public Object visit(ASTDoStatement node, Object data) {
    return null;
  }
  public Object visit(ASTForStatement node, Object data) {
    return null;
  }
  public Object visit(ASTForInit node, Object data) {
    return null;
  }
  public Object visit(ASTStatementExpressionList node, Object data) {
    return null;
  }
  public Object visit(ASTForUpdate node, Object data) {
    return null;
  }
  public Object visit(ASTBreakStatement node, Object data) {
    return null;
  }
  public Object visit(ASTContinueStatement node, Object data) {
    return null;
  }
  public Object visit(ASTReturnStatement node, Object data) {
    return null;
  }
  public Object visit(ASTThrowStatement node, Object data) {
    return null;
  }
  public Object visit(ASTSynchronizedStatement node, Object data) {
    return null;
  }
  public Object visit(ASTTryStatement node, Object data) {
    return null;
  }
  public Object visit(ASTRUNSIGNEDSHIFT node, Object data) {
    return null;
  }
  public Object visit(ASTRSIGNEDSHIFT node, Object data) {
    return null;
  }
  public Object visit(ASTAnnotation node, Object data) {
    return null;
  }
  public Object visit(ASTNormalAnnotation node, Object data) {
    return null;
  }
  public Object visit(ASTMarkerAnnotation node, Object data) {
    return null;
  }
  public Object visit(ASTSingleMemberAnnotation node, Object data) {
    return null;
  }
  public Object visit(ASTMemberValuePairs node, Object data) {
    return null;
  }
  public Object visit(ASTMemberValuePair node, Object data) {
    return null;
  }
  public Object visit(ASTMemberValue node, Object data) {
    return null;
  }
  public Object visit(ASTMemberValueArrayInitializer node, Object data) {
    return null;
  }
  public Object visit(ASTAnnotationTypeDeclaration node, Object data) {
    return null;
  }
  public Object visit(ASTAnnotationTypeBody node, Object data) {
    return null;
  }
  public Object visit(ASTAnnotationTypeMemberDeclaration node, Object data) {
    return null;
  }
  public Object visit(ASTDefaultValue node, Object data) {
    return null;
  }
  public Object visit(ASTCacheDeclarations node, Object data) {
    return null;
  }
}
