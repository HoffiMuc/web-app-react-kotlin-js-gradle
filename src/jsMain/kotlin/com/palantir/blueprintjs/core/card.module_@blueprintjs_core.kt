@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import React.MouseEventHandler
import kotlinx.html.P
import org.w3c.dom.HTMLDivElement
import react.PureComponent
import react.RState

external interface ICardProps : IProps, HTMLDivProps {
    var elevation: Any?
        get() = definedExternally
        set(value) = definedExternally
    var interactive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    override var onClick: MouseEventHandler<HTMLDivElement>?
        get() = definedExternally
        set(value) = definedExternally
    override var className: String?
}

external open class Card(props: P, context: Any = definedExternally) : PureComponent<ICardProps, RState> {
    override fun render(): dynamic

    companion object {
        var displayName: String
        var defaultProps: ICardProps
    }
}
