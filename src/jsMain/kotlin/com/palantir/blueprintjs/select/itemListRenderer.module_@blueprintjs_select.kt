@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/select")
@file:JsNonModule
package com.palantir.blueprintjs.select

import org.w3c.dom.HTMLElement

external interface IItemListRendererProps<T> {
    var activeItem: dynamic /* T? | ICreateNewItem? */
        get() = definedExternally
        set(value) = definedExternally
    var filteredItems: Array<T>
    var items: Array<T>
    var query: String
    var itemsParentRef: (ref: HTMLElement?) -> Unit
    var renderItem: (item: T, index: Number) -> dynamic
    var renderCreateItem: () -> dynamic
}

external fun renderFilteredItems(props: IItemListRendererProps<Any>, noResults: dynamic = definedExternally, initialContent: dynamic? = definedExternally): dynamic
