package lombok;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * 
 *
 */
@Target(ElementType.TYPE) 
@Retention(RetentionPolicy.SOURCE) 
public @interface Constants {
	
	/**
	 * If you want your getter to be non-public, you can specify an alternate
	 * access level here.
	 */
	lombok.AccessLevel value() default lombok.AccessLevel.PUBLIC;
	
	/**
	 * The values of the constants. The static {@link String} constants will be
	 * created with the field name as the String values provided.
	 */
	String[] of() default {};
	
	/**
	 * Placeholder annotation to enable the placement of annotations on the
	 * generated code.
	 * 
	 * @deprecated Don't use this annotation, ever - Read the documentation.
	 */
	@Deprecated @Retention(RetentionPolicy.SOURCE) @Target({}) @interface AnyAnnotation {
	}
	
}
