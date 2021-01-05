@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core


external object HandleType {
    var FULL: String /* "full" */
    var START: String /* "start" */
    var END: String /* "end" */
}

external object HandleInteractionKind {
    var LOCK: String /* "lock" */
    var PUSH: String /* "push" */
    var NONE: String /* "none" */
}

external interface IHandleProps : IProps {
    var value: Number
    var intentAfter: Any?
        get() = definedExternally
        set(value) = definedExternally
    var intentBefore: Any?
        get() = definedExternally
        set(value) = definedExternally
    var trackStyleAfter: Any?
        get() = definedExternally
        set(value) = definedExternally
    var trackStyleBefore: Any?
        get() = definedExternally
        set(value) = definedExternally
    var interactionKind: Any?
        get() = definedExternally
        set(value) = definedExternally
    var onChange: ((newValue: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onRelease: ((newValue: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var type: Any?
        get() = definedExternally
        set(value) = definedExternally
}
