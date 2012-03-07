package javax.interceptor;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

/**
 * Declares the list of interceptors (by interceptor class) which apply to the annotated class or method.
 */
@Target({ TYPE, METHOD })
@Retention(RUNTIME)
public @interface Interceptors {

    /**
     * The actual interceptor classes to apply to the annotated element.
     *
     * @return the interceptor classes
     */
    @SuppressWarnings("unchecked") // By spec, this returns a raw type.  Don't mess with the spec.
    Class[] value();
}
