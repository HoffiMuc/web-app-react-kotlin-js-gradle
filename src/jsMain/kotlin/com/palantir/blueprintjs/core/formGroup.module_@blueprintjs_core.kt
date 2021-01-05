@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import kotlinx.html.P
import react.PureComponent
import react.RState

external interface IFormGroupProps : IIntentProps, IProps {
    var contentClassName: String?
        get() = definedExternally
        set(value) = definedExternally
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var helperText: Any?
        get() = definedExternally
        set(value) = definedExternally
    var inline: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var label: Any?
        get() = definedExternally
        set(value) = definedExternally
    var labelFor: String?
        get() = definedExternally
        set(value) = definedExternally
    var labelInfo: Any?
        get() = definedExternally
        set(value) = definedExternally
    var style: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external open class FormGroup(props: P, context: Any = definedExternally) : PureComponent<IFormGroupProps, RState> {
    override fun render(): dynamic
    open var getClassName: Any

    companion object {
        var displayName: String
    }
}
