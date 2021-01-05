@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import kotlinx.html.P
import react.PureComponent
import react.RProps
import react.RState

external interface IProgressBarProps : IProps, IIntentProps {
    var animate: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var stripes: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var value: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class ProgressBar(props: P, context: Any = definedExternally) : PureComponent<IProgressBarProps, RState> {
    override fun render(): dynamic

    companion object {
        var displayName: String
    }
}
