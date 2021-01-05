package com.accorddesk.frontend

import com.accorddesk.frontend.demoplaylist.mainApp
import com.accorddesk.frontend.examplecomponent.exampleCard
import com.accorddesk.frontend.examplecomponent.genericCard
import com.accorddesk.frontend.ui.header.header
import com.palantir.blueprintjs.core.Button
import kotlinx.browser.document
import kotlinx.css.marginTop
import kotlinx.css.px
import react.child
import react.dom.p
import react.dom.render
import styled.css
import styled.styledHr

data class Video(val id: Int, val title: String, val artist: String, val videoUrl: String)

val unwatchedVideos = listOf(
    Video(1, "I Engineer", "Animotion", "https://www.youtube.com/watch?v=zefaQgPqqac"),
    Video(2, "Bass Solo", "Paul Simon", "https://www.youtube.com/watch?v=wRMXQA3GL4o"),
    Video(3, "Valiant", "Bugge Wesseltoft", "https://www.youtube.com/watch?v=QrM9q7EERLI"),
    Video(4, "In the End (Mellen Gi Remix)", "Tommee Profitt", "https://www.youtube.com/watch?v=I7-i_hTwKA4")
)
val watchedVideos = listOf(
    Video(5, "Word Up", "Cameo", "hhttps://www.youtube.com/watch?v=MZjAantupsA")
)

fun main() {
    kotlinext.js.require("@blueprintjs/core/lib/css/blueprint.css")
    // kotlinext.js.require("@blueprintjs/core/lib/css/blueprint-icons.css")
    val root = document.getElementById("root") ?: throw IllegalStateException("div#root not found, cannot attach application to DOM")
    render(root) {
        child(header) {  }
        child(genericCard("header3")) {
            p { +"paragraph text h3" }
        }
//        child(exampleSelect) {
//            attrs.header = "Example Card Component"
////            h3 {
////                +"Card inside Card in Main"
////                child(Card::class) {
////                    child(Button::class) {
////                        attrs.text = "Button without Intent"
////                        attrs.active = true
////                    }
////                    child(Button::class) {
////                        attrs.text = "inactive Button"
////                        attrs.active = false
////                    }
////                }
////            }
//        }
        child(exampleCard) { }
        child(mainApp) {
        }
//        child(demoGridLayout) {
//        }
        styledHr {
            css {
                marginTop = 20.px
            }
        }
        child(Button::class) {
            attrs.active = true
            attrs.icon = "document-open"
            attrs.text = " My first BlueprintJS Button"
        }
    }
}
