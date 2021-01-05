@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/select")
@file:JsNonModule
package com.palantir.blueprintjs.select

import kotlinx.html.P
import react.PureComponent
import react.RState

external interface IMultiSelectProps<T> : IListItemsProps<T> {
    var fill: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var onRemove: ((value: T, index: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var openOnKeyDown: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var placeholder: String?
        get() = definedExternally
        set(value) = definedExternally
    var popoverProps: Any? /* Any? & Any? */
        get() = definedExternally
        set(value) = definedExternally
    var selectedItems: Array<T>?
        get() = definedExternally
        set(value) = definedExternally
    var tagInputProps: Any? /* Any? & Any? */
        get() = definedExternally
        set(value) = definedExternally
    var tagRenderer: (item: T) -> dynamic
}

external interface IMultiSelectState : RState {
    var isOpen: Boolean
}

external interface `T$5` {
    var fill: Boolean
    var placeholder: String
}

external open class MultiSelect<T>(props: P, context: Any = definedExternally) : PureComponent<IMultiSelectProps<T>, IMultiSelectState> {
    override var state: IMultiSelectState
    open var TypedQueryList: Any
    open var input: Any
    open var queryList: Any
    open var refHandlers: Any
    override fun render(): dynamic
    open var renderQueryList: Any
    open var handleItemSelect: Any
    open var handleQueryChange: Any
    open var handlePopoverInteraction: Any
    open var handlePopoverOpened: Any
    open var handleTagRemove: Any
    open var getTagInputKeyDownHandler: Any
    open var getTagInputKeyUpHandler: Any

    companion object {
        var displayName: String
        var defaultProps: `T$5`
        fun <U> ofType(): Any
    }
}
