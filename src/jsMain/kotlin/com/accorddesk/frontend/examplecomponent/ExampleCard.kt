package com.accorddesk.frontend.examplecomponent

import com.palantir.blueprintjs.core.Button
import com.palantir.blueprintjs.core.ButtonGroup
import com.palantir.blueprintjs.core.Card
import com.palantir.blueprintjs.core.Intent
import kotlinx.css.*
import react.RProps
import react.functionalComponent
import styled.css
import styled.styledH3

external interface ExampleProps: RProps {
    var header: String
}

val exampleCard = functionalComponent<ExampleProps> { props ->
    child(Card::class) {
        styledH3 {
            css {
                marginTop = 5.px
                marginBottom = 10.px
            }
            +props.header
        }
        child(ButtonGroup::class) {
            child(Button::class) {
                attrs.text = "Primary"
                attrs.intent = Intent.PRIMARY
            }
            child(Button::class) {
                attrs.text = "Warning"
                attrs.intent = Intent.WARNING
            }
            child(Button::class) {
                attrs.text = "Success"
                attrs.intent = Intent.SUCCESS
            }
            child(Button::class) {
                attrs.text = "Danger"
                attrs.intent = Intent.DANGER
            }
        }
        props.children()
    }
}

///** extension function on RBuilder */
//fun RBuilder.videoList(handler: VideoListProps.() -> Unit): ReactElement {
//    return child(VideoList::class) {
//        this.attrs(handler)
//    }
//}