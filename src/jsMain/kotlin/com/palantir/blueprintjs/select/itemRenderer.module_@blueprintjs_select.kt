@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/select")
@file:JsNonModule
package com.palantir.blueprintjs.select

external interface IItemModifiers {
    var active: Boolean
    var disabled: Boolean
    var matchesPredicate: Boolean
}

external interface IItemRendererProps {
    var handleClick: Any
    var index: Number?
        get() = definedExternally
        set(value) = definedExternally
    var modifiers: IItemModifiers
    var query: String
}
