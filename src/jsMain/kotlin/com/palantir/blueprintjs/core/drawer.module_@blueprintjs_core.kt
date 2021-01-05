@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import kotlinx.html.P
import react.PureComponent
import react.RState

external interface IDrawerProps : IOverlayableProps, IBackdropProps, IProps {
    var icon: dynamic /* Any | JSX.Element? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var isCloseButtonShown: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var isOpen: Boolean
    var position: Any?
        get() = definedExternally
        set(value) = definedExternally
    var size: dynamic /* Number? | String? */
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
    var vertical: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Drawer(props: P, context: Any = definedExternally) : PureComponent<IDrawerProps, RState> {
    override fun render(): dynamic
    fun validateProps(props: IDrawerProps)
    open var maybeRenderCloseButton: Any
    open var maybeRenderHeader: Any

    companion object {
        var displayName: String
        var defaultProps: IDrawerProps
        var SIZE_SMALL: Any = definedExternally
        var SIZE_STANDARD: Any = definedExternally
        var SIZE_LARGE: Any = definedExternally
    }
}
