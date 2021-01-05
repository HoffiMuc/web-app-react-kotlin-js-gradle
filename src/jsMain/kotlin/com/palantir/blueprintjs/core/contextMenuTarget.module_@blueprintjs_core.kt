@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

import React.MouseEventHandler
import com.palantir.blueprintjs.core.IConstructor
import org.w3c.dom.HTMLElement
import react.PureComponent
import react.RProps
import react.RState

external interface IContextMenuTargetComponent : PureComponent<RProps, RState> {
    override fun render(): dynamic
    fun renderContextMenu(e: MouseEventHandler<HTMLElement>): dynamic
    val onContextMenuClose: (() -> Unit)?
}

external fun <T : IConstructor<IContextMenuTargetComponent>> ContextMenuTarget(WrappedComponent: T): dynamic
