package com.palantir.blueprintjs.select

import org.w3c.dom.HTMLInputElement

typealias ItemRenderer<T> = (item: T, itemProps: IItemRendererProps) -> dynamic
typealias ItemsEqualComparator<T> = (itemA: T, itemB: T) -> Boolean
typealias ItemListPredicate<T> = (query: String, items: Array<T>) -> Array<T>
typealias ItemPredicate<T> = (query: String, item: T, index: Number, exactMatch: Boolean) -> Boolean
typealias HTMLInputProps = React.InputHTMLAttributes<HTMLInputElement>
typealias IRefCallback<T> = (ref: T?) -> Any
typealias ItemListRenderer<T> = (itemListProps: IItemListRendererProps<T>) -> dynamic


typealias ModifierFn = (data: dynamic, options: Any) -> dynamic

typealias Placement = String

typealias Boundary = String

typealias BaseModifier = Popper.BaseModifier

typealias Modifiers = Popper.Modifiers

typealias PopperOptions = Popper.PopperOptions

typealias ReferenceObject = Popper.ReferenceObject
