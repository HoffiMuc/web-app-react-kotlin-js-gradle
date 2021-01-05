@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/select")
@file:JsNonModule
package com.palantir.blueprintjs.select

import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*
import kotlin.js.*

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
