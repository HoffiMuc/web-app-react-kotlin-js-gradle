@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import kotlinx.html.P
import react.PureComponent
import react.RState

external interface IInputGroupProps : IControlledProps, IIntentProps, IProps {
    var asyncControl: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var fill: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var inputRef: dynamic /* IRefObject<HTMLInputElement>? | IRefCallback<HTMLInputElement>? */
        get() = definedExternally
        set(value) = definedExternally
    var leftElement: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var leftIcon: dynamic /* Any | JSX.Element? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var large: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var small: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var placeholder: String?
        get() = definedExternally
        set(value) = definedExternally
    var rightElement: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var round: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IInputGroupState : RState {
    var leftElementWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var rightElementWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class InputGroup(props: P, context: Any = definedExternally) : PureComponent<IInputGroupProps /* IInputGroupProps & HTMLInputProps */, IInputGroupState> {
    override var state: IInputGroupState
    open var leftElement: Any
    open var rightElement: Any
    open var refHandlers: Any
    override fun render(): dynamic
    override fun componentDidMount()
    open fun componentDidUpdate(prevProps: IInputGroupProps /* IInputGroupProps & HTMLInputProps */)
    fun validateProps(props: IInputGroupProps)
    open var maybeRenderLeftElement: Any
    open var maybeRenderRightElement: Any
    open var updateInputWidth: Any

    companion object {
        var displayName: String
    }
}
