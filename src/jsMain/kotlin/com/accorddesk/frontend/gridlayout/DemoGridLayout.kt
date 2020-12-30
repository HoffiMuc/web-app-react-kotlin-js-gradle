//package com.accorddesk.frontend.gridlayout
//
//import net.strml.reactgridlayout.ReactGridLayout
//import react.RProps
//import react.dom.div
//import react.dom.h1
//import react.functionalComponent
//import kotlin.js.Date
//
//val demoGridLayout = functionalComponent<RProps> {
//    h1 {
//        +"GridLayout Demo: ${Date().toLocaleTimeString()}"
//    }
//    val a = object { var i = "a"; var x = 0; var y = 0; var w = 1; var h = 2; var static = true }
//    val b = object { var i = "b"; var x = 1; var y = 0; var w = 3; var h = 2; var minW = 2; var maxW = 4 }
//    val c = object { var i = "c"; var x = 4; var y = 0; var w = 1; var h = 2 }
//    val layout: Array<Any> = arrayOf(a, b, c)
//
//    child(ReactGridLayout::class) {
//        attrs.className = "layout"
//        attrs.width = 1200
//        attrs.cols = 12
//        attrs.layout = layout
//        attrs.rowHeight = 30
//    }
//    div {
//        key = "a"
//        +"a"
//    }
//    div {
//        key = "b"
//        +"b"
//    }
//    div {
//        key = "b"
//        +"b"
//    }
//}
