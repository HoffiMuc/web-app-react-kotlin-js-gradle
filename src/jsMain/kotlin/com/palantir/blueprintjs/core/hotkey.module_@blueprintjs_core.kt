@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import kotlinx.html.P
import org.w3c.dom.events.KeyboardEvent
import react.PureComponent
import react.RState

external interface IHotkeyProps : IProps {
    var allowInInput: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var combo: String
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var label: Any
    var global: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var group: String?
        get() = definedExternally
        set(value) = definedExternally
    var preventDefault: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var stopPropagation: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    val onKeyDown: ((e: KeyboardEvent) -> Any)?
    val onKeyUp: ((e: KeyboardEvent) -> Any)?
}

external interface `T$5` {
    var allowInInput: Boolean
    var disabled: Boolean
    var global: Boolean
    var preventDefault: Boolean
    var stopPropagation: Boolean
}

external open class Hotkey(props: P, context: Any = definedExternally) : PureComponent<IHotkeyProps, RState> {
    override fun render(): dynamic
    fun validateProps(props: IHotkeyProps)

    companion object {
        var displayName: String
        var defaultProps: `T$5`
    }
}
