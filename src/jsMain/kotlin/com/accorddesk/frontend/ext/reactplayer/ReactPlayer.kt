@file:JsModule("react-player")
@file:JsNonModule

package com.accorddesk.frontend.ext.reactplayer

import react.*

@JsName("default")
external val reactPlayer: RClass<ReactPlayerProps>

external interface ReactPlayerProps : RProps {
    var url: String
}