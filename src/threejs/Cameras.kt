package js.threejs

import js.native
import js.noImpl
import org.w3c.dom.Element

native("THREE.Camera")
public open class Camera : Object3D() {
    //Properties
    public native var matrixWorldInverse: Double = 0.0
    public native var projectionMatrix: Double = 0.0
    //Functions
    public fun lookAt(vector: Vector3): Unit = js.noImpl
}
//http://stackoverflow.com/questions/19299525/kotlin-secondary-constructor
native("THREE.PerspectiveCamera")
public class PerspectiveCamera(fovDegrees: Number, aspect: Number, near: Number, far: Number) : Camera() {
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