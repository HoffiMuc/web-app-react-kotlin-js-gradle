package com.accorddesk.frontend

import kotlinx.browser.document
import react.dom.render

data class Video(val id: Int, val title: String, val speaker: String, val videoUrl: String)

val unwatchedVideos = listOf(
    Video(1, "I Engineer", "Animotion", "https://www.youtube.com/watch?v=zefaQgPqqac"),
    Video(2, "Bass Solo", "Paul Simon", "https://www.youtube.com/watch?v=wRMXQA3GL4o"),
    Video(3, "Valiant", "Bugge Wesseltoft", "https://www.youtube.com/watch?v=QrM9q7EERLI"),
    Video(3, "In the End (Mellen Gi Remix)", "Tommee Profitt", "https://www.youtube.com/watch?v=I7-i_hTwKA4")
)
val watchedVideos = listOf(
    Video(5, "Word Up", "Cameo", "hhttps://www.youtube.com/watch?v=MZjAantupsA")
)

fun main() {
    render(document.getElementById("root")) {
        child(MainApp::class) {}
    }
}