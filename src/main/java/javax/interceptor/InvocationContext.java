package javax.interceptor;

import java.lang.reflect.Method;
import java.util.Map;

/**
 * Contextual information about a method invocation, along with methods to alter the invocation process
 * in various ways.
 */
public interface InvocationContext {

    /**
     * Get the target instance for this invocation.
     *
     * @return the target instance
     */
    Object getTarget();

    /**
     * Get the invoked method for this invocation.  If the invoked method is an {@link AroundInvoke @AroundInvoke} or
     * {@link AroundTimeout @AroundTimeout} interceptor method, the method of the target class is returned.  For
     * lifecycle callback interceptors (such as {@link javax.annotation.PostConstruct @PostConstruct} or {@link
     * javax.annotation.PreDestroy @PreDestroy}), {@code null} is returned.
     *
     * @return the invoked method, or {@code null} if none applies to the current invocation context
     */
    Method getMethod();

    /**
     * Get the parameters of the method invocation (for method interceptors).
     *
     * @return the invoked method parameters
     *
     * @throws IllegalStateException if the current invocation context refers to a lifecycle callback invocation
     */
    Object[] getParameters() throws IllegalStateException;

    /**
     * Replace the parameters of the method invocation.
     *
     * @param params the new parameter values to use for the current invocation
     *
     * @throws IllegalStateException if the current invocation context refers to a lifecycle callback invocation
     * @throws IllegalArgumentException if the types or quantity of the method parameters does not match the method
     * declaration
     */
    void setParameters(Object[] params) throws IllegalStateException, IllegalArgumentException;

    /**
     * Returns the context data associated with this invocation or lifecycle callback.
     * <p/>
     * If the current context is an invocation on a web service endpoint, the map returned will be the JAX-WS {@code
     * MessageContext}.  If there is no context data, an empty {@code Map} object will be returned.  Normally,
     * information stored in this map is available to subsequent interceptors in an interceptor chain, so this mechanism
     * may be used to pass information from one interceptor to the next.
     *
     * @return the context map
     */
    Map<String, Object> getContextData();

    /**
     * Get the timer associated with an {@link AroundTimeout @AroundTimeout} interceptor method.  When intercepting
     * an EJB component timeout, the returned type is {@link javax.ejb.Timer}.
     *
     * @return the timer object, or {@code null} if the invocation did not apply to a timeout method.
     */
    Object getTimer();

    /**
     * Proceed with the next stage of invocation processing.  Calling this method may cause another interceptor to be
     * invoked, or it may cause the final target object to be invoked.  The return value of this method is the result
     * of the subsequent invocation processing, or of the invocation itself.  Normally an interceptor will return this
     * value to its caller; however, it is also possible to return a different value.
     * <p>
     * If the intercepted method's return type is {@code void}, or if this is a lifecycle method interceptor, then
     * {@code null} is returned from this method, and should be returned by the interceptor as well.
     *
     * @return the result of subsequent interceptor method processing
     * @throws Exception if an exception is thrown by subsequent processing
     */
    Object proceed() throws Exception;
}
