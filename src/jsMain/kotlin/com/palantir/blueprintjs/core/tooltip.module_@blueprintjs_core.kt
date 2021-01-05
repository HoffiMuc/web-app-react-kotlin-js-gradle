@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import kotlinx.html.P
import react.PureComponent
import react.RState

external interface ITooltipProps : IPopoverSharedProps, IIntentProps {
    var content: dynamic /* JSX.Element | String */
        get() = definedExternally
        set(value) = definedExternally
    override var hoverCloseDelay: Number?
        get() = definedExternally
        set(value) = definedExternally
    override var hoverOpenDelay: Number?
        get() = definedExternally
        set(value) = definedExternally
    var interactionKind: Any?
        get() = definedExternally
        set(value) = definedExternally
    override var transitionDuration: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ITooltipPropsPartial : IPopoverSharedPropsPartial, IIntentPropsPartial {
    var content: dynamic /* JSX.Element? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var hoverCloseDelay: Number?
        get() = definedExternally
        set(value) = definedExternally
    var hoverOpenDelay: Number?
        get() = definedExternally
        set(value) = definedExternally
    var interactionKind: Any?
        get() = definedExternally
        set(value) = definedExternally
    override var transitionDuration: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Tooltip(props: P, context: Any = definedExternally) : PureComponent<ITooltipProps, RState> {
    open var popover: Any
    override fun render(): dynamic
    open fun reposition()

    companion object {
        var displayName: String
        var defaultProps: ITooltipPropsPartial
    }
}
