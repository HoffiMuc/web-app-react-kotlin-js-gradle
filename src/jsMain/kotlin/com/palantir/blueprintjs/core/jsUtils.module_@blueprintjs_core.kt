@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

external fun isNodeEnv(env: String): Boolean

external fun arrayLengthCompare(a: Array<Any> = definedExternally, b: Array<Any> = definedExternally): Number

external fun approxEqual(a: Number, b: Number, tolerance: Number = definedExternally): Boolean

external fun clamp(param_val: Number, min: Number, max: Number): Number

external fun countDecimalPlaces(num: Number): Number
