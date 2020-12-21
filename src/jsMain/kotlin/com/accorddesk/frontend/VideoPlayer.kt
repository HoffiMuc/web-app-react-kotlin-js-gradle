package com.accorddesk.frontend

import kotlinx.css.*
import kotlinx.html.js.onClickFunction
import react.*
import react.dom.*
import styled.*

external interface VideoPlayerProps : RProps {
    var video: Video
    var onWatchedButtonPressed: (Video) -> Unit
    var unwatchedVideo: Boolean
}
val videoPlayer = functionalComponent<VideoPlayerProps> { props ->
    styledDiv {
        css {
            position = Position.absolute
            top = 10.px
            right = 10.px
        }
        h3 {
            +"${props.video.artist}: ${props.video.title}"
        }
        reactPlayer {
            attrs.url = props.video.videoUrl
        }
        styledDiv {
            css {
                header {
                    display = Display.flex
                    flexDirection = FlexDirection.row
                    justifyContent = JustifyContent.center
                    alignItems = Align.center
                    verticalAlign = VerticalAlign.middle
                    marginTop = 5.px
                    marginBottom = 10.px
                }
            }
            styledButton {
                css {
                    display = Display.flex
                    flexDirection = FlexDirection.row
                    justifyContent = JustifyContent.center
                    verticalAlign = VerticalAlign.middle
                    backgroundColor = if (props.unwatchedVideo) Color.lightGreen else Color.darkOrange
                }
                attrs {
                    onClickFunction = {
                        props.onWatchedButtonPressed(props.video)
                    }
                }
                if (props.unwatchedVideo) {
                    +"Mark as watched"
                } else {
                    +"Mark as unwatched"
                }
            }

            styledDiv {
                css {
                    display = Display.flex
                    marginLeft = 15.px
                }
                emailShareButton {
                    attrs.url = props.video.videoUrl
                    emailIcon {
                        attrs.size = 32
                        attrs.round = true
                    }
                }
                whatsappShareButton {
                    attrs.url = props.video.videoUrl
                    whatsappIcon {
                        attrs.size = 32
                        attrs.round = true
                    }
                }
                telegramShareButton {
                    attrs.url = props.video.videoUrl
                    telegramIcon {
                        attrs.size = 32
                        attrs.round = true
                    }
                }
            }
        }
    }
}

//fun RBuilder.videoPlayer(handler: VideoPlayerProps.() -> Unit): ReactElement {
//    return child(VideoPlayer::class) {
//        this.attrs(handler)
//    }
//}