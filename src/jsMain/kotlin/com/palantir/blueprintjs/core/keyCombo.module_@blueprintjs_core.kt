@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import kotlinx.html.P
import react.PureComponent
import react.RProps
import react.RState

external interface IKeyComboProps : IProps {
    var combo: String
    var minimal: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class KeyCombo(props: P, context: Any = definedExternally) : PureComponent<IKeyComboProps, RState> {
    override fun render(): dynamic
    open var renderKey: Any
    open var renderMinimalKey: Any

    companion object {
        var displayName: String
    }
}
