package React

import com.palantir.blueprintjs.core.AnimationEvent
import com.palantir.blueprintjs.core.TransitionEvent
import org.w3c.dom.DragEvent
import org.w3c.dom.TouchEvent
import org.w3c.dom.clipboard.ClipboardEvent
import org.w3c.dom.events.CompositionEvent
import org.w3c.dom.events.FocusEvent
import org.w3c.dom.events.KeyboardEvent
import org.w3c.dom.events.MouseEvent
import org.w3c.dom.events.UIEvent
import org.w3c.dom.events.WheelEvent
import org.w3c.dom.pointerevents.PointerEvent
import kotlin.js.Json

typealias Partial<T> = Any

typealias Readonly<T> = Any

typealias Pick<T, K> = Any

typealias Record<K, T> = Any

typealias Exclude<T, U> = Any

typealias Extract<T, U> = Any

typealias NonNullable<T> = Any

typealias InstanceType<T> = Any

typealias Validator<K> = (props: Json, propName: K, componentName: String, location: String, propFullName: String) -> Error?
typealias ValidationMap<T> = Any

typealias NativeAnimationEvent = AnimationEvent

typealias NativeClipboardEvent = ClipboardEvent

typealias NativeCompositionEvent = CompositionEvent

typealias NativeDragEvent = DragEvent

typealias NativeFocusEvent = FocusEvent

typealias NativeKeyboardEvent = KeyboardEvent

typealias NativeMouseEvent = MouseEvent

typealias NativeTouchEvent = TouchEvent

typealias NativePointerEvent = PointerEvent

typealias NativeTransitionEvent = TransitionEvent

typealias NativeUIEvent = UIEvent

typealias NativeWheelEvent = WheelEvent

//external interface SchedulerInteraction {
//    var id: Number
//    var name: String
//    var timestamp: Number
//}

typealias IsExactlyAny<T> = Any

typealias NotExactlyAnyPropertyKeys<T> = Any

typealias MergePropTypes<P, T> = Any

typealias Defaultize<P, D> = Any

typealias ReactManagedAttributes<C, P> = Any
