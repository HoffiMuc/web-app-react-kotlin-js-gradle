@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import org.w3c.dom.events.Event
import react.PureComponent
import react.RProps
import react.RState

//external var Expander: React.FunctionComponent
//
//external interface `L$0` {
//    @nativeInvoke
//    operator fun invoke(newTabId: String, prevTabId: String?, event: MouseEvent)
//    @nativeInvoke
//    operator fun invoke(newTabId: String, prevTabId: Number?, event: MouseEvent)
//    @nativeInvoke
//    operator fun invoke(newTabId: Number, prevTabId: String?, event: MouseEvent)
//    @nativeInvoke
//    operator fun invoke(newTabId: Number, prevTabId: Number?, event: MouseEvent)
//}

external interface ITabsProps : IProps {
    var animate: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var defaultSelectedTabId: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var id: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var large: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var renderActiveTabPanelOnly: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var selectedTabId: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var vertical: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    val onChange: ((Event) -> Unit)? // `L$0`?
        get() = definedExternally
}

external interface ITabsPropsPartial : RProps {
    var animate: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var defaultSelectedTabId: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var id: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var large: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var renderActiveTabPanelOnly: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var selectedTabId: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var vertical: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var onChange: ((Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ITabsState : RState {
    var indicatorWrapperStyle: Any?
        get() = definedExternally
        set(value) = definedExternally
    var selectedTabId: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$27` {
    var selectedTabId: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
}

external open class Tabs(props: ITabsProps) : PureComponent<ITabsProps, ITabsState> {
    open var tablistElement: Any
    open var refHandlers: Any
    override fun render(): dynamic
    override fun componentDidMount()
    open fun componentDidUpdate(prevProps: ITabsProps, prevState: ITabsState)
    open var getInitialSelectedTabId: Any
    open var getKeyCodeDirection: Any
    open var getTabChildrenProps: Any
    open var getTabChildren: Any
    open var getTabElements: Any
    open var handleKeyDown: Any
    open var handleKeyPress: Any
    open var handleTabClick: Any
    open var moveSelectionIndicator: Any
    open var renderTabPanel: Any
    open var renderTabTitle: Any

    companion object {
        var Expander: Any
        var Tab: Any
        var defaultProps: ITabsPropsPartial
        var displayName: String
        fun getDerivedStateFromProps(__0: ITabsProps): `T$27`?
    }
}
