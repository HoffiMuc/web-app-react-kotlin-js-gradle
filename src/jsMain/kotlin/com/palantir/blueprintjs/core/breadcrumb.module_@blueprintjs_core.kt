@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

external interface IBreadcrumbProps : IActionProps, ILinkProps {
    var current: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external var Breadcrumb: React.FunctionComponent<IBreadcrumbProps>
