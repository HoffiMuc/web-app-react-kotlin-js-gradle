@file:JsModule("@blueprintjs/select")
@file:JsNonModule
package com.palantir.blueprintjs.select

import React.MouseEventHandler
import org.w3c.dom.HTMLElement

external interface IItemModifiers {
    var active: Boolean
    var disabled: Boolean
    var matchesPredicate: Boolean
}

external interface IItemRendererProps {
    var handleClick: MouseEventHandler<HTMLElement>
    var index: Number?
        get() = definedExternally
        set(value) = definedExternally
    var modifiers: IItemModifiers
    var query: String
}
