@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import kotlinx.html.P
import org.w3c.dom.HTMLInputElement
import react.PureComponent
import react.RState

external interface IControlProps : IProps, HTMLInputProps {
    var alignIndicator: Any?
        get() = definedExternally
        set(value) = definedExternally
    override var checked: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    override var children: Any?
        get() = definedExternally
        set(value) = definedExternally
    override var defaultChecked: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    override var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var inputRef: ((ref: HTMLInputElement?) -> Any)?
        get() = definedExternally
        set(value) = definedExternally
    var inline: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var label: String?
        get() = definedExternally
        set(value) = definedExternally
    var labelElement: Any?
        get() = definedExternally
        set(value) = definedExternally
    var large: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    override var onChange: Any?
        get() = definedExternally
        set(value) = definedExternally
    var tagName: Any?
        get() = definedExternally
        set(value) = definedExternally
    override var className: String?
}

external interface ISwitchProps : IControlProps {
    var innerLabelChecked: String?
        get() = definedExternally
        set(value) = definedExternally
    var innerLabel: String?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Switch(props: P, context: Any = definedExternally) : PureComponent<ISwitchProps, RState> {
    override fun render(): dynamic

    companion object {
        var displayName: String
    }
}

external open class Radio(props: P, context: Any = definedExternally) : PureComponent<IRadioProps, RState> {
    override fun render(): dynamic

    companion object {
        var displayName: String
    }
}

external interface ICheckboxProps : IControlProps {
    var defaultIndeterminate: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var indeterminate: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ICheckboxState : RState {
    var indeterminate: Boolean
}

external open class Checkbox(props: P, context: Any = definedExternally) : PureComponent<ICheckboxProps, ICheckboxState> {
    override var state: ICheckboxState
    open var input: Any
    override fun render(): dynamic
    override fun componentDidMount()
    open fun componentDidUpdate()
    open var updateIndeterminate: Any
    open var handleChange: Any
    open var handleInputRef: Any

    companion object {
        var displayName: String
        fun getDerivedStateFromProps(__0: ICheckboxProps): ICheckboxState?
    }
}
