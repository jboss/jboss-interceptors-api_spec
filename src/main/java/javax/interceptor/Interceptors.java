package javax.interceptor;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Declares the list of interceptors (by interceptor class) which apply to the annotated class or method.
 */
@Target({ TYPE, METHOD, CONSTRUCTOR })
@Retention(RUNTIME)
public @interface Interceptors {

    /**
     * The actual interceptor classes to apply to the annotated element.
     *
     * @return the interceptor classes
     */
    @SuppressWarnings({ "rawtypes" }) // By spec, this returns a raw type.  Don't mess with the spec.
    Class[] value();
}
