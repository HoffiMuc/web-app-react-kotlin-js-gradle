package com.accorddesk.frontend.examplecomponent

import com.palantir.blueprintjs.core.Card
import react.RProps
import react.dom.h3
import react.functionalComponent

fun genericCard(givenHeader: String) = functionalComponent<RProps> { props ->
    child(Card::class) {
        attrs.className = "generic-card"
        h3 { +givenHeader }
        props.children()
    }
}
