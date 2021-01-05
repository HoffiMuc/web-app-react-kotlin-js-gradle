@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

external fun <T : Any, K : Any, R> safeInvokeMember(obj: T?, key: K): R?

external fun <T : Any, K : Any, A, R> safeInvokeMember(obj: T?, key: K, arg1: A): R?

external fun <T : Any, K : Any, A, B, R> safeInvokeMember(obj: T?, key: K, arg1: A, arg2: B): R?

external fun <T : Any, K : Any, A, B, C, R> safeInvokeMember(obj: T?, key: K, arg1: A, arg2: B, arg3: C): R?
