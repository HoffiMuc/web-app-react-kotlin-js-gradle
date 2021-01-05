@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import kotlinx.html.P
import org.w3c.dom.HTMLUListElement
import react.PureComponent
import react.RProps
import react.RState

external interface IMenuProps : IProps, React.HTMLAttributes<HTMLUListElement> {
    var large: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var ulRef: ((ref: HTMLUListElement?) -> Any)?
        get() = definedExternally
        set(value) = definedExternally
    override var className: String?
}

external open class Menu(props: P, context: Any = definedExternally) : PureComponent<IMenuProps, RState> {
    override fun render(): dynamic

    companion object {
        var displayName: String
        var Divider: Any
        var Item: Any
    }
}
