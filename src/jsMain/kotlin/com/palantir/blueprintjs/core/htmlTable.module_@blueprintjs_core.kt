@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import kotlinx.html.P
import org.w3c.dom.HTMLTableElement
import react.PureComponent
import react.RState

external interface IHTMLTableProps : React.TableHTMLAttributes<HTMLTableElement>, IElementRefProps<HTMLTableElement> {
    var bordered: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var condensed: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var interactive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var small: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var striped: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    override var className: String?
}

external open class HTMLTable(props: P, context: Any = definedExternally) : PureComponent<IHTMLTableProps, RState> {
    override fun render(): dynamic
}
