@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import kotlinx.html.P
import org.w3c.dom.HTMLElement

external open class Button(props: P, context: Any = definedExternally) : AbstractButton<React.HTMLAttributes<HTMLElement>> {
    override var buttonRef: dynamic /* HTMLButtonElement? | IRefObject<HTMLButtonElement>? */
    open var handleRef: dynamic /* IRefObject<HTMLButtonElement> | (ref: HTMLButtonElement?) -> Unit */
    override fun render(): dynamic

    companion object {
        var displayName: String
    }
}

external open class AnchorButton(props: P, context: Any = definedExternally) : AbstractButton<React.HTMLAttributes<HTMLElement>> {
    override var buttonRef: dynamic /* HTMLAnchorElement? | IRefObject<HTMLAnchorElement>? */
    open var handleRef: dynamic /* IRefObject<HTMLAnchorElement> | (ref: HTMLAnchorElement?) -> Unit */
    override fun render(): dynamic

    companion object {
        var displayName: String
    }
}
