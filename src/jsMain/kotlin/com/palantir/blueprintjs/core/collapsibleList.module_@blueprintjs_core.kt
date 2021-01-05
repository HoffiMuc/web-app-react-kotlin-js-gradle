@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

import com.palantir.blueprintjs.core.IMenuItemProps
import com.palantir.blueprintjs.core.IPopoverProps
import com.palantir.blueprintjs.core.IProps
import com.palantir.blueprintjs.core.IPropsPartial
import react.PureComponent
import react.RState

external interface ICollapsibleListProps : IProps {
    var dropdownTarget: dynamic
    var dropdownProps: IPopoverProps?
        get() = definedExternally
        set(value) = definedExternally
    var visibleItemRenderer: (props: IMenuItemProps, index: Number) -> dynamic
    var collapseFrom: Any?
        get() = definedExternally
        set(value) = definedExternally
    var visibleItemClassName: String?
        get() = definedExternally
        set(value) = definedExternally
    var visibleItemCount: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ICollapsibleListPropsPartial : IPropsPartial {
    var dropdownTarget: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var dropdownProps: IPopoverProps?
        get() = definedExternally
        set(value) = definedExternally
    var visibleItemRenderer: ((props: IMenuItemProps, index: Number) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    var collapseFrom: Any?
        get() = definedExternally
        set(value) = definedExternally
    var visibleItemClassName: String?
        get() = definedExternally
        set(value) = definedExternally
    var visibleItemCount: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class CollapsibleList : PureComponent<ICollapsibleListProps, RState> {
    override fun render(): dynamic
    open var partitionChildren: Any

    companion object {
        var displayName: String
        var defaultProps: ICollapsibleListPropsPartial
    }
}
