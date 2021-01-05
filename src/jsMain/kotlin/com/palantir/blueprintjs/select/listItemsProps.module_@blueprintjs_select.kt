@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/select")
@file:JsNonModule
package com.palantir.blueprintjs.select

import React.ChangeEventHandler
import org.w3c.dom.HTMLElement
import org.w3c.dom.HTMLInputElement
import org.w3c.dom.events.Event

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
    var onItemSelect: (item: T, event: Event) -> Unit
    var onItemsPaste: ((items: Array<T>) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onQueryChange: ((query: String, event: ChangeEventHandler<HTMLInputElement>) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var createNewItemFromQuery: ((query: String) -> T)?
        get() = definedExternally
        set(value) = definedExternally
    var createNewItemRenderer: ((query: String, active: Boolean, handleClick: React.MouseEventHandler<HTMLElement>) -> dynamic)?
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

external interface IListItemsPropsPartial<T> : IProps {
}

external fun <T> executeItemsEqual(itemsEqualProp: ItemsEqualComparator<T>?, itemA: T?, itemB: T?): Boolean

external fun <T> executeItemsEqual(itemsEqualProp: Any, itemA: T?, itemB: T?): Boolean
