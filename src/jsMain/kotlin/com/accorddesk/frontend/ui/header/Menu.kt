package com.accorddesk.frontend.ui.header

import com.palantir.blueprintjs.*
import com.palantir.blueprintjs.core.*
import react.RElementBuilder
import react.RProps
import react.functionalComponent
import react.key
import styled.styledDiv

external interface MenuProps : RProps {
}

val menu = functionalComponent<MenuProps> { props ->

    styledDiv {
        child(ButtonGroup::class) {
            child(Popover::class) {
                attrs.popoverClassName = Classes.POPOVER_CONTENT_SIZING
                attrs.enforceFocus = false
                // attrs.boundary = "viewport"
                attrs.interactionKind = PopoverInteractionKind.CLICK
                attrs.hasBackdrop = false
                attrs.canEscapeKeyClose = true
                attrs.defaultIsOpen = false
                attrs.minimal = true
                attrs.inheritDarkTheme = true
                attrs.position = PopoverPosition.BOTTOM_LEFT
                attrs.usePortal = true
                bpButton {
                    attrs.title = "NdaDesk"
                    attrs.text = "NdaDesk Menu"
                    attrs.icon = "menu"
                }
                ndaDeskMenu()
            }
            child(Popover::class) {
                attrs.popoverClassName = Classes.POPOVER_CONTENT_SIZING
                attrs.enforceFocus = false
                // attrs.boundary = "viewport"
                attrs.interactionKind = PopoverInteractionKind.CLICK
                attrs.hasBackdrop = false
                attrs.canEscapeKeyClose = true
                attrs.defaultIsOpen = false
                attrs.minimal = true
                attrs.inheritDarkTheme = true
                attrs.position = PopoverPosition.BOTTOM_LEFT
                attrs.usePortal = true
                bpButton {
                    attrs.title = "File"
                    attrs.text = "File"
                    attrs.icon = "document-share"
                }
                ndaDeskMenu()
            }
            child(Popover::class) {
                attrs.popoverClassName = Classes.POPOVER_CONTENT_SIZING
                attrs.enforceFocus = false
                // attrs.boundary = "viewport"
                attrs.interactionKind = PopoverInteractionKind.CLICK
                attrs.hasBackdrop = false
                attrs.canEscapeKeyClose = true
                attrs.defaultIsOpen = false
                attrs.minimal = true
                attrs.inheritDarkTheme = true
                attrs.position = PopoverPosition.BOTTOM_LEFT
                attrs.usePortal = true
                bpButton {
                    attrs.title = "Edit"
                    attrs.text = "Edit"
                    attrs.icon = "edit"
                }
                ndaDeskMenu()
            }
        }
    }
}

private fun RElementBuilder<IPopoverProps>.ndaDeskMenu() {
    child(Menu::class) {
        attrs.key = "menu"
        child(MenuDivider::class) {
            attrs.title = "Edit"
        }
        child(MenuItem::class) {
            attrs.icon = "cut"
            attrs.text = "Cut"
            attrs.label = "⌘X"
        }
        child(MenuItem::class) {
            attrs.icon = "duplicate"
            attrs.text = "Copy"
            attrs.label = "⌘C"
        }
        child(MenuItem::class) {
            attrs.icon = "clipboard"
            attrs.text = "Paste"
            attrs.label = "⌘V"
            attrs.disabled = true
        }
        child(MenuDivider::class) {
            attrs.title = "Text"
        }
        child(MenuItem::class) {
            attrs.icon = "align-left"
            attrs.text = "Alignment"
            child(MenuItem::class) {
                attrs.icon = "align-left"
                attrs.text = "Left"
            }
            child(MenuItem::class) {
                attrs.icon = "align-center"
                attrs.text = "Center"
            }
            child(MenuItem::class) {
                attrs.icon = "align-right"
                attrs.text = "Right"
            }
            child(MenuItem::class) {
                attrs.icon = "align-justify"
                attrs.text = "Justify"
            }
        }
        child(MenuItem::class) {
            attrs.icon = "style"
            attrs.text = "Style"
            child(MenuItem::class) {
                attrs.icon = "bold"
                attrs.text = "Bold"
            }
            child(MenuItem::class) {
                attrs.icon = "italic"
                attrs.text = "Italic"
            }
            child(MenuItem::class) {
                attrs.icon = "underline"
                attrs.text = "Underline"
            }
        }
    }
}
