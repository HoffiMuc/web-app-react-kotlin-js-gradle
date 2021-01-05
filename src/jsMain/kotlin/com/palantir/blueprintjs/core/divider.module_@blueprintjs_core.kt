@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import kotlinx.html.P
import org.w3c.dom.HTMLElement
import react.PureComponent
import react.RState

external interface IDividerProps : IProps, React.HTMLAttributes<HTMLElement> {
    var tagName: Any?
        get() = definedExternally
        set(value) = definedExternally
    override var className: String?
}

external open class Divider(props: P, context: Any = definedExternally) : PureComponent<IDividerProps, RState> {
    override fun render(): dynamic

    companion object {
        var displayName: String
    }
}
