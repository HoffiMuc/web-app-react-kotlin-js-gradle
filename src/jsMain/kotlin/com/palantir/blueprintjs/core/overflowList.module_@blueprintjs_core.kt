@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import react.PureComponent
import react.RState

external interface IOverflowListProps<T> : IProps {
    var collapseFrom: Any?
        get() = definedExternally
        set(value) = definedExternally
    var items: Array<T>
    var minVisibleItems: Number?
        get() = definedExternally
        set(value) = definedExternally
    var observeParents: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var onOverflow: ((overflowItems: Array<T>) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var overflowRenderer: (overflowItems: Array<T>) -> dynamic
    var style: Any?
        get() = definedExternally
        set(value) = definedExternally
    var tagName: Any?
        get() = definedExternally
        set(value) = definedExternally
    var visibleItemRenderer: (item: T, index: Number) -> dynamic
}

external interface IOverflowListPropsPartial<T> : IPropsPartial {
    var collapseFrom: Any?
        get() = definedExternally
        set(value) = definedExternally
    var items: Array<T>?
        get() = definedExternally
        set(value) = definedExternally
    var minVisibleItems: Number?
        get() = definedExternally
        set(value) = definedExternally
    var observeParents: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var onOverflow: ((overflowItems: Array<T>) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var overflowRenderer: ((overflowItems: Array<T>) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    var style: Any?
        get() = definedExternally
        set(value) = definedExternally
    var tagName: Any?
        get() = definedExternally
        set(value) = definedExternally
    var visibleItemRenderer: ((item: T, index: Number) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IOverflowListState<T> : RState {
    var lastOverflowCount: Number
    var overflow: Array<T>
    var visible: Array<T>
}

external open class OverflowList<T> : PureComponent<IOverflowListProps<T>, IOverflowListState<T>> {
    override var state: IOverflowListState<T>
    open var previousWidths: Any
    open var spacer: Any
    override fun componentDidMount()
    override fun shouldComponentUpdate(_nextProps: IOverflowListProps<T>, nextState: IOverflowListState<T>): Boolean
    open fun componentDidUpdate(prevProps: IOverflowListProps<T>, prevState: IOverflowListState<T>)
    override fun render(): dynamic
    open var maybeRenderOverflow: Any
    open var resize: Any
    open var repartition: Any

    companion object {
        var displayName: String
        var defaultProps: IOverflowListPropsPartial<Any>
        fun <U> ofType(): Any
    }
}
