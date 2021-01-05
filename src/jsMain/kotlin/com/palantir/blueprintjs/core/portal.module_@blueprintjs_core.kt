@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import React.ValidationMap
import org.w3c.dom.HTMLElement
import react.PureComponent
import react.RState

external interface IPortalProps : IProps {
    var onChildrenMount: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var container: HTMLElement?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IPortalState : RState {
    var hasMounted: Boolean
}

external interface IPortalContext {
    var blueprintPortalClassName: String?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Portal : PureComponent<IPortalProps, IPortalState> {
    open var context: IPortalContext
    override var state: IPortalState
    open var portalElement: Any
    override fun render(): dynamic
    override fun componentDidMount()
    open fun componentDidUpdate(prevProps: IPortalProps)
    override fun componentWillUnmount()
    open var createContainerElement: Any
    open var unstableRenderNoPortal: Any

    companion object {
        var displayName: String
        var contextTypes: ValidationMap<IPortalContext>
        var defaultProps: IPortalProps
    }
}
