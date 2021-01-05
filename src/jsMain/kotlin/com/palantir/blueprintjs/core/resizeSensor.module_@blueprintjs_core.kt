@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import kotlinx.html.P
import react.PureComponent
import react.RState

external interface IResizeSensorProps : IProps {
    var onResize: (entries: Array<IResizeEntry>) -> Unit
    var observeParents: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class ResizeSensor(props: P, context: Any = definedExternally) : PureComponent<IResizeSensorProps, RState> {
    open var element: Any
    open var observer: Any
    override fun render(): dynamic /* String? | Number? | Boolean? | Any? | React.ReactElement<Any, dynamic /* String | (props: Any) -> React.ReactElement<Any, dynamic /* String | Any */>? | Any */>? | React.ReactPortal? */
    override fun componentDidMount()
    open fun componentDidUpdate(prevProps: IResizeSensorProps)
    override fun componentWillUnmount()
    open var observeElement: Any
    open var getElement: Any

    companion object {
        var displayName: String
    }
}
