@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import kotlinx.html.P
import react.PureComponent
import react.RState

external interface ITabProps : IProps { // , Omit<HTMLDivProps, String /* "id" | "title" | "onClick" */> {
    var children: Any?
        get() = definedExternally
        set(value) = definedExternally
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var id: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var panel: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var panelClassName: String?
        get() = definedExternally
        set(value) = definedExternally
    var title: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ITabPropsPartial : IPropsPartial { //, OmitPartial<HTMLDivProps, String /* "id" | "title" | "onClick" */> {
    var children: Any?
        get() = definedExternally
        set(value) = definedExternally
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var id: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var panel: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var panelClassName: String?
        get() = definedExternally
        set(value) = definedExternally
    var title: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Tab(props: P, context: Any = definedExternally) : PureComponent<ITabProps, RState> {
    override fun render(): dynamic

    companion object {
        var defaultProps: ITabPropsPartial
        var displayName: String
    }
}
