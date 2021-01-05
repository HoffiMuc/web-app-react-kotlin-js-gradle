@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import React.Partial
import kotlinx.html.P
import react.PureComponent
import react.RProps
import react.RState
import react.ReactElement

external interface IBreadcrumbsProps : RProps {
    var breadcrumbRenderer: ((props: IBreadcrumbProps) -> ReactElement)?
        get() = definedExternally
        set(value) = definedExternally
    var collapseFrom: Any?
        get() = definedExternally
        set(value) = definedExternally
    var currentBreadcrumbRenderer: ((props: IBreadcrumbProps) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    var items: Array<IBreadcrumbProps>
    var minVisibleItems: Number?
        get() = definedExternally
        set(value) = definedExternally
    var overflowListProps: Any?
        get() = definedExternally
        set(value) = definedExternally
    var popoverProps: IPopoverProps?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IBreadcrumbsPropsPartial : IPropsPartial {
    var breadcrumbRenderer: ((props: IBreadcrumbProps) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    var collapseFrom: Any?
        get() = definedExternally
        set(value) = definedExternally
    var currentBreadcrumbRenderer: ((props: IBreadcrumbProps) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    var items: Array<IBreadcrumbProps>?
        get() = definedExternally
        set(value) = definedExternally
    var minVisibleItems: Number?
        get() = definedExternally
        set(value) = definedExternally
    var overflowListProps: Partial<IOverflowListProps<IBreadcrumbProps>>?
        get() = definedExternally
        set(value) = definedExternally
    var popoverProps: IPopoverProps?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Breadcrumbs(props: P, context: Any = definedExternally) : PureComponent<IBreadcrumbsProps, RState> {
    override fun render(): dynamic
    open var renderOverflow: Any
    open var renderOverflowBreadcrumb: Any
    open var renderBreadcrumbWrapper: Any
    open var renderBreadcrumb: Any

    companion object {
        var defaultProps: IBreadcrumbsPropsPartial
    }
}
