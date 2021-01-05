@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import kotlinx.html.P
import react.PureComponent
import react.RState

external interface ICalloutProps : IIntentProps, IProps, HTMLDivProps {
    var icon: dynamic /* Any | JSX.Element? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    override var intent: Any?
        get() = definedExternally
        set(value) = definedExternally
    override var title: String?
        get() = definedExternally
        set(value) = definedExternally
    override var className: String?
}

external open class Callout(props: P, context: Any = definedExternally) : PureComponent<ICalloutProps, RState> {
    override fun render(): dynamic
    open var getIconName: Any

    companion object {
        var displayName: String
    }
}
