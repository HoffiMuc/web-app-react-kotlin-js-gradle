@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import react.ReactElement

external fun isReactNodeEmpty(node: dynamic = definedExternally, skipArray: Boolean = definedExternally): Boolean

external fun ensureElement(child: dynamic?, tagName: Any = definedExternally): ReactElement?

external fun <T> isReactElement(child: dynamic): Boolean

external interface INamed {
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
}

external fun getDisplayName(ComponentClass: dynamic): String

external fun getDisplayName(ComponentClass: INamed): String

external fun <P> isElementOfType(element: Any, ComponentType: dynamic): Boolean

external fun <T> createReactRef(): dynamic
