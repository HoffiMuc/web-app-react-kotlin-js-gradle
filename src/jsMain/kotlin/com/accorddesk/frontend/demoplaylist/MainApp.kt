package com.accorddesk.frontend.demoplaylist

import com.accorddesk.frontend.Video
import com.accorddesk.frontend.unwatchedVideos
import com.accorddesk.frontend.watchedVideos
import com.palantir.blueprintjs.core.Card
import react.RProps
import react.child
import react.dom.div
import react.dom.h1
import react.dom.h3
import react.functionalComponent
import react.useState

data class AppState(
    var currentVideo: Video?,
    var unwatchedVideos: List<Video>,
    var watchedVideos: List<Video>
) {
    fun clone(currentVideo: Video?) = AppState(currentVideo, unwatchedVideos, watchedVideos)
    fun cloneMoveToOtherList(video: Video) : AppState {
        return when (unwatchedVideos.contains(video)) {
            true -> AppState(currentVideo, unwatchedVideos.filter { it != video }, mutableListOf(video).also{it.addAll(watchedVideos)})
            false -> AppState(currentVideo, mutableListOf(video).also{it.addAll(unwatchedVideos)}, watchedVideos.filter { it != video})
        }
    }
}

val mainApp = functionalComponent<RProps> {
    val (appState, setAppState) = useState(AppState(currentVideo = null, unwatchedVideos = unwatchedVideos, watchedVideos = watchedVideos))
    child(Card::class) {
        h1 {
            +"Youtube Video List"
        }
        div {
            h3 {
                +"Videos to watch:"
            }
            child(videoList(appState.unwatchedVideos, null)) {
                attrs.videos = appState.unwatchedVideos
                attrs.selectedVideo = appState.currentVideo
                attrs.onSelectVideo = {
                    setAppState(appState.clone(it)) // has to be a new object!!!, so no: appState.currentVideo = it ; setAppState(appState)
                }
            }
            h3 {
                +"Videos watched:"
            }
            child(videoList(appState.watchedVideos, null)) {
                attrs.videos = appState.watchedVideos
                attrs.selectedVideo = appState.currentVideo
                attrs.onSelectVideo = {
                    setAppState(appState.clone(it)) // has to be a new object!!!, so no: appState.currentVideo = it ; setAppState(appState)
                }
            }
        }
    }
    appState.currentVideo?.let { currentVideo ->
        child(videoPlayer) {
            attrs.video = currentVideo
            attrs.unwatchedVideo = currentVideo in appState.unwatchedVideos
            attrs.onWatchedButtonPressed = {
                setAppState(appState.cloneMoveToOtherList(it))
            }
        }
    }
}
