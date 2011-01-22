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
