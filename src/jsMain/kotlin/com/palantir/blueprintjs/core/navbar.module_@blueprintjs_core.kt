@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import kotlinx.html.P
import react.PureComponent
import react.RState

external interface INavbarProps : IProps, HTMLDivProps {
    var fixedToTop: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    override var className: String?
}

external open class Navbar(props: P, context: Any = definedExternally) : PureComponent<INavbarProps, RState> {
    override fun render(): dynamic

    companion object {
        var displayName: String
        var Divider: Any
        var Group: Any
        var Heading: Any
    }
}
