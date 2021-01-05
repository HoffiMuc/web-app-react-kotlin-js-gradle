@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import kotlinx.html.P
import react.PureComponent
import react.RState

external interface `T$3` {
    var tabIndex: Number
}

external open class Hotkeys(props: P, context: Any = definedExternally) : PureComponent<IHotkeysProps, RState> {
    override fun render(): dynamic
    fun validateProps(props: IHotkeysProps /* IHotkeysProps & `T$4` */)

    companion object {
        var displayName: String
        var defaultProps: `T$3`
    }
}
