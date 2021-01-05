@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import kotlinx.html.P
import org.w3c.dom.HTMLElement
import org.w3c.dom.events.Event
import react.PureComponent
import react.RState

external interface IAlertProps : IOverlayLifecycleProps, IProps {
    var canEscapeKeyCancel: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canOutsideClickCancel: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var cancelButtonText: String?
        get() = definedExternally
        set(value) = definedExternally
    var confirmButtonText: String?
        get() = definedExternally
        set(value) = definedExternally
    var icon: dynamic /* Any | JSX.Element? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var intent: Any?
        get() = definedExternally
        set(value) = definedExternally
    var isOpen: Boolean
    var style: Any?
        get() = definedExternally
        set(value) = definedExternally
    var transitionDuration: Number?
        get() = definedExternally
        set(value) = definedExternally
    var portalContainer: HTMLElement?
        get() = definedExternally
        set(value) = definedExternally
    val onCancel: ((evt: Event) -> Unit)?
    val onConfirm: ((evt: Event) -> Unit)?
    val onClose: ((confirmed: Boolean, evt: Event) -> Unit)?
}

external open class Alert(props: P, context: Any = definedExternally) : PureComponent<IAlertProps, RState> {
    override fun render(): dynamic
    fun validateProps(props: IAlertProps)
    open var handleCancel: Any
    open var handleConfirm: Any
    open var internalHandleCallbacks: Any

    companion object {
        var defaultProps: IAlertProps
        var displayName: String
    }
}
