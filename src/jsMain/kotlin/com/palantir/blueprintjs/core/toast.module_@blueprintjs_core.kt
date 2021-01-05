@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import kotlinx.html.P
import react.PureComponent
import react.RState

external interface IToastProps : IProps, IIntentProps {
    var action: IActionProps? /* IActionProps? & ILinkProps? */
        get() = definedExternally
        set(value) = definedExternally
    var icon: dynamic /* Any | JSX.Element? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var message: Any
    var onDismiss: ((didTimeoutExpire: Boolean) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var timeout: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Toast(props: P, context: Any = definedExternally) : PureComponent<IToastProps, RState> {
    override fun render(): dynamic
    override fun componentDidMount()
    open fun componentDidUpdate(prevProps: IToastProps)
    override fun componentWillUnmount()
    open var maybeRenderActionButton: Any
    open var handleActionClick: Any
    open var handleCloseClick: Any
    open var triggerDismiss: Any
    open var startTimeout: Any

    companion object {
        var defaultProps: IToastProps
        var displayName: String
    }
}
