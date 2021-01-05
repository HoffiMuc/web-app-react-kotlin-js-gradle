@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import kotlinx.html.P
import react.PureComponent
import react.RState

external interface IMenuItemProps : IActionProps, ILinkProps {
    var active: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var children: Any?
        get() = definedExternally
        set(value) = definedExternally
    override var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var label: String?
        get() = definedExternally
        set(value) = definedExternally
    var labelClassName: String?
        get() = definedExternally
        set(value) = definedExternally
    var labelElement: Any?
        get() = definedExternally
        set(value) = definedExternally
    var multiline: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var popoverProps: Any?
        get() = definedExternally
        set(value) = definedExternally
    var shouldDismissPopover: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var tagName: Any?
        get() = definedExternally
        set(value) = definedExternally
    var textClassName: String?
        get() = definedExternally
        set(value) = definedExternally
    var htmlTitle: String?
        get() = definedExternally
        set(value) = definedExternally
}

external open class MenuItem(props: P, context: Any = definedExternally) : PureComponent<IMenuItemProps, RState> {
    override fun render(): dynamic
    open var maybeRenderLabel: Any
    open var maybeRenderPopover: Any

    companion object {
        var defaultProps: IMenuItemProps
        var displayName: String
    }
}
