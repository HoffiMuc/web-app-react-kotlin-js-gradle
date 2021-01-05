@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import kotlinx.html.P
import org.w3c.dom.HTMLSelectElement
import react.PureComponent
import react.RState

external interface IHTMLSelectProps : IElementRefProps<HTMLSelectElement>, React.SelectHTMLAttributes<HTMLSelectElement> {
    override var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var fill: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var iconProps: Any?
        get() = definedExternally
        set(value) = definedExternally
    var large: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var minimal: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    override var multiple: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    override var onChange: Any?
        get() = definedExternally
        set(value) = definedExternally
    var options: Array<dynamic /* String | Number | IOptionProps */>?
        get() = definedExternally
        set(value) = definedExternally
    override var value: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    override var className: String?
}

external open class HTMLSelect(props: P, context: Any = definedExternally) : PureComponent<IHTMLSelectProps, RState> {
    override fun render(): dynamic
}
