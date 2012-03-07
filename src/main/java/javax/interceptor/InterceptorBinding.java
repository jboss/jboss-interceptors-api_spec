package javax.interceptor;

import java.lang.annotation.ElementType;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Specifies that an annotation type is an interceptor binding type.  Interceptor bindings are used to specify
 * the binding of an interceptor class to target classes and methods.
 * <p>
 * The annotation type that is marked as a binding must be applied to an interceptor class (marked with the
 * {@link Interceptor @Interceptor} annotation to associate that annotation with an interceptor.  The annotation
 * may then be applied instead of, or in addition to, the {@link Interceptors @Interceptors} annotation to specify
 * what interceptors are attached to the class or method.
 * <p>
 * The associated annotation type must be associated only with {@link ElementType#TYPE TYPE}s and/or
 * {@link ElementType#METHOD METHOD}s.
 */
@Target(ANNOTATION_TYPE)
@Retention(RUNTIME)
@Documented
public @interface InterceptorBinding {}
