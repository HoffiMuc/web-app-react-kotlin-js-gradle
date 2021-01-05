@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import kotlinx.html.P
import react.PureComponent
import react.RProps
import react.RState

external interface INavbarHeadingProps : IProps, HTMLDivProps {
    override var className: String?
}

external open class NavbarHeading(props: P, context: Any = definedExternally) : PureComponent<INavbarHeadingProps, RState> {
    override fun render(): dynamic

    companion object {
        var displayName: String
    }
}
