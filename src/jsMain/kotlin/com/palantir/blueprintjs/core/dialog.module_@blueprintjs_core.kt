@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import kotlinx.html.P
import react.PureComponent
import react.RState

external interface IDialogProps : IOverlayableProps, IBackdropProps, IProps {
    var isOpen: Boolean
    var icon: dynamic /* Any | JSX.Element? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var isCloseButtonShown: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var style: Any?
        get() = definedExternally
        set(value) = definedExternally
    var title: Any?
        get() = definedExternally
        set(value) = definedExternally
    var transitionName: String?
        get() = definedExternally
        set(value) = definedExternally
}
external interface IDialogPropsPartial : IOverlayableProps, IBackdropProps, IProps {
}

external open class Dialog(props: P, context: Any = definedExternally) : PureComponent<IDialogProps, RState> {
    override fun render(): dynamic
    fun validateProps(props: IDialogProps)
    open var maybeRenderCloseButton: Any
    open var maybeRenderHeader: Any

    companion object {
        var defaultProps: IDialogProps
        var displayName: String
    }
}
