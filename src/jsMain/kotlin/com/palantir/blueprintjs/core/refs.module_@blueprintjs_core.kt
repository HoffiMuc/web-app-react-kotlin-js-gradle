@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import org.w3c.dom.HTMLElement

external interface IRefObject<T> {
    var current: T?
}

external fun <T : HTMLElement> isRefObject(value: IRefObject<T>?): Boolean

external fun <T : HTMLElement> isRefObject(value: IRefCallback<T>?): Boolean

external fun <T : HTMLElement> isRefCallback(value: IRefObject<T>?): Boolean

external fun <T : HTMLElement> isRefCallback(value: IRefCallback<T>?): Boolean

external fun <T> getRef(ref: T?): T?

external fun <T> getRef(ref: IRefObject<T>?): T?
