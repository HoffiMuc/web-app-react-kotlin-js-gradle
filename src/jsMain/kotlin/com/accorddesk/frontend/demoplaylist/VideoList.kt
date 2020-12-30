package com.accorddesk.frontend.demoplaylist

import com.accorddesk.frontend.Video
import kotlinx.html.js.onClickFunction
import react.*
import react.dom.*


external interface VideoListProps: RProps {
    var videos: List<Video>
    var selectedVideo: Video?
    var onSelectVideo: (Video) -> Unit
}

fun videoList(initialVideos: List<Video>, initialSelectedVideo: Video?) = functionalComponent<VideoListProps> { props ->
    props.videos.forEachIndexed { i, video ->
        p {
            key = video.id.toString()
            attrs {
                onClickFunction = {
                    props.onSelectVideo(video)
                }
            }
            +"${(i+1).toString().padStart(3)}. "
            if(video == props.selectedVideo) {
                +"▶ "
            }
            +"${video.artist}: ${video.title}"
        }
    }
}

///** extension function on RBuilder */
//fun RBuilder.videoList(handler: VideoListProps.() -> Unit): ReactElement {
//    return child(VideoList::class) {
//        this.attrs(handler)
//    }
//}