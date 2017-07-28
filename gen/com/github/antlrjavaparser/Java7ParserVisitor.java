// Generated from C:/Users/Jamie/teacup/antlrJavaParser/src/main/java/com/github/antlrjavaparser\Java7Parser.g4 by ANTLR 4.7
package com.github.antlrjavaparser;

package com.github.antlrjavaparser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Java7Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Java7ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Java7Parser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(Java7Parser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(Java7Parser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(Java7Parser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#qualifiedImportName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedImportName(Java7Parser.QualifiedImportNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(Java7Parser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#classOrInterfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceDeclaration(Java7Parser.ClassOrInterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifiers(Java7Parser.ModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(Java7Parser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#variableModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifiers(Java7Parser.VariableModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(Java7Parser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalClassDeclaration(Java7Parser.NormalClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(Java7Parser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(Java7Parser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(Java7Parser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#additionalBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionalBound(Java7Parser.AdditionalBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(Java7Parser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#enumBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBody(Java7Parser.EnumBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#enumConstants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstants(Java7Parser.EnumConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(Java7Parser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(Java7Parser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(Java7Parser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalInterfaceDeclaration(Java7Parser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(Java7Parser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(Java7Parser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(Java7Parser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(Java7Parser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#memberDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDecl(Java7Parser.MemberDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(Java7Parser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(Java7Parser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#constructorBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBlock(Java7Parser.ConstructorBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(Java7Parser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(Java7Parser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBodyDeclaration(Java7Parser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(Java7Parser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#defaultInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultInterfaceMethodDeclaration(Java7Parser.DefaultInterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#interfaceFieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceFieldDeclaration(Java7Parser.InterfaceFieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(Java7Parser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(Java7Parser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#identifierTypeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierTypeArgument(Java7Parser.IdentifierTypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(Java7Parser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(Java7Parser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(Java7Parser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(Java7Parser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(Java7Parser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#formalParameterDecls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterDecls(Java7Parser.FormalParameterDeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#normalParameterDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalParameterDecl(Java7Parser.NormalParameterDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#ellipsisParameterDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEllipsisParameterDecl(Java7Parser.EllipsisParameterDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitConstructorInvocation(Java7Parser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(Java7Parser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#annotations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotations(Java7Parser.AnnotationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(Java7Parser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#markerAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarkerAnnotation(Java7Parser.MarkerAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleElementAnnotation(Java7Parser.SingleElementAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#normalAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalAnnotation(Java7Parser.NormalAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#elementValuePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairs(Java7Parser.ElementValuePairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(Java7Parser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(Java7Parser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(Java7Parser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(Java7Parser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(Java7Parser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(Java7Parser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#annotationMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodDeclaration(Java7Parser.AnnotationMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Java7Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(Java7Parser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(Java7Parser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(Java7Parser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Java7Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(Java7Parser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#switchBlockStatementGroups}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroups(Java7Parser.SwitchBlockStatementGroupsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(Java7Parser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(Java7Parser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#trystatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrystatement(Java7Parser.TrystatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#tryWithResources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryWithResources(Java7Parser.TryWithResourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(Java7Parser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#resources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResources(Java7Parser.ResourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(Java7Parser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#catches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatches(Java7Parser.CatchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(Java7Parser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#catchFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchFormalParameter(Java7Parser.CatchFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#forstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForstatement(Java7Parser.ForstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#foreachStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeachStatement(Java7Parser.ForeachStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#normalForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalForStatement(Java7Parser.NormalForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(Java7Parser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(Java7Parser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(Java7Parser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(Java7Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(Java7Parser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(Java7Parser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpression(Java7Parser.ConditionalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(Java7Parser.ConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(Java7Parser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(Java7Parser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(Java7Parser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(Java7Parser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#notEqualityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqualityExpression(Java7Parser.NotEqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#instanceOfExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceOfExpression(Java7Parser.InstanceOfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(Java7Parser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#relationalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOp(Java7Parser.RelationalOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(Java7Parser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#shiftOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftOp(Java7Parser.ShiftOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(Java7Parser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#additiveOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveOp(Java7Parser.AdditiveOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(Java7Parser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#multiplicativeOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeOp(Java7Parser.MultiplicativeOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(Java7Parser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNotPlusMinus(Java7Parser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(Java7Parser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(Java7Parser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#superSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperSuffix(Java7Parser.SuperSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#thisSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisSuffix(Java7Parser.ThisSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#identifierSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierSuffix(Java7Parser.IdentifierSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#typeParamCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParamCall(Java7Parser.TypeParamCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(Java7Parser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(Java7Parser.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#arrayCreator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreator(Java7Parser.ArrayCreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(Java7Parser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(Java7Parser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#createdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedName(Java7Parser.CreatedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#innerCreator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerCreator(Java7Parser.InnerCreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#classCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreatorRest(Java7Parser.ClassCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArguments(Java7Parser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(Java7Parser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(Java7Parser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#classHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassHeader(Java7Parser.ClassHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#enumHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumHeader(Java7Parser.EnumHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#interfaceHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceHeader(Java7Parser.InterfaceHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#annotationHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationHeader(Java7Parser.AnnotationHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#typeHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeHeader(Java7Parser.TypeHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#methodHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHeader(Java7Parser.MethodHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#fieldHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldHeader(Java7Parser.FieldHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#localVariableHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableHeader(Java7Parser.LocalVariableHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInferredFormalParameterList(Java7Parser.InferredFormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#inferredFormalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInferredFormalParameters(Java7Parser.InferredFormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(Java7Parser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(Java7Parser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(Java7Parser.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference(Java7Parser.MethodReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(Java7Parser.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#typeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariable(Java7Parser.TypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(Java7Parser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(Java7Parser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(Java7Parser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java7Parser#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDims(Java7Parser.DimsContext ctx);
}