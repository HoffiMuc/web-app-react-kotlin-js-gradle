@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import kotlinx.html.P
import org.w3c.dom.HTMLElement
import org.w3c.dom.events.Event
import react.PureComponent
import react.RState

external interface IOverlayableProps : IOverlayLifecycleProps {
    var autoFocus: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canEscapeKeyClose: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var enforceFocus: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var lazy: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var transitionDuration: Number?
        get() = definedExternally
        set(value) = definedExternally
    var usePortal: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var portalClassName: String?
        get() = definedExternally
        set(value) = definedExternally
    var portalContainer: HTMLElement?
        get() = definedExternally
        set(value) = definedExternally
    var onClose: ((event: Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IOverlayLifecycleProps {
    var onClosing: ((node: HTMLElement) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onClosed: ((node: HTMLElement) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onOpening: ((node: HTMLElement) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onOpened: ((node: HTMLElement) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IBackdropProps {
    var backdropClassName: String?
        get() = definedExternally
        set(value) = definedExternally
    var backdropProps: Any?
        get() = definedExternally
        set(value) = definedExternally
    var canOutsideClickClose: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var hasBackdrop: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IOverlayProps : IOverlayableProps, IBackdropProps, IProps {
    var isOpen: Boolean
    var transitionName: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IOverlayState : RState {
    var hasEverOpened: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$8` {
    var hasEverOpened: Boolean
}

external open class Overlay(props: P, context: Any = definedExternally) : PureComponent<IOverlayProps, IOverlayState> {
    override var state: IOverlayState
    open var containerElement: HTMLElement?
    open var refHandlers: Any
    override fun render(): dynamic
    override fun componentDidMount()
    open fun componentDidUpdate(prevProps: IOverlayProps)
    override fun componentWillUnmount()
    open var maybeRenderChild: Any
    open var maybeRenderBackdrop: Any
    open var overlayWillClose: Any
    open var overlayWillOpen: Any
    open var handleBackdropMouseDown: Any
    open var handleDocumentClick: Any
    open var handleDocumentFocus: Any
    open var handleKeyDown: Any
    open var handleTransitionAddEnd: Any

    companion object {
        var displayName: String
        var defaultProps: IOverlayProps
        fun getDerivedStateFromProps(__0: IOverlayProps): `T$8`?
        var openStack: Any
        var getLastOpened: Any
    }
}
