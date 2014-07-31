package org.sample

import js.native
import js.noImpl
import org.w3c.dom.Element

native
public native trait Vector3 {
    //Properties
    public native var x: Double
    public native var y: Double
    public native var z: Double
    //Functions
    public fun set(x: Double, y: Double, z: Double): Unit
    public fun setX(x: Double): Unit
    public fun setY(y: Double): Unit
    public fun setZ(z: Double): Unit
}

native
public native trait Euler {
    //Properties
    public native var x: Double
    public native var y: Double
    public native var z: Double
    public native var order: String
    //Functions
    public fun set(x: Double, y: Double, z: Double, order: String): Unit
}