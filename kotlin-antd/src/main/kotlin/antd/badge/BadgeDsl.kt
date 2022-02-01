package antd.badge

import kotlinext.js.jso
import react.*

fun RBuilder.badge(handler: RHandler<BadgeProps>) = child(BadgeComponent::class, handler)
fun RBuilder.badgeRibbon(handler: RHandler<RibbonProps>) = child(BadgeComponent.Ribbon, jso {}, handler)
