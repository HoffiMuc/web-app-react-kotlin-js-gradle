@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import kotlinx.html.P
import org.w3c.dom.HTMLTextAreaElement
import react.PureComponent
import react.RState

external interface ITextAreaProps : IIntentProps, IProps, React.TextareaHTMLAttributes<HTMLTextAreaElement> {
    var fill: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var large: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var small: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var growVertically: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var inputRef: dynamic /* IRefObject<HTMLTextAreaElement>? | IRefCallback<HTMLTextAreaElement>? */
        get() = definedExternally
        set(value) = definedExternally
    override var className: String?
}

external interface ITextAreaState : RState {
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class TextArea(props: P, context: Any = definedExternally) : PureComponent<ITextAreaProps, ITextAreaState> {
    override var state: ITextAreaState
    open var textareaRef: Any
    open var refHandlers: Any
    override fun componentDidMount()
    open fun componentDidUpdate(prevProps: ITextAreaProps)
    override fun render(): dynamic
    open var handleChange: Any

    companion object {
        var displayName: String
    }
}
