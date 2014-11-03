package lombok.eclipse.handlers;

import org.eclipse.jdt.internal.compiler.ast.Annotation;

import lombok.ConfigurationKeys;
import lombok.Constants;
import lombok.Data;
import lombok.core.AnnotationValues;
import lombok.eclipse.EclipseAnnotationHandler;
import lombok.eclipse.EclipseNode;

public class HandleConstants extends EclipseAnnotationHandler<Constants> {
	@Override public void handle(AnnotationValues<Constants> annotation, Annotation ast, EclipseNode annotationNode) {
		//handleFlagUsage(annotationNode, ConfigurationKeys.DATA_FLAG_USAGE, "@Constants");
		// TODO Auto-generated method stub
		
		Constants ann = annotation.getInstance();
		EclipseNode typeNode = annotationNode.up();
		
		
		
	}
	
}
