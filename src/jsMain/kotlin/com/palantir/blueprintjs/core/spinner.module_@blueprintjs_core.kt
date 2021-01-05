@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import kotlinx.html.P
import react.PureComponent
import react.RProps
import react.RState

external interface ISpinnerProps : IProps, IIntentProps {
    var size: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tagName: Any?
        get() = definedExternally
        set(value) = definedExternally
    var value: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$26` {
    var className: String
}

external open class Spinner(props: P, context: Any = definedExternally) : PureComponent<ISpinnerProps, RState> {
    open fun componentDidUpdate(prevProps: ISpinnerProps)
    override fun render(): dynamic /* String | (props: Any) -> React.ReactElement<Any, dynamic /* String | Any */>? | Any */
    fun validateProps(__0: ISpinnerProps)
    open var getSize: Any
    open var getViewBox: Any

    companion object {
        var displayName: String
        var SIZE_SMALL: Any = definedExternally
        var SIZE_STANDARD: Any = definedExternally
        var SIZE_LARGE: Any = definedExternally
    }
}
