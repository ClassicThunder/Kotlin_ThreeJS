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
    public fun setHSL(h: Double, s: Double, l: Double): Unit = js.noImpl
}

native("THREE.Matrix4")
public class Matrix4(n11: Double, n12: Double, n13: Double, n14: Double,
                     n21: Double, n22: Double, n23: Double, n24: Double,
                     n31: Double, n32: Double, n33: Double, n34: Double,
                     n41: Double, n42: Double, n43: Double, n44: Double) {
    //Properties
    public native var elements: Array<Double> = js.noImpl
    //Functions
    public fun set(n11: Double, n12: Double, n13: Double, n14: Double,
                   n21: Double, n22: Double, n23: Double, n24: Double,
                   n31: Double, n32: Double, n33: Double, n34: Double,
                   n41: Double, n42: Double, n43: Double, n44: Double): Unit = js.noImpl
    public fun identity(): Matrix4 = js.noImpl
    public fun copy(m :Matrix4): Matrix4 = js.noImpl
    public fun copyPosition(m: Matrix4): Matrix4 = js.noImpl
    public fun extractRotation(m: Matrix4): Matrix4 = js.noImpl
    public fun lookAt(eye: Vector3, center: Vector3, up: Vector3): Matrix4 = js.noImpl
    public fun multiply(m :Matrix4): Matrix4 = js.noImpl
    public fun multiplyMatrices(a :Matrix4, b :Matrix4): Matrix4 = js.noImpl
    public fun multiplyToArray(a :Matrix4, b :Matrix4, r :Array<Double>): Matrix4 = js.noImpl
    public fun determinant(): Matrix4 = js.noImpl
    public fun transpose(): Double = js.noImpl
    public fun flattenToArrayOffset(flat :Array<Double>, offset: Int): Matrix4 = js.noImpl
    public fun setPosition(v: Vector3): Matrix4 = js.noImpl
    public fun getInverse(m: Matrix4): Matrix4 = js.noImpl
    public fun makeRotationFromEuler(v: Vector3, order: String): Matrix4 = js.noImpl
    //public fun makeRotationFromQuaternion(): Matrix4 = js.noImpl
    public fun scale(v: Vector3): Matrix4 = js.noImpl
    //public fun compose(): Matrix4 = js.noImpl
    //public fun decompose(): Matrix4 = js.noImpl
    public fun makeTranslation(x: Double, y: Double, z: Double): Matrix4 = js.noImpl
    public fun makeRotationX(x: Double): Matrix4 = js.noImpl
    public fun makeRotationY(y: Double): Matrix4 = js.noImpl
    public fun makeRotationZ(z: Double): Matrix4 = js.noImpl
    public fun makeRotationAxis(axis: Vector3, theta: Double): Matrix4 = js.noImpl
    public fun makeScale(x: Double, y: Double, z: Double): Matrix4 = js.noImpl
    public fun makeFrustum(left: Double, right: Double, bottom: Double,
                           top: Double, near: Double, far: Double): Matrix4 = js.noImpl
    public fun makePerspective(fov: Double, aspect: Double, near: Double, far: Double): Matrix4 = js.noImpl
    public fun makeOrthographic(): Matrix4 = js.noImpl
    public fun clone(): Matrix4 = js.noImpl
    public fun applyToVector3Array(a: Array<Double>): Matrix4 = js.noImpl
    public fun getMaxScaleOnAxis(): Double = js.noImpl
}

native("THREE.Color")
public class Euler {
    //Properties
    public native var x: Double = 0.0
    public native var y: Double = 0.0
    public native var z: Double = 0.0
    public native var order: String = ""
    //Functions
    public fun set(x: Double, y: Double, z: Double, order: String): Unit = js.noImpl
}

native("THREE.Color")
public class Vector3 {
    //Properties
    public native var x: Double = 0.0
    public native var y: Double = 0.0
    public native var z: Double = 0.0
    //Functions
    public fun set(x: Double, y: Double, z: Double): Unit = js.noImpl
    public fun setX(x: Double): Unit = js.noImpl
    public fun setY(y: Double): Unit = js.noImpl
    public fun setZ(z: Double): Unit = js.noImpl
}