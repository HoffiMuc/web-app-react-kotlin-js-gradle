@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import kotlinx.html.P
import react.PureComponent
import react.RProps
import react.RState

external interface INavbarGroupProps : IProps, HTMLDivProps {
    var align: Any?
        get() = definedExternally
        set(value) = definedExternally
    override var className: String?
}

external open class NavbarGroup(props: P, context: Any = definedExternally) : PureComponent<INavbarGroupProps, RState> {
    override fun render(): dynamic

    companion object {
        var displayName: String
        var defaultProps: INavbarGroupProps
    }
}
