@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import kotlinx.html.P
import org.w3c.dom.HTMLLabelElement
import react.PureComponent
import react.RProps
import react.RState

external interface IFileInputProps : React.LabelHTMLAttributes<HTMLLabelElement>, RProps {
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var fill: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var hasSelection: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var inputProps: Any?
        get() = definedExternally
        set(value) = definedExternally
    var large: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var onInputChange: Any?
        get() = definedExternally
        set(value) = definedExternally
    var text: Any?
        get() = definedExternally
        set(value) = definedExternally
    var buttonText: String?
        get() = definedExternally
        set(value) = definedExternally
    override var className: String?
}

external open class FileInput(props: P, context: Any = definedExternally) : PureComponent<IFileInputProps, RState> {
    override fun render(): dynamic
    open var handleInputChange: Any

    companion object {
        var displayName: String
        var defaultProps: IFileInputProps
    }
}
