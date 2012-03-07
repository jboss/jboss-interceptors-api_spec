package javax.interceptor;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Defines a method which intercepts invocation of a timeout method.  The annotated method must not be final, must not
 * be static, and must accept exactly one parameter of type {@link InvocationContext}, returning an {@link Object}.
 * <p/>
 * The annotation may be applied a method of the target class (or a superclass thereof), or to a method of any
 * interceptor class; however only one method of the class may be so annotated.
 * <p/>
 * An {@code @AroundTimeout} interceptor method can invoke any component or resource that the timeout method it is
 * intercepting can invoke.  In particular, the same transaction and security contexts apply to the interceptor method
 * as to the timeout method.
 */
@Target(METHOD)
@Retention(RUNTIME)
public @interface AroundTimeout {}
