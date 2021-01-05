@file:JsModule("@blueprintjs/select")
@file:JsNonModule
package com.palantir.blueprintjs.select


import com.palantir.blueprintjs.ItemListPredicate
import com.palantir.blueprintjs.ItemListRenderer
import com.palantir.blueprintjs.ItemPredicate
import com.palantir.blueprintjs.ItemRenderer
import com.palantir.blueprintjs.core.IInputGroupProps
import com.palantir.blueprintjs.core.IProps
import kotlinx.html.P
import org.w3c.dom.HTMLElement
import org.w3c.dom.HTMLInputElement
import react.PureComponent
import react.RState
import react.ReactElement

external interface IListItemsProps<T> : IProps {
    var activeItem: dynamic /* T? | ICreateNewItem? */
        get() = definedExternally
        set(value) = definedExternally
    var items: Array<T>
    var itemsEqual: dynamic /* ItemsEqualComparator<T>? | Any */
        get() = definedExternally
        set(value) = definedExternally
    var itemDisabled: dynamic /* Any | ((item: T, index: Number) -> Boolean)? */
        get() = definedExternally
        set(value) = definedExternally
    var itemListPredicate: ItemListPredicate<T>?
        get() = definedExternally
        set(value) = definedExternally
    var itemPredicate: ItemPredicate<T>?
        get() = definedExternally
        set(value) = definedExternally
    var itemRenderer: ItemRenderer<T>
    var itemListRenderer: ItemListRenderer<T>?
        get() = definedExternally
        set(value) = definedExternally
    var initialContent: Any?
        get() = definedExternally
        set(value) = definedExternally
    var noResults: Any?
        get() = definedExternally
        set(value) = definedExternally
    var onActiveItemChange: ((activeItem: T?, isCreateNewItem: Boolean) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onItemSelect: (item: T, event: React.SyntheticEvent<HTMLElement>) -> Unit
    var onItemsPaste: ((items: Array<T>) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onQueryChange: ((query: String, event: React.ChangeEvent<HTMLInputElement>) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var createNewItemFromQuery: ((query: String) -> T)?
        get() = definedExternally
        set(value) = definedExternally
    var createNewItemRenderer: ((query: String, active: Boolean, handleClick: React.MouseEventHandler<HTMLElement>) -> ReactElement?)?
        get() = definedExternally
        set(value) = definedExternally
    var createNewItemPosition: String? /* "first" | "last" */
        get() = definedExternally
        set(value) = definedExternally
    var resetOnQuery: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var resetOnSelect: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var scrollToActiveItem: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var query: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ISelectProps<T> : IListItemsProps<T> {
    var filterable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var inputProps: IInputGroupProps? /* IInputGroupProps? & HTMLInputProps? */
        get() = definedExternally
        set(value) = definedExternally
    var popoverProps: Any? /* Any? & Any? */
        get() = definedExternally
        set(value) = definedExternally
    var resetOnClose: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ISelectState : RState {
    var isOpen: Boolean
}

open external class Select<T>(props: P, context: Any = definedExternally) : PureComponent<ISelectProps<T>, ISelectState> {
    open var TypedQueryList: Any
    open var inputEl: Any
    open var queryList: Any
    open var previousFocusedElement: Any
    open var refHandlers: Any
    override fun render(): ReactElement
    open fun componentDidUpdate(_prevProps: ISelectProps<T>, prevState: ISelectState)
    open var renderQueryList: Any
    open var maybeRenderClearButton: Any
    open var handleTargetKeyDown: Any
    open var handleItemSelect: Any
    open var handlePopoverInteraction: Any
    open var handlePopoverOpening: Any
    open var handlePopoverOpened: Any
    open var handlePopoverClosing: Any
    open var resetQuery: Any

    companion object {
        var displayName: String
        fun <U> ofType(): Select<U>
    }
}
