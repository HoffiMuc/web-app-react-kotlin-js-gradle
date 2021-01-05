@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import react.PureComponent
import react.RProps
import react.RState
import react.ReactElement

external interface IHotkeysTargetComponent : PureComponent<RProps, RState> {
    override fun render(): dynamic
    fun renderHotkeys(): ReactElement
}

external interface `T$6` {
    var displayName: String
}

external fun <T : IConstructor<IHotkeysTargetComponent>> HotkeysTarget(WrappedComponent: T): `T$6` /* `T$6` & T */
