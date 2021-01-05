@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import kotlinx.html.P
import org.w3c.dom.HTMLElement
import react.PureComponent
import react.RState

external interface IToaster {
    fun show(props: IToastProps, key: String = definedExternally): String
    fun dismiss(key: String, timeoutExpired: Boolean = definedExternally)
    fun clear()
    fun getToasts(): Array<IToastProps /* IToastProps & `T$28` */>
}

external interface IToasterProps : IProps {
    var autoFocus: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canEscapeKeyClear: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var usePortal: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var position: Any?
        get() = definedExternally
        set(value) = definedExternally
    var maxToasts: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IToasterState : RState {
    var toasts: Array<IToastProps /* IToastProps & `T$28` */>
}

external open class Toaster(props: P, context: Any = definedExternally) : PureComponent<IToasterProps, IToasterState>, IToaster {
    override var state: IToasterState
    open var toastId: Any
    override fun show(props: IToastProps, key: String): String
    override fun dismiss(key: String, timeoutExpired: Boolean)
    override fun clear()
    override fun getToasts(): Array<IToastProps /* IToastProps & `T$28` */>
    override fun render(): dynamic
    fun validateProps(__0: IToasterProps)
    open var isNewToastKey: Any
    open var dismissIfAtLimit: Any
    open var renderToast: Any
    open var createToastOptions: Any
    open var getPositionClasses: Any
    open var getDismissHandler: Any
    open var handleClose: Any

    companion object {
        var displayName: String
        var defaultProps: IToasterProps
        fun create(props: IToasterProps = definedExternally, container: HTMLElement = definedExternally): IToaster
    }
}
