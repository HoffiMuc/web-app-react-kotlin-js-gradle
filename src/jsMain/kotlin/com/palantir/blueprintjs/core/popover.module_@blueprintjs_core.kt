@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import kotlinx.html.P
import org.w3c.dom.HTMLElement
import react.PureComponent
import react.RState

external object PopoverInteractionKind {
    var CLICK: String /* "click" */
    var CLICK_TARGET_ONLY: String /* "click-target" */
    var HOVER: String /* "hover" */
    var HOVER_TARGET_ONLY: String /* "hover-target" */
}

external interface IPopoverProps : IPopoverSharedProps {
    var backdropProps: Any?
        get() = definedExternally
        set(value) = definedExternally
    var content: dynamic /* String? | JSX.Element? */
        get() = definedExternally
        set(value) = definedExternally
    var fill: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var interactionKind: Any?
        get() = definedExternally
        set(value) = definedExternally
    var hasBackdrop: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var popoverRef: ((ref: HTMLElement?) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var target: dynamic /* String? | JSX.Element? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface IPopoverState : RState {
    var transformOrigin: String
    var isOpen: Boolean
    var hasDarkParent: Boolean
}

external open class Popover(props: P, context: Any = definedExternally) : PureComponent<IPopoverProps, IPopoverState> {
    open var popoverRef: Any
    open var popoverElement: HTMLElement?
    open var targetElement: HTMLElement?
    override var state: IPopoverState
    open var cancelOpenTimeout: Any
    open var isMouseInTargetOrPopover: Any
    open var lostFocusOnSamePage: Any
    open var popperScheduleUpdate: Any
    open var refHandlers: Any
    override fun render(): dynamic
    override fun componentDidMount()
    open fun componentDidUpdate(props: IPopoverProps, state: IPopoverState)
    open var reposition: () -> Unit?
    fun validateProps(props: IPopoverProps /* IPopoverProps & `T$9` */)
    open var updateDarkParent: Any
    open var renderPopover: Any
    open var renderTarget: Any
    open var understandChildren: Any
    open var isControlled: Any
    open var getIsOpen: Any
    open var getPopperModifiers: Any
    open var handleTargetFocus: Any
    open var handleTargetBlur: Any
    open var handleMouseEnter: Any
    open var handleMouseLeave: Any
    open var handlePopoverClick: Any
    open var handleOverlayClose: Any
    open var handleTargetClick: Any
    open var setOpenState: Any
    open var isArrowEnabled: Any
    open var isElementInPopover: Any
    open var isHoverInteractionKind: Any
    open var updatePopoverState: Any

    companion object {
        var displayName: String
        var defaultProps: IPopoverProps
    }
}
