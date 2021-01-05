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

external interface IPopoverProps : IPopoverSharedProps {
    var backdropProps: Any?
        get() = definedExternally
        set(value) = definedExternally
    var content: dynamic /* String? | JSX.Element? */
        get() = definedExternally
        set(value) = definedExternally
    var fill: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var interactionKind: Any?
        get() = definedExternally
        set(value) = definedExternally
    var hasBackdrop: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var popoverRef: ((ref: HTMLElement?) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var target: dynamic /* String? | JSX.Element? */
        get() = definedExternally
        set(value) = definedExternally
}
