@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import kotlinx.html.P
import react.PureComponent
import react.RState

external interface ICollapseProps : IProps {
    var component: Any?
        get() = definedExternally
        set(value) = definedExternally
    var isOpen: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var keepChildrenMounted: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var transitionDuration: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ICollapseState : RState {
    var animationState: AnimationStates
    var height: String?
    var heightWhenOpen: Number?
}

external enum class AnimationStates {
    OPEN_START /* = 0 */,
    OPENING /* = 1 */,
    OPEN /* = 2 */,
    CLOSING_START /* = 3 */,
    CLOSING /* = 4 */,
    CLOSED /* = 5 */
}

external open class Collapse(props: P, context: Any = definedExternally) : PureComponent<ICollapseProps, ICollapseState> {
    override var state: ICollapseState
    open var contents: Any
    override fun render(): dynamic
    override fun componentDidMount()
    open fun componentDidUpdate()
    open var contentsRefHandler: Any
    open var onDelayedStateChange: Any

    companion object {
        var displayName: String
        var defaultProps: ICollapseProps
        fun getDerivedStateFromProps(props: ICollapseProps, state: ICollapseState): dynamic /* `T$21`? | `T$22`? */
    }
}
