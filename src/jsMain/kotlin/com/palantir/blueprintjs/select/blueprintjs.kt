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