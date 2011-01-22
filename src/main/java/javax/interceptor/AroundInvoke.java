/*
 * JBoss, Home of Professional Open Source
 * Copyright 2010 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package javax.interceptor;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Defines a method which intercepts invocation of another method.  The annotated method must not be final, must not be
 * static, and must accept exactly one parameter of type {@link InvocationContext}, returning an {@link Object}.
 * <p/>
 * The annotation may be applied a method of the target class (or a superclass thereof), or to a method of any
 * interceptor class; however only one method of the class may be so annotated.
 * <p/>
 * An {@code @AroundInvoke} interceptor method can invoke any component or resource that the method it is intercepting
 * can invoke.  In particular, the same transaction and security contexts apply to the interceptor method as to the
 * intercepted method.
 */
@Target(METHOD)
@Retention(RUNTIME)
public @interface AroundInvoke {}
