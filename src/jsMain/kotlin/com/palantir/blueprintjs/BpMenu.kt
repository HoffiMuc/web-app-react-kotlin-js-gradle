@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs

import kotlinx.html.P
import org.w3c.dom.HTMLUListElement
import react.PureComponent
import react.RState
import react.ReactElement

external interface IMenuProps : IProps {
    /** Whether the menu items in this menu should use a large appearance. */
    var large: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    /** Ref handler that receives the HTML `<ul>` element backing this component. */
    var ulRef: ((ref: HTMLUListElement?) -> Any)?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Menu(props: P, context: Any = definedExternally) : PureComponent<IMenuProps, RState> {
    override fun render(): ReactElement?

    companion object {
        var displayName: String
        var Divider: Any
        var Item: Any
    }
}

external interface IMenuDividerProps : IProps {
    var children: Any?
        get() = definedExternally
        set(value) = definedExternally
    var title: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external open class MenuDivider : PureComponent<IMenuDividerProps, RState> {
    override fun render(): ReactElement?

    companion object {
        var displayName: String
    }
}

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
    //var tagName = "a"
    var textClassName: String?
        get() = definedExternally
        set(value) = definedExternally
    var htmlTitle: String?
        get() = definedExternally
        set(value) = definedExternally
}

external open class MenuItem(props: P, context: Any = definedExternally) : PureComponent<IMenuItemProps /* IMenuItemProps & React.AnchorHTMLAttributes<HTMLAnchorElement> */, RState> {
    override fun render(): ReactElement?
    open var maybeRenderLabel: Any
    open var maybeRenderPopover: Any

    companion object {
        var defaultProps: IMenuItemProps
        var displayName: String
    }
}
