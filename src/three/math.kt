package js.threejs

import js.native
import js.noImpl
import org.w3c.dom.Element

native("THREE.Color")
public class Color(hexString: String) {
    //Properties
    public native var r: Double = 0.0
    public native var b: Double = 0.0
    public native var g: Double = 0.0
    //Functions
    public fun setRGB(r: Double, b: Double, g: Double): Unit = js.noImpl
}


native("THREE.Color")
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

native("THREE.Color")
public native trait Euler {
    //Properties
    public native var x: Double
    public native var y: Double
    public native var z: Double
    public native var order: String
    //Functions
    public fun set(x: Double, y: Double, z: Double, order: String): Unit
}