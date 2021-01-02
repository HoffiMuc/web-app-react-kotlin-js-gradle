@file:JsModule("@blueprintjs/core")
@file:JsNonModule
package com.palantir.blueprintjs

//var NS = process.env.BLUEPRINT_NAMESPACE || process.env.REACT_APP_BLUEPRINT_NAMESPACE || "bp3";

external class Classes {
    companion object {
        // modifiers
        val ACTIVE: String = definedExternally
        val ALIGN_LEFT: String = definedExternally
        val ALIGN_RIGHT: String = definedExternally
        val DARK: String = definedExternally
        val DISABLED: String = definedExternally
        val FILL: String = definedExternally
        val FIXED: String = definedExternally
        val FIXED_TOP: String = definedExternally
        val INLINE: String = definedExternally
        val INTERACTIVE: String = definedExternally
        val LARGE: String = definedExternally
        val LOADING: String = definedExternally
        val MINIMAL: String = definedExternally
        val OUTLINED: String = definedExternally
        val MULTILINE: String = definedExternally
        val ROUND: String = definedExternally
        val SMALL: String = definedExternally
        val VERTICAL: String = definedExternally
        val POSITION_TOP: String = definedExternally
        val POSITION_BOTTOM: String = definedExternally
        val POSITION_LEFT: String = definedExternally
        val POSITION_RIGHT: String = definedExternally
        val ELEVATION_0: String = definedExternally
        val ELEVATION_1: String = definedExternally
        val ELEVATION_2: String = definedExternally
        val ELEVATION_3: String = definedExternally
        val ELEVATION_4: String = definedExternally
        val INTENT_PRIMARY: String = definedExternally
        val INTENT_SUCCESS: String = definedExternally
        val INTENT_WARNING: String = definedExternally
        val INTENT_DANGER: String = definedExternally
        val FOCUS_DISABLED: String = definedExternally
        // text utilities
        val UI_TEXT: String = definedExternally
        val RUNNING_TEXT: String = definedExternally
        val MONOSPACE_TEXT: String = definedExternally
        val TEXT_LARGE: String = definedExternally
        val TEXT_SMALL: String = definedExternally
        val TEXT_MUTED: String = definedExternally
        val TEXT_DISABLED: String = definedExternally
        val TEXT_OVERFLOW_ELLIPSIS: String = definedExternally
        // textual elements
        val BLOCKQUOTE: String = definedExternally
        val CODE: String = definedExternally
        val CODE_BLOCK: String = definedExternally
        val HEADING: String = definedExternally
        val LIST: String = definedExternally
        val LIST_UNSTYLED: String = definedExternally
        val RTL: String = definedExternally
        // components
        val ALERT: String = definedExternally
        val ALERT_BODY: String = definedExternally
        val ALERT_CONTENTS: String = definedExternally
        val ALERT_FOOTER: String = definedExternally
        val BREADCRUMB: String = definedExternally
        val BREADCRUMB_CURRENT: String = definedExternally
        val BREADCRUMBS: String = definedExternally
        val BREADCRUMBS_COLLAPSED: String = definedExternally
        val BUTTON: String = definedExternally
        val BUTTON_GROUP: String = definedExternally
        val BUTTON_SPINNER: String = definedExternally
        val BUTTON_TEXT: String = definedExternally
        val CALLOUT: String = definedExternally
        val CALLOUT_ICON: String = definedExternally
        val CARD: String = definedExternally
        val COLLAPSE: String = definedExternally
        val COLLAPSE_BODY: String = definedExternally
        val COLLAPSIBLE_LIST: String = definedExternally
        val CONTEXT_MENU: String = definedExternally
        val CONTEXT_MENU_POPOVER_TARGET: String = definedExternally
        val CONTROL_GROUP: String = definedExternally
        val DIALOG: String = definedExternally
        val DIALOG_CONTAINER: String = definedExternally
        val DIALOG_BODY: String = definedExternally
        val DIALOG_CLOSE_BUTTON: String = definedExternally
        val DIALOG_FOOTER: String = definedExternally
        val DIALOG_FOOTER_ACTIONS: String = definedExternally
        val DIALOG_HEADER: String = definedExternally
        val DIVIDER: String = definedExternally
        val DRAWER: String = definedExternally
        val DRAWER_BODY: String = definedExternally
        val DRAWER_FOOTER: String = definedExternally
        val DRAWER_HEADER: String = definedExternally
        val EDITABLE_TEXT: String = definedExternally
        val EDITABLE_TEXT_CONTENT: String = definedExternally
        val EDITABLE_TEXT_EDITING: String = definedExternally
        val EDITABLE_TEXT_INPUT: String = definedExternally
        val EDITABLE_TEXT_PLACEHOLDER: String = definedExternally
        val FLEX_EXPANDER: String = definedExternally
        val HTML_SELECT: String = definedExternally
        /** @deprecated prefer `<HTMLSelect>` component */
        val SELECT: String = definedExternally
        val HTML_TABLE: String = definedExternally
        val HTML_TABLE_BORDERED: String = definedExternally
        val HTML_TABLE_CONDENSED: String = definedExternally
        val HTML_TABLE_STRIPED: String = definedExternally
        val INPUT: String = definedExternally
        val INPUT_GHOST: String = definedExternally
        val INPUT_GROUP: String = definedExternally
        val INPUT_LEFT_CONTAINER: String = definedExternally
        val INPUT_ACTION: String = definedExternally
        val CONTROL: String = definedExternally
        val CONTROL_INDICATOR: String = definedExternally
        val CONTROL_INDICATOR_CHILD: String = definedExternally
        val CHECKBOX: String = definedExternally
        val RADIO: String = definedExternally
        val SWITCH: String = definedExternally
        val SWITCH_INNER_TEXT: String = definedExternally
        val FILE_INPUT: String = definedExternally
        val FILE_INPUT_HAS_SELECTION: String = definedExternally
        val FILE_UPLOAD_INPUT: String = definedExternally
        val FILE_UPLOAD_INPUT_CUSTOM_TEXT: String = definedExternally
        val KEY: String = definedExternally
        val KEY_COMBO: String = definedExternally
        val MODIFIER_KEY: String = definedExternally
        val HOTKEY: String = definedExternally
        val HOTKEY_LABEL: String = definedExternally
        val HOTKEY_COLUMN: String = definedExternally
        val HOTKEY_DIALOG: String = definedExternally
        val LABEL: String = definedExternally
        val FORM_GROUP: String = definedExternally
        val FORM_CONTENT: String = definedExternally
        val FORM_HELPER_TEXT: String = definedExternally
        val MENU: String = definedExternally
        val MENU_ITEM: String = definedExternally
        val MENU_ITEM_LABEL: String = definedExternally
        val MENU_SUBMENU: String = definedExternally
        val MENU_DIVIDER: String = definedExternally
        val MENU_HEADER: String = definedExternally
        val NAVBAR: String = definedExternally
        val NAVBAR_GROUP: String = definedExternally
        val NAVBAR_HEADING: String = definedExternally
        val NAVBAR_DIVIDER: String = definedExternally
        val NON_IDEAL_STATE: String = definedExternally
        val NON_IDEAL_STATE_VISUAL: String = definedExternally
        val NUMERIC_INPUT: String = definedExternally
        val OVERFLOW_LIST: String = definedExternally
        val OVERFLOW_LIST_SPACER: String = definedExternally
        val OVERLAY: String = definedExternally
        val OVERLAY_BACKDROP: String = definedExternally
        val OVERLAY_CONTAINER: String = definedExternally
        val OVERLAY_CONTENT: String = definedExternally
        val OVERLAY_INLINE: String = definedExternally
        val OVERLAY_OPEN: String = definedExternally
        val OVERLAY_SCROLL_CONTAINER: String = definedExternally
        val PANEL_STACK: String = definedExternally
        val PANEL_STACK_HEADER: String = definedExternally
        val PANEL_STACK_HEADER_BACK: String = definedExternally
        val PANEL_STACK_VIEW: String = definedExternally
        val POPOVER: String = definedExternally
        val POPOVER_ARROW: String = definedExternally
        val POPOVER_BACKDROP: String = definedExternally
        val POPOVER_CAPTURING_DISMISS: String = definedExternally
        val POPOVER_CONTENT: String = definedExternally
        val POPOVER_CONTENT_SIZING: String = definedExternally
        val POPOVER_DISMISS: String = definedExternally
        val POPOVER_DISMISS_OVERRIDE: String = definedExternally
        val POPOVER_OPEN: String = definedExternally
        val POPOVER_TARGET: String = definedExternally
        val POPOVER_WRAPPER: String = definedExternally
        val TRANSITION_CONTAINER: String = definedExternally
        val PROGRESS_BAR: String = definedExternally
        val PROGRESS_METER: String = definedExternally
        val PROGRESS_NO_STRIPES: String = definedExternally
        val PROGRESS_NO_ANIMATION: String = definedExternally
        val PORTAL: String = definedExternally
        val SKELETON: String = definedExternally
        val SLIDER: String = definedExternally
        val SLIDER_AXIS: String = definedExternally
        val SLIDER_HANDLE: String = definedExternally
        val SLIDER_LABEL: String = definedExternally
        val SLIDER_TRACK: String = definedExternally
        val SLIDER_PROGRESS: String = definedExternally
        val START: String = definedExternally
        val END: String = definedExternally
        val SPINNER: String = definedExternally
        val SPINNER_ANIMATION: String = definedExternally
        val SPINNER_HEAD: String = definedExternally
        val SPINNER_NO_SPIN: String = definedExternally
        val SPINNER_TRACK: String = definedExternally
        val TAB: String = definedExternally
        val TAB_INDICATOR: String = definedExternally
        val TAB_INDICATOR_WRAPPER: String = definedExternally
        val TAB_LIST: String = definedExternally
        val TAB_PANEL: String = definedExternally
        val TABS: String = definedExternally
        val TAG: String = definedExternally
        val TAG_REMOVE: String = definedExternally
        val TAG_INPUT: String = definedExternally
        val TAG_INPUT_ICON: String = definedExternally
        val TAG_INPUT_VALUES: String = definedExternally
        val TOAST: String = definedExternally
        val TOAST_CONTAINER: String = definedExternally
        val TOAST_MESSAGE: String = definedExternally
        val TOOLTIP: String = definedExternally
        val TOOLTIP_INDICATOR: String = definedExternally
        val TREE: String = definedExternally
        val TREE_NODE: String = definedExternally
        val TREE_NODE_CARET: String = definedExternally
        val TREE_NODE_CARET_CLOSED: String = definedExternally
        val TREE_NODE_CARET_NONE: String = definedExternally
        val TREE_NODE_CARET_OPEN: String = definedExternally
        val TREE_NODE_CONTENT: String = definedExternally
        val TREE_NODE_EXPANDED: String = definedExternally
        val TREE_NODE_ICON: String = definedExternally
        val TREE_NODE_LABEL: String = definedExternally
        val TREE_NODE_LIST: String = definedExternally
        val TREE_NODE_SECONDARY_LABEL: String = definedExternally
        val TREE_NODE_SELECTED: String = definedExternally
        val TREE_ROOT: String = definedExternally
        val ICON: String = definedExternally
    }
}

