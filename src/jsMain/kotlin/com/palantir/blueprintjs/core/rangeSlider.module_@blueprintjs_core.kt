@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import kotlinx.html.P
import react.PureComponent
import react.RState

external interface IRangeSliderProps : ISliderBaseProps {
    var value: dynamic /* JsTuple<Number, Number> */
        get() = definedExternally
        set(value) = definedExternally
    val onChange: ((value: dynamic /* JsTuple<Number, Number> */) -> Unit)?
    val onRelease: ((value: dynamic /* JsTuple<Number, Number> */) -> Unit)?
}

external open class RangeSlider(props: P, context: Any = definedExternally) : PureComponent<IRangeSliderProps, RState> {
    override fun render(): dynamic
    fun validateProps(props: IRangeSliderProps)

    companion object {
        var defaultProps: IRangeSliderProps
        var displayName: String
    }
}
