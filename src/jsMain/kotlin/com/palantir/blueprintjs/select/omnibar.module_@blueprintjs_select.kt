@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/select")
@file:JsNonModule
package com.palantir.blueprintjs.select

import org.w3c.dom.events.Event
import react.PureComponent
import react.RState

external interface IOmnibarProps<T> : IListItemsProps<T> {
    var inputProps: IInputGroupProps? /* IInputGroupProps? & HTMLInputProps? */
        get() = definedExternally
        set(value) = definedExternally
    var isOpen: Boolean
    var onClose: ((event: Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var overlayProps: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Omnibar<T> : PureComponent<IOmnibarProps<T>, RState> {
    open var TypedQueryList: Any
    override fun render(): dynamic
    open var renderQueryList: Any
    open var handleOverlayClose: Any

    companion object {
        var displayName: String
        fun <U> ofType(): Any
    }
}
