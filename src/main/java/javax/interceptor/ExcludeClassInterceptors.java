package javax.interceptor;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Exclude the invocation of class-level interceptors for a method.  This annotation applies to a method
 * that would otherwise be subject to interception.
 */
@Target(METHOD)
@Retention(RUNTIME)
public @interface ExcludeClassInterceptors {}
