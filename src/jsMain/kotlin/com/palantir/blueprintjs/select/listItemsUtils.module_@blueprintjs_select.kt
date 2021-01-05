@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/select")
@file:JsNonModule
package com.palantir.blueprintjs.select

external interface ICreateNewItem {
    var __blueprintCreateNewItemBrand: String /* "blueprint-create-new-item" */
}

external fun getCreateNewItem(): ICreateNewItem

external fun <T> isCreateNewItem(item: T?): Boolean

external fun <T> isCreateNewItem(item: ICreateNewItem?): Boolean

external fun <T> getActiveItem(activeItem: T?): T?

external fun <T> getActiveItem(activeItem: ICreateNewItem?): T?
