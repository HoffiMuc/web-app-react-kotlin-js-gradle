@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import kotlinx.html.P
import org.w3c.dom.HTMLInputElement
import react.PureComponent
import react.RState

external interface IRadioGroupProps : IProps {
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var inline: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var label: Any?
        get() = definedExternally
        set(value) = definedExternally
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var onChange: (event: React.FormEvent<HTMLInputElement>) -> Unit
    var options: Array<IOptionProps>?
        get() = definedExternally
        set(value) = definedExternally
    var selectedValue: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
}

external open class RadioGroup(props: P, context: Any = definedExternally) : PureComponent<IRadioGroupProps, RState> {
    open var autoGroupName: Any
    override fun render(): dynamic
    open fun validateProps()
    open var renderChildren: Any
    open var renderOptions: Any
    open var getRadioProps: Any

    companion object {
        var displayName: String
    }
}
