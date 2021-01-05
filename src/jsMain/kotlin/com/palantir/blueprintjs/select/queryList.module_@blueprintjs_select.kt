@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/select")
@file:JsNonModule
package com.palantir.blueprintjs.select

import React.Pick
import org.w3c.dom.events.Event
import react.PureComponent
import react.RState
import tsstdlib.Readonly

external interface IQueryListProps<T> : IListItemsProps<T> {
    var initialActiveItem: T?
        get() = definedExternally
        set(value) = definedExternally
    var onKeyDown: Any?
        get() = definedExternally
        set(value) = definedExternally
    var onKeyUp: Any?
        get() = definedExternally
        set(value) = definedExternally
    var renderer: (listProps: IQueryListRendererProps<T>) -> dynamic
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IQueryListRendererProps<T> : Pick<IQueryListState<T>, String /* "activeItem" | "filteredItems" | "query" */>, IProps {
    var handleItemSelect: (item: T, event: Event) -> Unit
    var handlePaste: (queries: Array<String>) -> Unit
    var handleKeyDown: Any
    var handleKeyUp: Any
    var handleQueryChange: Any
    var itemList: Any
}

external interface IQueryListState<T> : RState {
    var activeItem: dynamic /* T? | ICreateNewItem? */
        get() = definedExternally
        set(value) = definedExternally
    var createNewItem: T?
    var filteredItems: Array<T>
    var query: String
}

external interface `T$3` {
    var disabled: Boolean
    var resetOnQuery: Boolean
}

external open class QueryList<T>(props: IQueryListProps<T>, context: Any = definedExternally) : PureComponent<IQueryListProps<T>, IQueryListState<T>> {
    open var itemsParentRef: Any
    open var refHandlers: Any
    open var shouldCheckActiveItemInViewport: Any
    open var expectedNextActiveItem: Any
    open var isEnterKeyPressed: Any
    override fun render(): dynamic
    open fun componentDidUpdate(prevProps: IQueryListProps<T>)
    open fun scrollActiveItemIntoView()
    open fun setQuery(query: String, resetActiveItem: Boolean? = definedExternally, props: Readonly<IQueryListProps<T>> /* Readonly<IQueryListProps<T>> & Readonly<`T$4`> */ = definedExternally)
    open fun setActiveItem(activeItem: T?)
    open fun setActiveItem(activeItem: ICreateNewItem?)
    open var renderItemList: Any
    open var renderItem: Any
    open var renderCreateItemMenuItem: Any
    open var getActiveElement: Any
    open var getActiveIndex: Any
    open var getItemsParentPadding: Any
    open var handleItemCreate: Any
    open var handleItemSelect: Any
    open var handlePaste: Any
    open var handleKeyDown: Any
    open var handleKeyUp: Any
    open var handleInputQueryChange: Any
    open var getNextActiveItem: Any
    open var isCreateItemRendered: Any
    open var isCreateItemFirst: Any
    open var canCreateItems: Any
    open var wouldCreatedItemMatchSomeExistingItem: Any
    open var maybeResetQuery: Any

    companion object {
        var displayName: String
        var defaultProps: `T$3`
        fun <U> ofType(): Any
    }
}

external fun <T> getFirstEnabledItem(items: Array<T>, itemDisabled: Any = definedExternally, direction: Number = definedExternally, startIndex: Number = definedExternally): dynamic /* T? | ICreateNewItem? */

external fun <T> getFirstEnabledItem(items: Array<T>): dynamic /* T? | ICreateNewItem? */

external fun <T> getFirstEnabledItem(items: Array<T>, itemDisabled: Any = definedExternally): dynamic /* T? | ICreateNewItem? */

external fun <T> getFirstEnabledItem(items: Array<T>, itemDisabled: Any = definedExternally, direction: Number = definedExternally): dynamic /* T? | ICreateNewItem? */

external fun <T> getFirstEnabledItem(items: Array<T>, itemDisabled: (item: T, index: Number) -> Boolean = definedExternally, direction: Number = definedExternally, startIndex: Number = definedExternally): dynamic /* T? | ICreateNewItem? */

external fun <T> getFirstEnabledItem(items: Array<T>, itemDisabled: (item: T, index: Number) -> Boolean = definedExternally): dynamic /* T? | ICreateNewItem? */

external fun <T> getFirstEnabledItem(items: Array<T>, itemDisabled: (item: T, index: Number) -> Boolean = definedExternally, direction: Number = definedExternally): dynamic /* T? | ICreateNewItem? */
