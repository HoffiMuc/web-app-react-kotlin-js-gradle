//import * as PropTypes from "prop-types";

//@file:JsModule("prop-types")
//package net.strml.reactgridlayout

//class PropTypes {
//    // Children must be only a single element
//    children: PropTypes.element,
//
//    // General grid attributes
//    cols: PropTypes.number.isRequired,
//    containerWidth: PropTypes.number.isRequired,
//    rowHeight: PropTypes.number.isRequired,
//    margin: PropTypes.array.isRequired,
//    maxRows: PropTypes.number.isRequired,
//    containerPadding: PropTypes.array.isRequired,
//
//    // These are all in grid units
//    x: PropTypes.number.isRequired,
//    y: PropTypes.number.isRequired,
//    w: PropTypes.number.isRequired,
//    h: PropTypes.number.isRequired,
//
//    // All optional
//    minW: function (props: Props, propName: string) {
//        const value = props[propName];
//        if (typeof value !== "number") return new Error("minWidth not Number");
//        if (value > props.w || value > props.maxW)
//            return new Error("minWidth larger than item width/maxWidth");
//    },
//
//    maxW: function (props: Props, propName: string) {
//        const value = props[propName];
//        if (typeof value !== "number") return new Error("maxWidth not Number");
//        if (value < props.w || value < props.minW)
//            return new Error("maxWidth smaller than item width/minWidth");
//    },
//
//    minH: function (props: Props, propName: string) {
//        const value = props[propName];
//        if (typeof value !== "number") return new Error("minHeight not Number");
//        if (value > props.h || value > props.maxH)
//            return new Error("minHeight larger than item height/maxHeight");
//    },
//
//    maxH: function (props: Props, propName: string) {
//        const value = props[propName];
//        if (typeof value !== "number") return new Error("maxHeight not Number");
//        if (value < props.h || value < props.minH)
//            return new Error("maxHeight smaller than item height/minHeight");
//    },
//
//    // ID is nice to have for callbacks
//    i: PropTypes.string.isRequired,
//
//    // Resize handle options
//    resizeHandles: resizeHandlesType,
//    resizeHandle: resizeHandleType,
//
//    // Functions
//    onDragStop: PropTypes.func,
//    onDragStart: PropTypes.func,
//    onDrag: PropTypes.func,
//    onResizeStop: PropTypes.func,
//    onResizeStart: PropTypes.func,
//    onResize: PropTypes.func,
//
//    // Flags
//    isDraggable: PropTypes.bool.isRequired,
//    isResizable: PropTypes.bool.isRequired,
//    isBounded: PropTypes.bool.isRequired,
//    static: PropTypes.bool,
//
//    // Use CSS transforms instead of top/left
//    useCSSTransforms: PropTypes.bool.isRequired,
//    transformScale: PropTypes.number,
//
//    // Others
//    className: PropTypes.string,
//    // Selector for draggable handle
//    handle: PropTypes.string,
//    // Selector for draggable cancel (see react-draggable)
//    cancel: PropTypes.string,
//    // Current position of a dropping element
//    droppingPosition: PropTypes.shape({
//        e: PropTypes.object.isRequired,
//        left: PropTypes.number.isRequired,
//        top: PropTypes.number.isRequired
//    })
//}