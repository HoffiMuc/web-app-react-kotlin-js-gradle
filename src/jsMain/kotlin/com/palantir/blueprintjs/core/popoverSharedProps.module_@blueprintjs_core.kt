@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import org.w3c.dom.events.Event

external object PopoverPosition {
    var AUTO: String /* "auto" */
    var AUTO_END: String /* "auto-end" */
    var AUTO_START: String /* "auto-start" */
    var BOTTOM: String /* "bottom" */
    var BOTTOM_LEFT: String /* "bottom-left" */
    var BOTTOM_RIGHT: String /* "bottom-right" */
    var LEFT: String /* "left" */
    var LEFT_BOTTOM: String /* "left-bottom" */
    var LEFT_TOP: String /* "left-top" */
    var RIGHT: String /* "right" */
    var RIGHT_BOTTOM: String /* "right-bottom" */
    var RIGHT_TOP: String /* "right-top" */
    var TOP: String /* "top" */
    var TOP_LEFT: String /* "top-left" */
    var TOP_RIGHT: String /* "top-right" */
}

external interface IPopoverSharedProps : IOverlayableProps, IProps {
    var boundary: Boundary?
        get() = definedExternally
        set(value) = definedExternally
    var captureDismiss: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var defaultIsOpen: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var hoverCloseDelay: Number?
        get() = definedExternally
        set(value) = definedExternally
    var hoverOpenDelay: Number?
        get() = definedExternally
        set(value) = definedExternally
    var inheritDarkTheme: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var isOpen: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var minimal: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var modifiers: Any?
        get() = definedExternally
        set(value) = definedExternally
    var onInteraction: ((nextOpenState: Boolean, e: Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var openOnTargetFocus: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var popoverClassName: String?
        get() = definedExternally
        set(value) = definedExternally
    var position: Any?
        get() = definedExternally
        set(value) = definedExternally
    var targetClassName: String?
        get() = definedExternally
        set(value) = definedExternally
    var targetProps: Any?
        get() = definedExternally
        set(value) = definedExternally
    var targetTagName: Any?
        get() = definedExternally
        set(value) = definedExternally
    override var usePortal: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var wrapperTagName: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IPopoverSharedPropsPartial : IOverlayableProps, IProps {
}
