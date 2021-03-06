@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package React

import react.ReactElement

typealias ElementRef<C> = Any

typealias ComponentState = Any

typealias SFCElement<P> = FunctionComponentElement

typealias CElement<P, T> = ComponentElement<P, T>

typealias ClassicElement<P> = CElement<P, ClassicComponent<P, ComponentState>>

typealias Factory<P> = (props: Attributes /* Attributes & P */, children: dynamic /* ReactElement__0? | String? | Number? | Any? | ReactNodeArray? | ReactPortal? | Boolean? */) -> ReactElement

typealias SFCFactory<P> = FunctionComponentFactory<P>

typealias FunctionComponentFactory<P> = (props: Attributes /* Attributes & P */, children: dynamic /* ReactElement__0? | String? | Number? | Any? | ReactNodeArray? | ReactPortal? | Boolean? */) -> FunctionComponentElement

typealias ComponentFactory<P, T> = (props: ClassAttributes<T> /* ClassAttributes<T> & P */, children: dynamic /* ReactElement__0? | String? | Number? | Any? | ReactNodeArray? | ReactPortal? | Boolean? */) -> CElement<P, T>

typealias CFactory<P, T> = ComponentFactory<P, T>

typealias ClassicFactory<P> = CFactory<P, ClassicComponent<P, ComponentState>>

typealias DOMFactory<P, T> = (props: ClassAttributes<T> /* ClassAttributes<T> & P */, children: dynamic /* ReactElement__0? | String? | Number? | Any? | ReactNodeArray? | ReactPortal? | Boolean? */) -> DOMElement<P, T>

typealias ReactNodeArray = Array<dynamic /* ReactElement__0? | String? | Number? | Any? | ReactNodeArray? | ReactPortal? | Boolean? */>

typealias ContextType<C> = Any

typealias Provider<T> = ProviderExoticComponent<ProviderProps<T>>

typealias Consumer<T> = ExoticComponent<ConsumerProps<T>>

typealias ProfilerOnRenderCallback = (id: String, phase: String /* "mount" | "update" */, actualDuration: Number, baseDuration: Number, startTime: Number, commitTime: Number, interactions: Set<SchedulerInteraction>) -> Unit

typealias SFC<P> = FunctionComponent<P>

typealias StatelessComponent<P> = FunctionComponent<P>

typealias FC<P> = FunctionComponent<P>

typealias VFC<P> = VoidFunctionComponent<P>

typealias GetDerivedStateFromProps<P, S> = (nextProps: Readonly<P>, prevState: S) -> Partial<S>?

typealias GetDerivedStateFromError<P, S> = (error: Any) -> Partial<S>?

typealias PropsWithoutRef<P> = Any

typealias PropsWithRef<P> = Any

typealias ComponentProps<T> = Any

typealias ComponentPropsWithRef<T> = Any

typealias ComponentPropsWithoutRef<T> = PropsWithoutRef<ComponentProps<T>>

typealias Dispatch<A> = (value: A) -> Unit

typealias DispatchWithoutAction = () -> Unit

typealias Reducer<S, A> = (prevState: S, action: A) -> S

typealias ReducerWithoutAction<S> = (prevState: S) -> S

typealias ReducerState<R> = Any

typealias ReducerAction<R> = Any

typealias ReducerStateWithoutAction<R> = Any

typealias DependencyList = Array<Any>

typealias EffectCallback = () -> dynamic

typealias ReactEventHandler<T> = Any

typealias ClipboardEventHandler<T> = Any

typealias CompositionEventHandler<T> = Any

typealias DragEventHandler<T> = Any

typealias FocusEventHandler<T> = Any

typealias FormEventHandler<T> = Any

typealias ChangeEventHandler<T> = Any

typealias KeyboardEventHandler<T> = Any

typealias MouseEventHandler<T> = Any

typealias TouchEventHandler<T> = Any

typealias PointerEventHandler<T> = Any

typealias UIEventHandler<T> = Any

typealias WheelEventHandler<T> = Any

typealias AnimationEventHandler<T> = Any

typealias TransitionEventHandler<T> = Any

typealias WeakValidationMap<T> = Any

typealias TransitionFunction = () -> Unit?
