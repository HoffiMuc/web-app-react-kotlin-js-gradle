@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

external fun isPositionHorizontal(position: Any): Boolean

external fun isPositionVertical(position: Any): Boolean

external fun getPositionIgnoreAngles(position: Any): String /* "left" | "right" | "bottom" | "top" */
