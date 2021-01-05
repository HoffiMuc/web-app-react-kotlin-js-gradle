@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import kotlinx.html.P
import org.w3c.dom.HTMLButtonElement
import org.w3c.dom.HTMLElement
import react.PureComponent
import react.RState


external interface IButtonProps : IActionProps, IElementRefProps<HTMLButtonElement> {
    /** artificially added global Property */
    var href: String?
    /** artificially added global Property */
    var title: String?

    var active: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var alignText: Any?
        get() = definedExternally
        set(value) = definedExternally
    var fill: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var large: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var loading: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var minimal: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var outlined: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var rightIcon: dynamic /* Any | JSX.Element? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var small: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var type: String? /* "submit" | "reset" | "button" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface IButtonState : RState {
    var isActive: Boolean
}

/** getCommonButtonProps */
external interface `T$20` {
    var className: String
    var disabled: dynamic /* Any | Any */
        get() = definedExternally
        set(value) = definedExternally
    var onBlur: (e: React.FocusEvent<Any>) -> Unit
    var onClick: Any
    var onKeyDown: (e: React.KeyboardEvent<Any>) -> Unit
    var onKeyUp: (e: React.KeyboardEvent<Any>) -> Unit
    var tabIndex: dynamic /* Number? | Any */
        get() = definedExternally
        set(value) = definedExternally
}

external open class AbstractButton<H : React.HTMLAttributes<HTMLElement>>(props: P, context: Any = definedExternally) : PureComponent<IButtonProps /* IButtonProps & H */, IButtonState> {
    open var buttonRef: dynamic /* HTMLElement? | IRefObject<HTMLElement>? */
    open var currentKeyDown: Any
    override fun render(): dynamic
    open fun getCommonButtonProps(): `T$20`
    open var handleKeyDown: (e: React.KeyboardEvent<Any>) -> Unit
    open var handleKeyUp: (e: React.KeyboardEvent<Any>) -> Unit
    open var handleBlur: (e: React.FocusEvent<Any>) -> Unit
    open fun renderChildren(): dynamic
}
