@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

external interface IKeyAllowlist<T> {
    var include: Array<Any>
}

external interface IKeyDenylist<T> {
    var exclude: Array<Any>
}

external fun arraysEqual(arrA: Array<Any>, arrB: Array<Any>, compare: (a: Any, b: Any) -> Boolean = definedExternally): Boolean

external fun <T : Any> shallowCompareKeys(objA: T, objB: T, keys: IKeyDenylist<T> = definedExternally): Boolean

external fun <T : Any> shallowCompareKeys(objA: T, objB: T): Boolean

external fun <T : Any> shallowCompareKeys(objA: T, objB: T, keys: IKeyAllowlist<T> = definedExternally): Boolean

external fun deepCompareKeys(objA: Any, objB: Any, keys: Array<Any /* String | Number | Any */> = definedExternally): Boolean

external interface `T$29` {
    var key: Any
    var valueA: Any
    var valueB: Any
}

external fun <T : Any> getDeepUnequalKeyValues(objA: T = definedExternally, objB: T = definedExternally, keys: Array<Any> = definedExternally): Array<`T$29`>
