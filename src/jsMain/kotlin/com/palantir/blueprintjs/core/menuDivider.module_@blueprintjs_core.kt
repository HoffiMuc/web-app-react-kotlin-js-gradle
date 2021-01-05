@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import react.PureComponent
import react.RProps
import react.RState


external interface IMenuDividerProps : IProps {
    var children: Any?
        get() = definedExternally
        set(value) = definedExternally
    var title: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external open class MenuDivider : PureComponent<IMenuDividerProps, RState> {
    override fun render(): dynamic

    companion object {
        var displayName: String
    }
}