//// modifiers
//exports.ACTIVE = NS + "-active";
//exports.ALIGN_LEFT = NS + "-align-left";
//exports.ALIGN_RIGHT = NS + "-align-right";
//exports.DARK = NS + "-dark";
//exports.DISABLED = NS + "-disabled";
//exports.FILL = NS + "-fill";
//exports.FIXED = NS + "-fixed";
//exports.FIXED_TOP = NS + "-fixed-top";
//exports.INLINE = NS + "-inline";
//exports.INTERACTIVE = NS + "-interactive";
//exports.LARGE = NS + "-large";
//exports.LOADING = NS + "-loading";
//exports.MINIMAL = NS + "-minimal";
//exports.OUTLINED = NS + "-outlined";
//exports.MULTILINE = NS + "-multiline";
//exports.ROUND = NS + "-round";
//exports.SMALL = NS + "-small";
//exports.VERTICAL = NS + "-vertical";
//exports.POSITION_TOP = positionClass(position_1.Position.TOP);
//exports.POSITION_BOTTOM = positionClass(position_1.Position.BOTTOM);
//exports.POSITION_LEFT = positionClass(position_1.Position.LEFT);
//exports.POSITION_RIGHT = positionClass(position_1.Position.RIGHT);
//exports.ELEVATION_0 = elevationClass(elevation_1.Elevation.ZERO);
//exports.ELEVATION_1 = elevationClass(elevation_1.Elevation.ONE);
//exports.ELEVATION_2 = elevationClass(elevation_1.Elevation.TWO);
//exports.ELEVATION_3 = elevationClass(elevation_1.Elevation.THREE);
//exports.ELEVATION_4 = elevationClass(elevation_1.Elevation.FOUR);
//exports.INTENT_PRIMARY = intentClass(intent_1.Intent.PRIMARY);
//exports.INTENT_SUCCESS = intentClass(intent_1.Intent.SUCCESS);
//exports.INTENT_WARNING = intentClass(intent_1.Intent.WARNING);
//exports.INTENT_DANGER = intentClass(intent_1.Intent.DANGER);
//exports.FOCUS_DISABLED = NS + "-focus-disabled";
//// text utilities
//exports.UI_TEXT = NS + "-ui-text";
//exports.RUNNING_TEXT = NS + "-running-text";
//exports.MONOSPACE_TEXT = NS + "-monospace-text";
//exports.TEXT_LARGE = NS + "-text-large";
//exports.TEXT_SMALL = NS + "-text-small";
//exports.TEXT_MUTED = NS + "-text-muted";
//exports.TEXT_DISABLED = NS + "-text-disabled";
//exports.TEXT_OVERFLOW_ELLIPSIS = NS + "-text-overflow-ellipsis";
//// textual elements
//exports.BLOCKQUOTE = NS + "-blockquote";
//exports.CODE = NS + "-code";
//exports.CODE_BLOCK = NS + "-code-block";
//exports.HEADING = NS + "-heading";
//exports.LIST = NS + "-list";
//exports.LIST_UNSTYLED = NS + "-list-unstyled";
//exports.RTL = NS + "-rtl";
//// components
//exports.ALERT = NS + "-alert";
//exports.ALERT_BODY = exports.ALERT + "-body";
//exports.ALERT_CONTENTS = exports.ALERT + "-contents";
//exports.ALERT_FOOTER = exports.ALERT + "-footer";
//exports.BREADCRUMB = NS + "-breadcrumb";
//exports.BREADCRUMB_CURRENT = exports.BREADCRUMB + "-current";
//exports.BREADCRUMBS = exports.BREADCRUMB + "s";
//exports.BREADCRUMBS_COLLAPSED = exports.BREADCRUMB + "s-collapsed";
//exports.BUTTON = NS + "-button";
//exports.BUTTON_GROUP = exports.BUTTON + "-group";
//exports.BUTTON_SPINNER = exports.BUTTON + "-spinner";
//exports.BUTTON_TEXT = exports.BUTTON + "-text";
//exports.CALLOUT = NS + "-callout";
//exports.CALLOUT_ICON = exports.CALLOUT + "-icon";
//exports.CARD = NS + "-card";
//exports.COLLAPSE = NS + "-collapse";
//exports.COLLAPSE_BODY = exports.COLLAPSE + "-body";
//exports.COLLAPSIBLE_LIST = NS + "-collapse-list";
//exports.CONTEXT_MENU = NS + "-context-menu";
//exports.CONTEXT_MENU_POPOVER_TARGET = exports.CONTEXT_MENU + "-popover-target";
//exports.CONTROL_GROUP = NS + "-control-group";
//exports.DIALOG = NS + "-dialog";
//exports.DIALOG_CONTAINER = exports.DIALOG + "-container";
//exports.DIALOG_BODY = exports.DIALOG + "-body";
//exports.DIALOG_CLOSE_BUTTON = exports.DIALOG + "-close-button";
//exports.DIALOG_FOOTER = exports.DIALOG + "-footer";
//exports.DIALOG_FOOTER_ACTIONS = exports.DIALOG + "-footer-actions";
//exports.DIALOG_HEADER = exports.DIALOG + "-header";
//exports.DIVIDER = NS + "-divider";
//exports.DRAWER = NS + "-drawer";
//exports.DRAWER_BODY = exports.DRAWER + "-body";
//exports.DRAWER_FOOTER = exports.DRAWER + "-footer";
//exports.DRAWER_HEADER = exports.DRAWER + "-header";
//exports.EDITABLE_TEXT = NS + "-editable-text";
//exports.EDITABLE_TEXT_CONTENT = exports.EDITABLE_TEXT + "-content";
//exports.EDITABLE_TEXT_EDITING = exports.EDITABLE_TEXT + "-editing";
//exports.EDITABLE_TEXT_INPUT = exports.EDITABLE_TEXT + "-input";
//exports.EDITABLE_TEXT_PLACEHOLDER = exports.EDITABLE_TEXT + "-placeholder";
//exports.FLEX_EXPANDER = NS + "-flex-expander";
//exports.HTML_SELECT = NS + "-html-select";
///** @deprecated prefer `<HTMLSelect>` component */
//exports.SELECT = NS + "-select";
//exports.HTML_TABLE = NS + "-html-table";
//exports.HTML_TABLE_BORDERED = exports.HTML_TABLE + "-bordered";
//exports.HTML_TABLE_CONDENSED = exports.HTML_TABLE + "-condensed";
//exports.HTML_TABLE_STRIPED = exports.HTML_TABLE + "-striped";
//exports.INPUT = NS + "-input";
//exports.INPUT_GHOST = exports.INPUT + "-ghost";
//exports.INPUT_GROUP = exports.INPUT + "-group";
//exports.INPUT_LEFT_CONTAINER = exports.INPUT + "-left-container";
//exports.INPUT_ACTION = exports.INPUT + "-action";
//exports.CONTROL = NS + "-control";
//exports.CONTROL_INDICATOR = exports.CONTROL + "-indicator";
//exports.CONTROL_INDICATOR_CHILD = exports.CONTROL_INDICATOR + "-child";
//exports.CHECKBOX = NS + "-checkbox";
//exports.RADIO = NS + "-radio";
//exports.SWITCH = NS + "-switch";
//exports.SWITCH_INNER_TEXT = exports.SWITCH + "-inner-text";
//exports.FILE_INPUT = NS + "-file-input";
//exports.FILE_INPUT_HAS_SELECTION = NS + "-file-input-has-selection";
//exports.FILE_UPLOAD_INPUT = NS + "-file-upload-input";
//exports.FILE_UPLOAD_INPUT_CUSTOM_TEXT = NS + "-file-upload-input-custom-text";
//exports.KEY = NS + "-key";
//exports.KEY_COMBO = exports.KEY + "-combo";
//exports.MODIFIER_KEY = NS + "-modifier-key";
//exports.HOTKEY = NS + "-hotkey";
//exports.HOTKEY_LABEL = exports.HOTKEY + "-label";
//exports.HOTKEY_COLUMN = exports.HOTKEY + "-column";
//exports.HOTKEY_DIALOG = exports.HOTKEY + "-dialog";
//exports.LABEL = NS + "-label";
//exports.FORM_GROUP = NS + "-form-group";
//exports.FORM_CONTENT = NS + "-form-content";
//exports.FORM_HELPER_TEXT = NS + "-form-helper-text";
//exports.MENU = NS + "-menu";
//exports.MENU_ITEM = exports.MENU + "-item";
//exports.MENU_ITEM_LABEL = exports.MENU_ITEM + "-label";
//exports.MENU_SUBMENU = NS + "-submenu";
//exports.MENU_DIVIDER = exports.MENU + "-divider";
//exports.MENU_HEADER = exports.MENU + "-header";
//exports.NAVBAR = NS + "-navbar";
//exports.NAVBAR_GROUP = exports.NAVBAR + "-group";
//exports.NAVBAR_HEADING = exports.NAVBAR + "-heading";
//exports.NAVBAR_DIVIDER = exports.NAVBAR + "-divider";
//exports.NON_IDEAL_STATE = NS + "-non-ideal-state";
//exports.NON_IDEAL_STATE_VISUAL = exports.NON_IDEAL_STATE + "-visual";
//exports.NUMERIC_INPUT = NS + "-numeric-input";
//exports.OVERFLOW_LIST = NS + "-overflow-list";
//exports.OVERFLOW_LIST_SPACER = exports.OVERFLOW_LIST + "-spacer";
//exports.OVERLAY = NS + "-overlay";
//exports.OVERLAY_BACKDROP = exports.OVERLAY + "-backdrop";
//exports.OVERLAY_CONTAINER = exports.OVERLAY + "-container";
//exports.OVERLAY_CONTENT = exports.OVERLAY + "-content";
//exports.OVERLAY_INLINE = exports.OVERLAY + "-inline";
//exports.OVERLAY_OPEN = exports.OVERLAY + "-open";
//exports.OVERLAY_SCROLL_CONTAINER = exports.OVERLAY + "-scroll-container";
//exports.PANEL_STACK = NS + "-panel-stack";
//exports.PANEL_STACK_HEADER = exports.PANEL_STACK + "-header";
//exports.PANEL_STACK_HEADER_BACK = exports.PANEL_STACK + "-header-back";
//exports.PANEL_STACK_VIEW = exports.PANEL_STACK + "-view";
//exports.POPOVER = NS + "-popover";
//exports.POPOVER_ARROW = exports.POPOVER + "-arrow";
//exports.POPOVER_BACKDROP = exports.POPOVER + "-backdrop";
//exports.POPOVER_CAPTURING_DISMISS = exports.POPOVER + "-capturing-dismiss";
//exports.POPOVER_CONTENT = exports.POPOVER + "-content";
//exports.POPOVER_CONTENT_SIZING = exports.POPOVER_CONTENT + "-sizing";
//exports.POPOVER_DISMISS = exports.POPOVER + "-dismiss";
//exports.POPOVER_DISMISS_OVERRIDE = exports.POPOVER_DISMISS + "-override";
//exports.POPOVER_OPEN = exports.POPOVER + "-open";
//exports.POPOVER_TARGET = exports.POPOVER + "-target";
//exports.POPOVER_WRAPPER = exports.POPOVER + "-wrapper";
//exports.TRANSITION_CONTAINER = NS + "-transition-container";
//exports.PROGRESS_BAR = NS + "-progress-bar";
//exports.PROGRESS_METER = NS + "-progress-meter";
//exports.PROGRESS_NO_STRIPES = NS + "-no-stripes";
//exports.PROGRESS_NO_ANIMATION = NS + "-no-animation";
//exports.PORTAL = NS + "-portal";
//exports.SKELETON = NS + "-skeleton";
//exports.SLIDER = NS + "-slider";
//exports.SLIDER_AXIS = exports.SLIDER + "-axis";
//exports.SLIDER_HANDLE = exports.SLIDER + "-handle";
//exports.SLIDER_LABEL = exports.SLIDER + "-label";
//exports.SLIDER_TRACK = exports.SLIDER + "-track";
//exports.SLIDER_PROGRESS = exports.SLIDER + "-progress";
//exports.START = NS + "-start";
//exports.END = NS + "-end";
//exports.SPINNER = NS + "-spinner";
//exports.SPINNER_ANIMATION = exports.SPINNER + "-animation";
//exports.SPINNER_HEAD = exports.SPINNER + "-head";
//exports.SPINNER_NO_SPIN = NS + "-no-spin";
//exports.SPINNER_TRACK = exports.SPINNER + "-track";
//exports.TAB = NS + "-tab";
//exports.TAB_INDICATOR = exports.TAB + "-indicator";
//exports.TAB_INDICATOR_WRAPPER = exports.TAB_INDICATOR + "-wrapper";
//exports.TAB_LIST = exports.TAB + "-list";
//exports.TAB_PANEL = exports.TAB + "-panel";
//exports.TABS = exports.TAB + "s";
//exports.TAG = NS + "-tag";
//exports.TAG_REMOVE = exports.TAG + "-remove";
//exports.TAG_INPUT = NS + "-tag-input";
//exports.TAG_INPUT_ICON = exports.TAG_INPUT + "-icon";
//exports.TAG_INPUT_VALUES = exports.TAG_INPUT + "-values";
//exports.TOAST = NS + "-toast";
//exports.TOAST_CONTAINER = exports.TOAST + "-container";
//exports.TOAST_MESSAGE = exports.TOAST + "-message";
//exports.TOOLTIP = NS + "-tooltip";
//exports.TOOLTIP_INDICATOR = exports.TOOLTIP + "-indicator";
//exports.TREE = NS + "-tree";
//exports.TREE_NODE = NS + "-tree-node";
//exports.TREE_NODE_CARET = exports.TREE_NODE + "-caret";
//exports.TREE_NODE_CARET_CLOSED = exports.TREE_NODE_CARET + "-closed";
//exports.TREE_NODE_CARET_NONE = exports.TREE_NODE_CARET + "-none";
//exports.TREE_NODE_CARET_OPEN = exports.TREE_NODE_CARET + "-open";
//exports.TREE_NODE_CONTENT = exports.TREE_NODE + "-content";
//exports.TREE_NODE_EXPANDED = exports.TREE_NODE + "-expanded";
//exports.TREE_NODE_ICON = exports.TREE_NODE + "-icon";
//exports.TREE_NODE_LABEL = exports.TREE_NODE + "-label";
//exports.TREE_NODE_LIST = exports.TREE_NODE + "-list";
//exports.TREE_NODE_SECONDARY_LABEL = exports.TREE_NODE + "-secondary-label";
//exports.TREE_NODE_SELECTED = exports.TREE_NODE + "-selected";
//exports.TREE_ROOT = NS + "-tree-root";
//exports.ICON = NS + "-icon";
///** @deprecated use <Icon> components and iconName prop APIs instead */
//exports.ICON_STANDARD = exports.ICON + "-standard";
///** @deprecated use <Icon> components and iconName prop APIs instead */
//exports.ICON_LARGE = exports.ICON + "-large";
///**
// * Returns the namespace prefix for all Blueprint CSS classes.
// * Customize this namespace at build time with the `process.env.BLUEPRINT_NAMESPACE` environment variable.
// */
//function getClassNamespace() {
//    return NS;
//}
//exports.getClassNamespace = getClassNamespace;
///** Return CSS class for alignment. */
//function alignmentClass(alignment) {
//    switch (alignment) {
//        case alignment_1.Alignment.LEFT:
//        return exports.ALIGN_LEFT;
//        case alignment_1.Alignment.RIGHT:
//        return exports.ALIGN_RIGHT;
//        default:
//        return undefined;
//    }
//}
//exports.alignmentClass = alignmentClass;
//function elevationClass(elevation) {
//    if (elevation === undefined) {
//        return undefined;
//    }
//    return NS + "-elevation-" + elevation;
//}
//exports.elevationClass = elevationClass;
//function iconClass(iconName) {
//    if (iconName == null) {
//        return undefined;
//    }
//    return iconName.indexOf(NS + "-icon-") === 0 ? iconName : NS + "-icon-" + iconName;
//}
//exports.iconClass = iconClass;
//function intentClass(intent) {
//    if (intent == null || intent === intent_1.Intent.NONE) {
//        return undefined;
//    }
//    return NS + "-intent-" + intent.toLowerCase();
//}
//exports.intentClass = intentClass;
//function positionClass(position) {
//    if (position === undefined) {
//        return undefined;
//    }
//    return NS + "-position-" + position;
//}
//exports.positionClass = positionClass;
////# sourceMappingURL=classes.js.map