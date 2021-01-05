@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

import kotlin.js.Json

typealias Validator<K> = (props: Json, propName: K, componentName: String, location: String, propFullName: String) -> Error?

typealias ValidationMap<T> = Any
