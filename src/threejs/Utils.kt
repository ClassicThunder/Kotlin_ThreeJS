package utils

import js.threejs.Vector3

native("Array")
public open class Camera() {
    //Properties
    public native var matrixWorldInverse: Double = 0.0
    public native var projectionMatrix: Double = 0.0
    //Functions
    public fun lookAt(vector: Vector3): Unit = js.noImpl
}