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
