@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import org.w3c.dom.HTMLElement
import org.w3c.dom.events.MouseEvent
import react.RProps
import kotlin.js.Json

external var DISPLAYNAME_PREFIX: Any


external interface IProps : RProps {
    var className: String?
        get() = definedExternally
        set(value) = definedExternally
}
external interface IPropsPartial : RProps {
    var className: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IIntentProps {
    var intent: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IIntentPropsPartial {
    var intent: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IActionProps : IIntentProps, IProps {
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var icon: dynamic /* Any | JSX.Element? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var onClick: ((event: MouseEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var text: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ILinkProps {
    var href: String?
        get() = definedExternally
        set(value) = definedExternally
    var target: String?
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

external interface IElementRefProps<E : HTMLElement> : IProps {
    var elementRef: dynamic /* IRefObject<E>? | IRefCallback<E>? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface IOptionProps : IProps {
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var label: String?
        get() = definedExternally
        set(value) = definedExternally
    var value: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
}

external fun removeNonHTMLProps(props: Json, invalidProps: Array<String> = definedExternally, shouldMerge: Boolean = definedExternally): Json
