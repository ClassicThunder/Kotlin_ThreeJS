package js.threejs

import js.native
import js.noImpl

native("THREE.Curve")
public open class Curve() {
    //Functions
    //public fun getPoint(t: Double): Unit = js.noImpl
    //public fun getPointAt(u: Double): Unit = js.noImpl
    //public fun getPoints(t: Array<Double>): Unit = js.noImpl
    //public fun getSpacedPoints(u: Array<Double>): Unit = js.noImpl
    //public fun getLength(): Unit = js.noImpl
    //public fun getLengths(t: Array<Double>): Unit = js.noImpl
    //public fun updateArcLengths(): Unit = js.noImpl
    //public fun getUtoTmapping(u: Double, distance : Double): Unit = js.noImpl
    //public fun getTangent(t: Double): Unit = js.noImpl
    //public fun getTangentAt(u: Double): Unit = js.noImpl
}

native("THREE.CurvePath")
public open class CurvePath() : Curve() {
    //Properties
    public native var curves: Array<Double> = js.noImpl
    public native var bends: Array<Double> = js.noImpl
    public native var autoClose: Boolean = js.noImpl
    //Functions
    public fun createPointsGeometry (): Geometry = js.noImpl
    public fun createSpacedPointsGeometry(divisions: Int): Geometry = js.noImpl
}

native("THREE.Path")
public open class Path(points: Array<Vector2>) : CurvePath() {
    //Functions
    public fun fromPoints(points: Array<Vector2>): Unit = js.noImpl
    public fun moveTo(x: Double, y: Double): Unit = js.noImpl
    public fun lineTo(x: Double, y: Double): Unit = js.noImpl
    //public fun quadraticCurveTo(aCPx: Double, aCPy: Double, aX: Double, aY: Double): Unit = js.noImpl
    //public fun bezierCurveTo(aCP1x: Double, aCP1y: Double, aCP2x: Double, aCP2y: Double, aX: Double, aY: Double): Unit = js.noImpl
    //public fun splineThru(m: Matrix4): Unit = js.noImpl
    //public fun arc(m: Matrix4): Unit = js.noImpl
    //public fun absarc(m: Matrix4): Unit = js.noImpl
    //public fun ellipse(m: Matrix4): Unit = js.noImpl
    //public fun absellipse (m: Matrix4): Unit = js.noImpl
    //public fun toShapes(): Unit = js.noImpl
}

native("THREE.Shape")
public open class Shape() : Path(array()) {
    //Properties
    public native var lineDistances: Array<Double> = js.noImpl
    //Functions
    public fun applyMatrix(m: Matrix4): Unit = js.noImpl
}