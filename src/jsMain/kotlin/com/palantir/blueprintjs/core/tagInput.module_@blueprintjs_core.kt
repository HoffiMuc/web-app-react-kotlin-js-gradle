@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import React.ReactNodeArray
import React.Readonly
import kotlinx.html.P
import org.w3c.dom.HTMLElement
import org.w3c.dom.HTMLInputElement
import react.PureComponent
import react.RState

external interface ITagInputProps : IIntentProps, IProps {
    var addOnBlur: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var addOnPaste: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var fill: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var inputProps: HTMLInputProps?
        get() = definedExternally
        set(value) = definedExternally
    var inputRef: ((input: HTMLInputElement?) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var inputValue: String?
        get() = definedExternally
        set(value) = definedExternally
    var large: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var leftIcon: dynamic /* Any | JSX.Element? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var onAdd: ((values: Array<String>, method: String? /* "default" | "blur" | "paste" */) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    var onChange: ((values: ReactNodeArray) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    var onInputChange: Any?
        get() = definedExternally
        set(value) = definedExternally
    var onKeyDown: ((event: React.KeyboardEvent<HTMLElement>, index: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onKeyUp: ((event: React.KeyboardEvent<HTMLElement>, index: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onRemove: ((value: dynamic, index: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var placeholder: String?
        get() = definedExternally
        set(value) = definedExternally
    var rightElement: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var separator: dynamic /* String? | RegExp? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var tagProps: dynamic /* ITagProps? | ((value: React.ReactNode, index: Number) -> ITagProps)? */
        get() = definedExternally
        set(value) = definedExternally
    var values: ReactNodeArray
}

external interface ITagInputPropsPartial : IIntentPropsPartial, IPropsPartial {
    var addOnBlur: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var addOnPaste: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var fill: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var inputProps: HTMLInputProps?
        get() = definedExternally
        set(value) = definedExternally
    var inputRef: ((input: HTMLInputElement?) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var inputValue: String?
        get() = definedExternally
        set(value) = definedExternally
    var large: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var leftIcon: dynamic /* Any | JSX.Element? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var onAdd: ((values: Array<String>, method: String? /* "default" | "blur" | "paste" */) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    var onChange: ((values: ReactNodeArray) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    var onInputChange: Any?
        get() = definedExternally
        set(value) = definedExternally
    var onKeyDown: ((event: React.KeyboardEvent<HTMLElement>, index: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onKeyUp: ((event: React.KeyboardEvent<HTMLElement>, index: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onRemove: ((value: dynamic, index: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var placeholder: String?
        get() = definedExternally
        set(value) = definedExternally
    var rightElement: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var separator: dynamic /* String? | RegExp? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var tagProps: dynamic /* ITagProps? | ((value: React.ReactNode, index: Number) -> ITagProps)? */
        get() = definedExternally
        set(value) = definedExternally
    var values: ReactNodeArray?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ITagInputState : RState {
    var activeIndex: Number
    var inputValue: String
    var isInputFocused: Boolean
    var prevInputValueProp: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ITagInputStatePartial : RState {
    var activeIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var inputValue: String?
        get() = definedExternally
        set(value) = definedExternally
    var isInputFocused: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var prevInputValueProp: String?
        get() = definedExternally
        set(value) = definedExternally
}

external open class TagInput(props: P, context: Any = definedExternally) : PureComponent<ITagInputProps, ITagInputState> {
    override var state: ITagInputState
    open var inputElement: Any
    open var refHandlers: Any
    override fun render(): dynamic
    open var addTags: Any
    open var maybeRenderTag: Any
    open var getNextActiveIndex: Any
    open var findNextIndex: Any
    open var getValues: Any
    open var handleContainerClick: Any
    open var handleContainerBlur: Any
    open var handleInputFocus: Any
    open var handleInputChange: Any
    open var handleInputKeyDown: Any
    open var handleInputKeyUp: Any
    open var handleInputPaste: Any
    open var handleRemoveTag: Any
    open var handleBackspaceToRemove: Any
    open var handleDeleteToRemove: Any
    open var removeIndexFromValues: Any
    open var invokeKeyPressCallback: Any
    open var isValidIndex: Any

    companion object {
        var displayName: String
        var defaultProps: ITagInputPropsPartial
        fun getDerivedStateFromProps(props: Readonly<ITagInputProps>, state: Readonly<ITagInputState>): ITagInputStatePartial?
    }
}
