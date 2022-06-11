package uikit.components

import uikit.Component

external interface NavComponent : Component {
    fun toggle(index: Any? /* String | Number | Node */ = definedExternally, animate: Boolean? = definedExternally)
}

external interface NavOptions {
    var targets: String?
    var toggle: String?
    var content: String?
    var collapsible: Boolean?
    var multiple: Boolean?
    var transition: String?
    var animation: String?
    var duration: Number?
}