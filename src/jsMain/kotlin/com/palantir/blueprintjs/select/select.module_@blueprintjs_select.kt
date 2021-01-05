@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/select")
@file:JsNonModule
package com.palantir.blueprintjs.select

import kotlinx.html.P
import react.PureComponent
import react.RState

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

external open class Select<T>(props: P, context: Any = definedExternally) : PureComponent<ISelectProps<T>, ISelectState> {
    override var state: ISelectState
    open var TypedQueryList: Any
    open var inputEl: Any
    open var queryList: Any
    open var previousFocusedElement: Any
    open var refHandlers: Any
    override fun render(): dynamic
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
