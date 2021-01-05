//@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
//@file:JsModule("@blueprintjs/core")
//@file:JsNonModule
//package com.palantir.blueprintjs.core
//
//import React.Readonly
//
//external open class AbstractComponent2<P, S, SS>(props: P, context: Any = definedExternally) : React.Component<P, S, SS> {
//    override var componentWillUpdate: ((nextProps: Readonly<P>, nextState: Readonly<S>, nextContext: Any) -> Unit)?
//    override var componentWillReceiveProps: ((nextProps: Readonly<P>, nextContext: Any) -> Unit)?
//    override var componentWillMount: (() -> Unit)?
//    open var getDerivedStateFromProps: Any
//    open var displayName: Any
//    open var timeoutIds: Any
//    open var requestIds: Any
//    open fun componentDidUpdate(_prevProps: P, _prevState: S, _snapshot: SS = definedExternally)
//    open fun componentWillUnmount()
//    open fun requestAnimationFrame(callback: () -> Unit): () -> Unit
//    open fun setTimeout(callback: () -> Unit, timeout: Number = definedExternally): () -> Unit
//    open var clearTimeouts: () -> Unit
//    open var cancelAnimationFrames: () -> Unit
//    open fun validateProps(_props: P)
//}
