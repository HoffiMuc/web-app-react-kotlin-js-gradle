@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import org.w3c.dom.Element

external interface IResizeEntry {
    var contentRect: IDOMRectReadOnly
    var target: Element
}

external interface IDOMRectReadOnly {
    var x: Number
    var y: Number
    var width: Number
    var height: Number
    var top: Number
    var right: Number
    var bottom: Number
    var left: Number
}
