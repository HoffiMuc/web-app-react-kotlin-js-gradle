package com.palantir.blueprintjs.core

import org.w3c.dom.HTMLDivElement
import org.w3c.dom.HTMLInputElement
import org.w3c.dom.events.MouseEvent

typealias IKeyWhitelist<T> = IKeyAllowlist<T>

typealias IKeyBlacklist<T> = IKeyDenylist<T>

typealias HTMLDivProps = React.HTMLAttributes<HTMLDivElement>

typealias HTMLInputProps = React.InputHTMLAttributes<HTMLInputElement>

typealias IConstructor<T> = Any

typealias IRadioProps = IControlProps

typealias IRefCallback<T> = (ref: T?) -> Any

typealias TreeEventHandler<T> = (node: ITreeNode<T>, nodePath: Array<Number>, e: MouseEvent) -> Unit

typealias LifecycleCompatPolyfill<P, T> = (Comp: T) -> T
