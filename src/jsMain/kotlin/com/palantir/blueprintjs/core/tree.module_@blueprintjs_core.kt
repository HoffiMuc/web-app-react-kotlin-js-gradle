@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import org.w3c.dom.HTMLElement
import react.PureComponent
import react.RState

external interface ITreeProps<T> : IProps {
    var contents: Array<ITreeNode<T>>
    var onNodeClick: TreeEventHandler<T>?
        get() = definedExternally
        set(value) = definedExternally
    var onNodeCollapse: TreeEventHandler<T>?
        get() = definedExternally
        set(value) = definedExternally
    var onNodeContextMenu: TreeEventHandler<T>?
        get() = definedExternally
        set(value) = definedExternally
    var onNodeDoubleClick: TreeEventHandler<T>?
        get() = definedExternally
        set(value) = definedExternally
    var onNodeExpand: TreeEventHandler<T>?
        get() = definedExternally
        set(value) = definedExternally
    var onNodeMouseEnter: TreeEventHandler<T>?
        get() = definedExternally
        set(value) = definedExternally
    var onNodeMouseLeave: TreeEventHandler<T>?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Tree<T> : PureComponent<ITreeProps<T>, RState> {
    open var nodeRefs: Any
    override fun render(): dynamic
    open fun getNodeContentElement(nodeId: String): HTMLElement?
    open fun getNodeContentElement(nodeId: Number): HTMLElement?
    open var renderNodes: Any
    open var handleNodeCollapse: Any
    open var handleNodeClick: Any
    open var handleContentRef: Any
    open var handleNodeContextMenu: Any
    open var handleNodeDoubleClick: Any
    open var handleNodeExpand: Any
    open var handleNodeMouseEnter: Any
    open var handleNodeMouseLeave: Any
    open var handlerHelper: Any

    companion object {
        var displayName: String
        fun <U> ofType(): Any
        fun <U> nodeFromPath(path: Array<Number>, treeNodes: Array<ITreeNode<U>> = definedExternally): ITreeNode<U>
    }
}
