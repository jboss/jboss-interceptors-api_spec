package javax.interceptor;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Explicitly specify that a class is an interceptor class.  Note that in many cases, it is possible for the container
 * to implicitly determine that a class is an interceptor class without the presence of this annotation; in particular,
 * a deployment descriptor or {@link Interceptors @Interceptors} annotation can also identify an interceptor class.
 */
@Target(TYPE)
@Retention(RUNTIME)
@Documented
public @interface Interceptor {}
