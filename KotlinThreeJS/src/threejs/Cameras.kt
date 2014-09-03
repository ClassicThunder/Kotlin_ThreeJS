package js.threejs

import js.native
import js.noImpl

native("THREE.Camera")
public open class Camera : Object3D() {
    //Properties
    public native var matrixWorldInverse: Double = 0.0
    public native var projectionMatrix: Double = 0.0
    //Functions
    public fun lookAt(vector: Vector3): Unit = js.noImpl
}

native("THREE.PerspectiveCamera")
public class PerspectiveCamera(fovDegrees: Double, aspect: Double, near: Int, far: Int) : Camera() {
    //Properties
    public native var fov: Double = 0.0
    public native var aspect: Double = 0.0
    public native var near: Double = 0.0
    public native var far: Double = 0.0
    //Functions
    public fun setLens(focalLength: Int, frameSize: Int): Unit = js.noImpl
    public fun setViewOffset(fullWidth: Int, fullHeight: Int, x : Int, y: Int, width: Int, height: Int): Unit = js.noImpl
    public fun updateProjectionMatrix(): Unit = js.noImpl
}

native("THREE.OrthographicCamera")
public class OrthographicCamera(left: Double, right: Double, top: Double, bottom: Double, near: Int, far: Int) : Camera() {
    //Properties
    public native var left: Double = 0.0
    public native var right: Double = 0.0
    public native var top: Double = 0.0
    public native var bottom: Double = 0.0
    public native var near: Int = 0
    public native var far: Int = 0
    //Functions
    public fun updateProjectionMatrix(): Unit = js.noImpl
}