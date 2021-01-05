@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/select")
@file:JsNonModule
package com.palantir.blueprintjs.select

import React.ReactNodeArray
import org.w3c.dom.HTMLElement
import org.w3c.dom.HTMLInputElement

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
