package React

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
