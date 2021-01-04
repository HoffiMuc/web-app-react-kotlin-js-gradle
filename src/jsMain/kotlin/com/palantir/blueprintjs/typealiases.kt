package com.palantir.blueprintjs

import com.palantir.blueprintjs.select.IItemListRendererProps
import com.palantir.blueprintjs.select.IItemRendererProps
import react.ReactElement

typealias IconName = String
typealias ItemListPredicate<T> = (query: String, items: Array<T>) -> Array<T>
typealias ItemPredicate<T> = (query: String, item: T, index: Number, exactMatch: Boolean) -> Boolean

typealias ItemRenderer<T> = (item: T, itemProps: IItemRendererProps) -> ReactElement?
typealias ItemListRenderer<T> = (itemListProps: IItemListRendererProps<T>) -> ReactElement?
