@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import kotlinx.html.P
import org.w3c.dom.HTMLElement
import react.PureComponent
import react.RState

external interface ITextProps : IProps {
    var ellipsize: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var tagName: Any?
        get() = definedExternally
        set(value) = definedExternally
    var title: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ITextPropsPartial : IPropsPartial {
    var ellipsize: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var tagName: Any?
        get() = definedExternally
        set(value) = definedExternally
    var title: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ITextState : RState {
    var textContent: String
    var isContentOverflowing: Boolean
}

external interface `T$24` {
    var className: String
    var ref: (ref: HTMLElement?) -> HTMLElement?
    var title: String?
}

external open class Text(props: P, context: Any = definedExternally) : PureComponent<ITextProps, ITextState> {
    override var state: ITextState
    open var textRef: Any
    override fun componentDidMount()
    open fun componentDidUpdate()
    override fun render(): dynamic /* String | (props: Any) -> React.ReactElement<Any, dynamic /* String | Any */>? | Any */
    open var update: Any

    companion object {
        var displayName: String
        var defaultProps: ITextPropsPartial
    }
}
