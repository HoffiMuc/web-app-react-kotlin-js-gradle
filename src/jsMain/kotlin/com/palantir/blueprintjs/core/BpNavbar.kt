@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs.core

import react.PureComponent
import react.RState
import react.ReactElement

external interface INavbarProps : IProps {
    var fixedToTop: Boolean?
    var displayName: String
    var Divider: NavbarDivider
    var Group: NavbarGroup
    var Heading: Any
}

external class Navbar : PureComponent<INavbarProps, RState> {
    override fun render(): ReactElement?
}

external interface INavbarDividerProps : IProps {
    var displayName: String
}

external class NavbarDivider : PureComponent<INavbarDividerProps, RState> {
    override fun render(): ReactElement?
}

external interface INavbarGroupProps : IProps {
    var displayName: String
    var defaultProps: INavbarGroupProps
    var align: Any?
}

external class NavbarGroup : PureComponent<INavbarGroupProps, RState> {
    override fun render(): ReactElement?
}

external interface INavbarHeadingProps : IProps {
    var displayName: String
}

external class NavbarHeading : PureComponent<INavbarHeadingProps, RState> {
    override fun render(): ReactElement?
}
