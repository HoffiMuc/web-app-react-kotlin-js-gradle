@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import org.w3c.dom.events.KeyboardEvent

external enum class HotkeyScope {
    LOCAL /* = "local" */,
    GLOBAL /* = "global" */
}

external open class HotkeysEvents(scope: HotkeyScope) {
    open var scope: Any
    open var actions: Any
    open fun count(): Number
    open fun clear()
    open fun setHotkeys(props: IHotkeysProps /* IHotkeysProps & `T$7` */)
    open var handleKeyDown: (e: KeyboardEvent) -> Unit
    open var handleKeyUp: (e: KeyboardEvent) -> Unit
    open var invokeNamedCallbackIfComboRecognized: Any
    open var isScope: Any
    open var isTextInput: Any
}
