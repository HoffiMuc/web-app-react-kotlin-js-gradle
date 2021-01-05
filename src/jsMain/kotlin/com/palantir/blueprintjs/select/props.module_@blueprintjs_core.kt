@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/select")
@file:JsNonModule
package com.palantir.blueprintjs.select

import org.w3c.dom.HTMLElement
import react.RProps

external interface IProps : RProps {
    var className: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IIntentProps {
    var intent: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IControlledProps {
    var defaultValue: String?
        get() = definedExternally
        set(value) = definedExternally
    var onChange: Any?
        get() = definedExternally
        set(value) = definedExternally
    var value: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IElementRefProps<E : HTMLElement> {
    var elementRef: dynamic /* IRefObject<E>? | IRefCallback<E>? */
        get() = definedExternally
        set(value) = definedExternally
}
