@file:JsModule("@blueprintjs/select")
@file:JsNonModule
package com.palantir.blueprintjs.select

import org.w3c.dom.HTMLElement
import react.ReactElement

external interface IItemListRendererProps<T> {
    var activeItem: dynamic /* T? | ICreateNewItem? */
        get() = definedExternally
        set(value) = definedExternally
    var filteredItems: Array<T>
    var items: Array<T>
    var query: String
    var itemsParentRef: (ref: HTMLElement?) -> Unit
    var renderItem: (item: T, index: Number) -> ReactElement?
    var renderCreateItem: () -> ReactElement?
}
