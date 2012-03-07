package javax.interceptor;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Exclude the invocation of default interceptors for a method.  This annotation applies to a method
 * that would otherwise be subject to interception.
 */
@Target({ TYPE, METHOD })
@Retention(RUNTIME)
public @interface ExcludeDefaultInterceptors {}
