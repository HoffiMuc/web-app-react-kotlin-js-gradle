@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/select")
@file:JsNonModule
package com.palantir.blueprintjs.select

import kotlinx.html.P
import react.PureComponent
import react.RState
import tsstdlib.Partial

external interface ISuggestProps<T> : IListItemsProps<T> {
    var closeOnSelect: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var fill: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var inputProps: IInputGroupProps? /* IInputGroupProps? & HTMLInputProps? */
        get() = definedExternally
        set(value) = definedExternally
    var inputValueRenderer: (item: T) -> String
    var defaultSelectedItem: T?
        get() = definedExternally
        set(value) = definedExternally
    var selectedItem: T?
        get() = definedExternally
        set(value) = definedExternally
    var openOnKeyDown: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var popoverProps: Any? /* Any? & Any? */
        get() = definedExternally
        set(value) = definedExternally
    var resetOnClose: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ISuggestPropsPartial<T> : IListItemsPropsPartial<T> {
    var closeOnSelect: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var fill: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var inputProps: IInputGroupProps? /* IInputGroupProps? & HTMLInputProps? */
        get() = definedExternally
        set(value) = definedExternally
    var inputValueRenderer: ((item: T) -> String)?
        get() = definedExternally
        set(value) = definedExternally
    var defaultSelectedItem: T?
        get() = definedExternally
        set(value) = definedExternally
    var selectedItem: T?
        get() = definedExternally
        set(value) = definedExternally
    var openOnKeyDown: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var popoverProps: Partial<IPopoverProps>? /* Partial<IPopoverProps>? & Any? */
        get() = definedExternally
        set(value) = definedExternally
    var resetOnClose: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ISuggestState<T> : RState {
    var isOpen: Boolean
    var selectedItem: T?
}

external open class Suggest<T>(props: P, context: Any = definedExternally) : PureComponent<ISuggestProps<T>, ISuggestState<T>> {
    override var state: ISuggestState<T>
    open var TypedQueryList: Any
    open var inputEl: Any
    open var queryList: Any
    open var refHandlers: Any
    override fun render(): dynamic
    open fun componentDidUpdate(_prevProps: ISuggestProps<T>, prevState: ISuggestState<T>)
    open var renderQueryList: Any
    open var selectText: Any
    open var handleInputFocus: Any
    open var handleItemSelect: Any
    open var getInitialSelectedItem: Any
    open var handlePopoverInteraction: Any
    open var handlePopoverOpening: Any
    open var handlePopoverOpened: Any
    open var getTargetKeyDownHandler: Any
    open var getTargetKeyUpHandler: Any
    open var maybeResetActiveItemToSelectedItem: Any

    companion object {
        var displayName: String
        var defaultProps: ISuggestPropsPartial<Any>
        fun <U> ofType(): Any
    }
}
