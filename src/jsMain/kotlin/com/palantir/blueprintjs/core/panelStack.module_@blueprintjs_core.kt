@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import kotlinx.html.P
import react.PureComponent
import react.RState

external interface IPanelStackProps : IProps {
    var initialPanel: IPanel<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var onClose: ((removedPanel: IPanel__0) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onOpen: ((addedPanel: IPanel__0) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var renderActivePanelOnly: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var showPanelHeader: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var stack: Array<IPanel<Any>>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IPanelStackState : RState {
    var direction: String /* "push" | "pop" */
    var stack: Array<IPanel__0>
}

external open class PanelStack(props: P, context: Any = definedExternally) : PureComponent<IPanelStackProps, IPanelStackState> {
    override var state: IPanelStackState
    open fun componentDidUpdate(prevProps: IPanelStackProps, prevState: IPanelStackState)
    override fun render(): dynamic
    fun validateProps(props: IPanelStackProps)
    open var renderPanels: Any
    open var renderPanel: Any
    open var handlePanelClose: Any
    open var handlePanelOpen: Any
}
