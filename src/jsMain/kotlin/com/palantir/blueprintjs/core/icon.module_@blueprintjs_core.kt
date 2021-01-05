@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import kotlinx.html.P
import react.PureComponent
import react.RState

external interface IIconProps : IIntentProps, IProps {
    var children: Any?
        get() = definedExternally
        set(value) = definedExternally
    var color: String?
        get() = definedExternally
        set(value) = definedExternally
    var htmlTitle: String?
        get() = definedExternally
        set(value) = definedExternally
    var icon: dynamic /* Any | JSX.Element? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var iconSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var style: Any?
        get() = definedExternally
        set(value) = definedExternally
    var tagName: Any?
        get() = definedExternally
        set(value) = definedExternally
    var title: dynamic /* String? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
}

external open class Icon(props: P, context: Any = definedExternally) : PureComponent<IIconProps, RState> {
    override fun render(): dynamic
    open var renderSvgPaths: Any

    companion object {
        var displayName: String
        var SIZE_STANDARD: Any = definedExternally
        var SIZE_LARGE: Any = definedExternally
    }
}
