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
public @interface Interceptor {
    /**
     * <p>Priorities that define the order in which interceptors are
     * invoked.  These values should be used with the
     * {@link javax.annotations.Priority Priority} annotation.
     * <ul>
     * <li>Interceptors defined by platform specifications should have
     * priority values in the range <a href="#PLATFORM_BEFORE">PLATFORM_BEFORE</a>
     * up until <a href="#LIBRARY_BEFORE">LIBRARY_BEFORE</a>, or starting at
     * <a href="#PLATFORM_AFTER">PLATFORM_AFTER</a>.
     * <li>Interceptors defined by extension libraries
     * should have priority values in the range <a href="#LIBRARY_BEFORE">LIBRARY_BEFORE</a>
     * up until <a href="#APPLICATION">APPLICATION</a>, or
     * <a href="#LIBRARY_AFTER">LIBRARY_AFTER</a> up until
     * <a href="#PLATFORM_AFTER">PLATFORM_AFTER</a>.
     * <li>Interceptors defined by applications should have priority values in the range
     * <a href="#APPLICATION">APPLICATION</a> up until
     * <a href="#LIBRARY_AFTER">LIBRARY_AFTER</a>.
     * </ul>
     *
     * <p>An interceptor that must be invoked before or
     * after another defined interceptor can choose any appropriate
     * value.</p>
     *
     * <p>Interceptors with smaller priority values are called first. If more than
     * one interceptor has the same priority, the relative order of these interceptor
     * is undefined.</p>
     *
     * <p>For example, an extension library might define an interceptor
     * like this:</p>
     *
     * <pre>
     * &#064;Priority(Interceptor.Priority.LIBRARY_BEFORE+10)
     * &#064;Interceptor
     * public class ValidationInterceptor { ... }
     * </pre>
     *
     * @since Interceptors 1.2
     */
    public static class Priority {
    private Priority() { }  // don't allow instances

    /**
     * Start of range for early interceptors defined by
     * platform specifications.
     */
    public static final int PLATFORM_BEFORE = 0;

    /**
     * Start of range for early interceptors defined by
     * extension libraries.
     */
    public static final int LIBRARY_BEFORE = 1000;

    /**
     * Start of range for interceptors defined by
     * applications.
     */
    public static final int APPLICATION = 2000;

    /**
     * Start of range for late interceptors defined by
     * extension libraries.
     */
    public static final int LIBRARY_AFTER = 3000;

    /**
     * Start of range for late interceptors defined by
     * platform specifications.
     */
    public static final int PLATFORM_AFTER = 4000;
    }
}
