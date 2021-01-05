@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/select")
@file:JsNonModule
package com.palantir.blueprintjs.select

import React.MouseEventHandler
import org.w3c.dom.HTMLButtonElement
import org.w3c.dom.HTMLDivElement
import org.w3c.dom.HTMLSpanElement

external interface ITagProps : IProps, IIntentProps, IElementRefProps<HTMLSpanElement>, React.HTMLAttributes<HTMLSpanElement> {
    var active: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var fill: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var icon: dynamic /* Any | JSX.Element? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var interactive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var large: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var minimal: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var multiline: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    override var onClick: MouseEventHandler<HTMLDivElement>?
        get() = definedExternally
        set(value) = definedExternally
    var onRemove: ((e: MouseEventHandler<HTMLButtonElement>, tagProps: ITagProps) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var rightIcon: dynamic /* Any | JSX.Element? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var round: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var htmlTitle: String?
        get() = definedExternally
        set(value) = definedExternally
    override var className: String?
}
