package com.accorddesk.frontend.ui.header

import com.palantir.blueprintjs.*
import kotlinx.css.height
import kotlinx.css.px
import react.functionalComponent
import styled.css
import styled.styledDiv

val navbar = functionalComponent<HeaderProps> { props ->
    styledDiv {
        css {
            height = 50.px // "height:\$pt-navbar-height;" + x
        }
        child(Navbar::class) {
            attrs.fixedToTop = true
            attrs.className = "bp3-dark"
            child(NavbarGroup::class) {
                attrs.align = Alignment.LEFT
                child(NavbarHeading::class) {
                    +"BlueprintJS Sandbox"
                }
                child(NavbarDivider::class) {}
                child(AnchorButton::class) {
                    attrs.text = "Docs"
                    attrs.href = "http://blueprintjs.com/docs"
                    attrs.minimal = true
                    attrs.rightIcon = "share"
                }
                child(AnchorButton::class) {
                    attrs.text = "github"
                    attrs.href = "http://github.com/palantir/blueprint"
                    attrs.minimal = true
                    attrs.rightIcon = "share"
                }
            }
        }
    }
}
