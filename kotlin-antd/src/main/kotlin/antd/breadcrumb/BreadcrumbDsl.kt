package antd.breadcrumb

import kotlinext.js.*
import react.*

fun RBuilder.breadcrumb(handler: RHandler<BreadcrumbProps>) = child(BreadcrumbComponent::class, handler)
fun RBuilder.breadcrumbItem(handler: RHandler<BreadcrumbItemProps>) = child(BreadcrumbComponent.Item, jso {}, handler)
fun RBuilder.breadcrumbSeparator(handler: RHandler<BreadcrumbSeparatorProps>) = child(BreadcrumbComponent.Separator, jso {}, handler)
