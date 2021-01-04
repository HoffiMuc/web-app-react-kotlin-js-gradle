@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

package React

external interface SchedulerInteraction {
    var id: Number
    var name: String
    var timestamp: Number
}

typealias IsExactlyAny<T> = Any

typealias NotExactlyAnyPropertyKeys<T> = Any

typealias MergePropTypes<P, T> = Any

typealias Defaultize<P, D> = Any

typealias ReactManagedAttributes<C, P> = Any