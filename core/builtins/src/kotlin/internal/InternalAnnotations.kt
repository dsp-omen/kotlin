/*
 * Copyright 2010-2016 JetBrains s.r.o.
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
 */

package kotlin.internal

import kotlin.annotation.AnnotationTarget.*

/**
 * Specifies that the corresponding type parameter is not used for unsafe operations such as casts or 'is' checks
 * That means it's completely safe to use generic types as argument for such parameter.
 */
@Target(TYPE_PARAMETER)
@Retention(AnnotationRetention.BINARY)
internal annotation class PureReifiable

/**
 * Specifies that the corresponding built-in method exists depending on platform.
 * Current implementation for JVM looks whether method with same JVM descriptor exists in the module JDK.
 * For example MutableMap.remove(K, V) available only if corresponding
 * method 'java/util/Map.remove(Ljava/lang/Object;Ljava/lang/Object;)Z' is defined in JDK (i.e. for major versions >= 8)
 */
@Target(FUNCTION)
@Retention(AnnotationRetention.BINARY)
internal annotation class PlatformDependent

/**
 * Specifies the first version of Kotlin where a declaration has appeared.
 * Using the declaration and specifying an older API version (via the `-api-version` command line option) will result in an error.
 */
@Target(CLASS, PROPERTY, CONSTRUCTOR, FUNCTION, PROPERTY_GETTER, PROPERTY_SETTER)
@Retention(AnnotationRetention.BINARY)
@Since("1.1")
internal annotation class Since(val version: String)
