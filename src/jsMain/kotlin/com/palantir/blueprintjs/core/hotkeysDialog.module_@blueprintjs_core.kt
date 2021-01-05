@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

external interface IHotkeysDialogProps : IDialogProps {
    var globalHotkeysGroup: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IHotkeysDialogPropsPartial : IDialogPropsPartial {
    var globalHotkeysGroup: String?
        get() = definedExternally
        set(value) = definedExternally
}

external fun setHotkeysDialogProps(props: IHotkeysDialogPropsPartial)

external fun hideHotkeysDialog()
