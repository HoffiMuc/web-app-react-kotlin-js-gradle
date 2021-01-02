package com.accorddesk.frontend.ui.header

import react.RProps
import react.child
import react.functionalComponent
import styled.css
import styled.styledDiv

external interface HeaderProps: RProps {
}

val header = functionalComponent<HeaderProps> { props ->

    styledDiv {
        css {
        }
        child(navbar) {

        }
        child(menu) {

        }
    }
}
