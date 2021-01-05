@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import kotlinx.html.P
import react.PureComponent
import react.RState

external interface INavbarDividerProps : IProps, HTMLDivProps {
    override var className: String?
}

external open class NavbarDivider(props: P, context: Any = definedExternally) : PureComponent<INavbarDividerProps, RState> {
    override fun render(): dynamic

    companion object {
        var displayName: String
    }
}
