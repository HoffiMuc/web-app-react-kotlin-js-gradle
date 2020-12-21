package com.accorddesk.frontend

import kotlinx.browser.window
import kotlinx.html.js.onClickFunction
import react.*
import react.dom.*
import kotlin.js.Date

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