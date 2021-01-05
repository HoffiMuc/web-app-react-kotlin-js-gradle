@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

external interface IKeyCombo {
    var key: String?
        get() = definedExternally
        set(value) = definedExternally
    var modifiers: Number
}

external fun comboMatches(a: IKeyCombo, b: IKeyCombo): Boolean
