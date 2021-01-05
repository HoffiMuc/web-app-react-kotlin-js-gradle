@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import org.w3c.dom.HTMLElement
import org.w3c.dom.events.Event
import org.w3c.dom.events.EventTarget

external fun elementIsOrContains(element: HTMLElement, testElement: HTMLElement): Boolean

external fun throttleEvent(target: EventTarget, eventName: String, newEventName: String): (event: Event) -> Unit

external interface IThrottledReactEventOptions {
    var preventDefault: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external fun <E : Event> throttleReactEventCallback(callback: (event: E, otherArgs: Any) -> Any, options: IThrottledReactEventOptions = definedExternally): (event2: E) -> Unit

external fun <T : Function<*>> throttle(method: T): T
