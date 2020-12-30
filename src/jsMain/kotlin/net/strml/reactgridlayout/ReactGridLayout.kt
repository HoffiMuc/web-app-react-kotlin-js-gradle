//@file:JsModule("react-grid-layout") // import GridLayout from "react-grid-layout";
//@file:JsNonModule
//package net.strml.reactgridlayout
//
//import react.*
//
////@JsModule("prop-types")
//
//@JsName("default")
////external val reactGridLayout : RClass<ReactGridLayoutProps>
//external class ReactGridLayout : Component<ReactGridLayoutProps, RState> {
//    override fun render(): ReactElement?
//}
//
//external interface ReactGridLayoutProps : RProps {
//    var className: String
//    var width: Int
//    var autoSize: Boolean? // = true
//    var cols: Int? // = 12
//    var draggableCancel: String? // = ""
//    var draggableHandle: String? // = ""
//    var verticalCompact: Boolean? // = true
//    var compactType: String // = "vertical"
//    var layout: Array<Any>?
//    var margin: Array<Int>? // = arrayOf(10, 10)
//    var containerPadding: Array<Int>? // = margin
//    var rowHeight: Int? // = 150
//    var droppingItem: Any? // = object { var i: String; var w: Int; var h: Int }
//    var isDraggable: Boolean? // = true
//    var isResizable: Boolean? // = true
//    var isBounded: Boolean? // = false
//    var useCSSTransforms: Boolean? // = true
//    var transformScale: Int? // = 1
//    var preventCollision: Boolean? // = false
//    var isDroppable: Boolean? // = false
//    var resizeHandles: Array<String>? // = arrayOf("se")
//    // resizeHandle?: ReactElement<any> | ((resizeHandleAxis: ResizeHandleAxis) => ReactElement<any>)
//    var resizeHandle: ReactElement
//    // onLayoutChange: (layout: Layout)  => void,
//    var onLayoutChange:  (layouts: Array<Any>) -> Unit
//    //
//    // // Calls when drag starts.
//    //     onDragStart: ItemCallback,
//    // // Calls on each drag movement.
//    //     onDrag: ItemCallback,
//    // // Calls when drag is complete.
//    //     onDragStop: ItemCallback,
//    // // Calls when resize starts.
//    //     onResizeStart: ItemCallback,
//    // // Calls when resize movement happens.
//    //     onResize: ItemCallback,
//    // // Calls when resize is complete.
//    //     onResizeStop: ItemCallback,
//    // // Calls when an element has been dropped into the grid from outside.
//    //     onDrop: (layout: Layout, item: ?LayoutItem, e: Event) // => void
//    //
//    // // Ref for getting a reference for the grid's wrapping div.
//    // // You can use this instead of a regular ref and the deprecated `ReactDOM.findDOMNode()`` function.
//    //     innerRef: ?React.Ref<"div">
//}