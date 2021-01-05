@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import org.w3c.dom.events.Event

external class AnimationEvent : Event {
    var animationName: String
    var elapsedTime: Number
    var pseudoElement: String
}

external class TransitionEvent : Event {
    var elapsedTime: Number
    var propertyName: String
    var pseudoElement: String
}
