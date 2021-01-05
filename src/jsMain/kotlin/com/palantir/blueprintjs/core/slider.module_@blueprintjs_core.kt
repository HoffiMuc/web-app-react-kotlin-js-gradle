@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import kotlinx.html.P
import react.PureComponent
import react.RState

external interface ISliderProps : ISliderBaseProps {
    var initialValue: Number?
        get() = definedExternally
        set(value) = definedExternally
    var value: Number?
        get() = definedExternally
        set(value) = definedExternally
    val onChange: ((value: Number) -> Unit)?
    val onRelease: ((value: Number) -> Unit)?
}

external open class Slider(props: P, context: Any = definedExternally) : PureComponent<ISliderProps, RState> {
    override fun render(): dynamic

    companion object {
        var defaultProps: ISliderProps
        var displayName: String
    }
}
