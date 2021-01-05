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

external interface IPopoverSharedProps : IOverlayableProps, IProps {
    var boundary: Boundary?
        get() = definedExternally
        set(value) = definedExternally
    var captureDismiss: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var defaultIsOpen: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var hoverCloseDelay: Number?
        get() = definedExternally
        set(value) = definedExternally
    var hoverOpenDelay: Number?
        get() = definedExternally
        set(value) = definedExternally
    var inheritDarkTheme: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var isOpen: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var minimal: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var modifiers: Modifiers?
        get() = definedExternally
        set(value) = definedExternally
    var onInteraction: ((nextOpenState: Boolean, e: Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var openOnTargetFocus: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var popoverClassName: String?
        get() = definedExternally
        set(value) = definedExternally
    var position: Any?
        get() = definedExternally
        set(value) = definedExternally
    var targetClassName: String?
        get() = definedExternally
        set(value) = definedExternally
    var targetProps: Any?
        get() = definedExternally
        set(value) = definedExternally
    var targetTagName: Any?
        get() = definedExternally
        set(value) = definedExternally
    override var usePortal: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var wrapperTagName: Any?
        get() = definedExternally
        set(value) = definedExternally
}
