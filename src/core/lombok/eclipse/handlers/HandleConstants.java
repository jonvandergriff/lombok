package lombok.eclipse.handlers;

import org.eclipse.jdt.internal.compiler.ast.Annotation;
import org.eclipse.jdt.internal.compiler.ast.TypeDeclaration;
import org.eclipse.jdt.internal.compiler.classfmt.ClassFileConstants;

import lombok.ConfigurationKeys;
import lombok.Constants;
import lombok.Data;
import lombok.core.AnnotationValues;
import lombok.eclipse.EclipseAnnotationHandler;
import lombok.eclipse.EclipseNode;

public class HandleConstants extends EclipseAnnotationHandler<Constants> {
	@Override public void handle(AnnotationValues<Constants> annotation, Annotation ast, EclipseNode annotationNode) {
		
		Constants ann = annotation.getInstance();
		EclipseNode typeNode = annotationNode.up();
		
		TypeDeclaration typeDecl = null;
		if (typeNode.get() instanceof TypeDeclaration) typeDecl = (TypeDeclaration) typeNode.get();
		int modifiers = typeDecl == null ? 0 : typeDecl.modifiers;
		boolean notAClass = (modifiers & (ClassFileConstants.AccInterface | ClassFileConstants.AccAnnotation | ClassFileConstants.AccEnum)) != 0;
		
		if (typeDecl == null || notAClass) {
			annotationNode.addError("@Constants is only supported on a class.");
			return;
		}
		
		generateConstansForType();
	}

	private void generateConstansForType() {
		
		
	}
	
}
