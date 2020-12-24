//@file:JsModule("react-grid-layout") // import GridLayout from "react-grid-layout";
//@file:JsNonModule
//package com.accorddesk.frontend.ext.gridlayout
//
//import react.*
//
////@JsModule("prop-types")
//
//@JsName("default")
//external val gridLayout: RClass<ReactGridLayoutProps>
//@JsName("default")
//external val gridItem: RClass<GridItemProps>
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
//
//external interface GridItemProps : RProps {
//    var i: String
//
//    // These are all in grid units, not pixels
//    var x: Int
//    var y: Int
//    var w: Int
//    var h: Int
//    var minW: Int?
//    var maxW: Int?
//    var minH: Int?
//    var maxH: Int?
//
//    // If true, equal to `isDraggable: false, isResizable: false`.
//    var static: Boolean?
//    // If false, will not be draggable. Overrides `static`.
//    var isDraggable: Boolean?
//    // If false, will not be resizable. Overrides `static`.
//    var isResizable: Boolean?
//    // By default, a handle is only shown on the bottom-right (southeast) corner.
//    // Note that resizing from the top or left is generally not intuitive.
//    var resizeHandles: Array<String>?
//    // If true and draggable, item will be moved only within grid.
//    var isBounded: Boolean?
//}
