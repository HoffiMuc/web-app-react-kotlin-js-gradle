@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import React.MouseEventHandler
import org.w3c.dom.HTMLDivElement
import org.w3c.dom.HTMLSpanElement
import react.PureComponent
import react.RState

external interface ITreeNode<T> : IProps {
    var childNodes: Array<ITreeNode<T>>?
        get() = definedExternally
        set(value) = definedExternally
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var hasCaret: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var icon: dynamic /* Any | JSX.Element? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var id: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var isExpanded: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var isSelected: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var label: dynamic /* String | JSX.Element */
        get() = definedExternally
        set(value) = definedExternally
    var secondaryLabel: dynamic /* String? | JSX.Element? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var nodeData: T?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ITreeNodeProps<T> : ITreeNode<T> {
    var children: Any?
        get() = definedExternally
        set(value) = definedExternally
    var contentRef: ((node: TreeNode<T>, element: HTMLDivElement?) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var depth: Number
    var key: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var onClick: ((node: TreeNode<T>, e: MouseEventHandler<HTMLDivElement>) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onCollapse: ((node: TreeNode<T>, e: MouseEventHandler<HTMLSpanElement>) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onContextMenu: ((node: TreeNode<T>, e: MouseEventHandler<HTMLDivElement>) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onDoubleClick: ((node: TreeNode<T>, e: MouseEventHandler<HTMLDivElement>) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onExpand: ((node: TreeNode<T>, e: MouseEventHandler<HTMLSpanElement>) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onMouseEnter: ((node: TreeNode<T>, e: MouseEventHandler<HTMLDivElement>) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onMouseLeave: ((node: TreeNode<T>, e: MouseEventHandler<HTMLDivElement>) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var path: Array<Number>
}

external open class TreeNode<T> : PureComponent<ITreeNodeProps<T>, RState> {
    override fun render(): dynamic
    open var maybeRenderCaret: Any
    open var maybeRenderSecondaryLabel: Any
    open var handleCaretClick: Any
    open var handleClick: Any
    open var handleContentRef: Any
    open var handleContextMenu: Any
    open var handleDoubleClick: Any
    open var handleMouseEnter: Any
    open var handleMouseLeave: Any

    companion object {
        var displayName: String
        fun <U> ofType(): Any
    }
}
