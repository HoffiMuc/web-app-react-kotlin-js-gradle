@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

external fun isFunction(value: Any): Boolean

external fun <R> safeInvoke(func: (() -> R)?): R?

external fun <A, R> safeInvoke(func: ((arg1: A) -> R)?, arg1: A): R?

external fun <A, B, R> safeInvoke(func: ((arg1: A, arg2: B) -> R)?, arg1: A, arg2: B): R?

external fun <A, B, C, R> safeInvoke(func: ((arg1: A, arg2: B, arg3: C) -> R)?, arg1: A, arg2: B, arg3: C): R?

external fun <A, B, C, D, R> safeInvoke(func: ((arg1: A, arg2: B, arg3: C, arg4: D) -> R)?, arg1: A, arg2: B, arg3: C, arg4: D): R?

external fun <R> safeInvokeOrValue(funcOrValue: (() -> R)?): R

external fun <R> safeInvokeOrValue(funcOrValue: R?): R

external fun <A, R> safeInvokeOrValue(funcOrValue: ((arg1: A) -> R)?, arg1: A): R

external fun <A, R> safeInvokeOrValue(funcOrValue: R?, arg1: A): R

external fun <A, B, R> safeInvokeOrValue(funcOrValue: ((arg1: A, arg2: B) -> R)?, arg1: A, arg2: B): R

external fun <A, B, R> safeInvokeOrValue(funcOrValue: R?, arg1: A, arg2: B): R

external fun <A, B, C, R> safeInvokeOrValue(funcOrValue: ((arg1: A, arg2: B, arg3: C) -> R)?, arg1: A, arg2: B, arg3: C): R

external fun <A, B, C, R> safeInvokeOrValue(funcOrValue: R?, arg1: A, arg2: B, arg3: C): R

external fun <A, B, C, D, R> safeInvokeOrValue(funcOrValue: ((arg1: A, arg2: B, arg3: C, arg4: D) -> R)?, arg1: A, arg2: B, arg3: C, arg4: D): R

external fun <A, B, C, D, R> safeInvokeOrValue(funcOrValue: R?, arg1: A, arg2: B, arg3: C, arg4: D): R
