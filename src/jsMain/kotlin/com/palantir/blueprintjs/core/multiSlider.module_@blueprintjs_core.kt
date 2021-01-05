@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import kotlinx.html.P
import react.PureComponent
import react.RState

external interface ISliderBaseProps : IProps, IIntentProps {
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var labelStepSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var labelValues: Array<Number>?
        get() = definedExternally
        set(value) = definedExternally
    var labelPrecision: Number?
        get() = definedExternally
        set(value) = definedExternally
    var max: Number?
        get() = definedExternally
        set(value) = definedExternally
    var min: Number?
        get() = definedExternally
        set(value) = definedExternally
    var showTrackFill: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var stepSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var labelRenderer: dynamic /* Boolean? | ((value: Number) -> dynamic)? */
        get() = definedExternally
        set(value) = definedExternally
    var vertical: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IMultiSliderProps : ISliderBaseProps {
    var defaultTrackIntent: Any?
        get() = definedExternally
        set(value) = definedExternally
    val onChange: ((values: Array<Number>) -> Unit)?
    val onRelease: ((values: Array<Number>) -> Unit)?
}

external interface ISliderState : RState {
    var labelPrecision: Number
    var tickSize: Number
    var tickSizeRatio: Number
}

external interface `T$25` {
    var labelPrecision: Number
}

external open class MultiSlider(props: P, context: Any = definedExternally) : PureComponent<IMultiSliderProps, ISliderState> {
    override var state: ISliderState
    open var handleElements: Any
    open var trackElement: Any
    open fun getSnapshotBeforeUpdate(prevProps: IMultiSliderProps): Nothing?
    override fun render(): dynamic
    override fun componentDidMount()
    open fun componentDidUpdate(prevProps: IMultiSliderProps, prevState: ISliderState)
    fun validateProps(props: dynamic)
    open var formatLabel: Any
    open var renderLabels: Any
    open var renderTracks: Any
    open var renderTrackFill: Any
    open var renderHandles: Any
    open var addHandleRef: Any
    open var maybeHandleTrackClick: Any
    open var maybeHandleTrackTouch: Any
    open var canHandleTrackEvent: Any
    open var nearestHandleForValue: Any
    open var getHandlerForIndex: Any
    open var getNewHandleValues: Any
    open var findFirstLockedHandleIndex: Any
    open var handleChange: Any
    open var handleRelease: Any
    open var getLabelValues: Any
    open var getOffsetRatio: Any
    open var getTrackIntent: Any
    open var updateTickSize: Any

    companion object {
        var defaultSliderProps: ISliderBaseProps
        var defaultProps: IMultiSliderProps
        var displayName: String
        var Handle: Any
        fun getDerivedStateFromProps(props: IMultiSliderProps): `T$25`
        var getLabelPrecision: Any
    }
}
