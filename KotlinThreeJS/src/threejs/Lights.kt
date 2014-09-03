package js.threejs

import js.native
import js.noImpl

native("THREE.Light")
public open class Light(color: Int) : Object3D() {
    //Properties
    public native var color: Color = js.noImpl
}

native("THREE.DirectionalLight")
public class DirectionalLight(color: Int, intensity: Double = 1.0) : Light(color: Int) {
    //Properties
    public native var target: Object3D = js.noImpl
    public native var intensity: Double = 0.0
    public native var onlyShadow: Boolean = false
    public native var shadowCameraNear: Int = 50
    public native var shadowCameraFar: Int = 5000
    public native var shadowCameraLeft: Int = -500
    public native var shadowCameraRight: Int = 500
    public native var shadowCameraTop: Int = 500
    public native var shadowCameraBottom: Int = -500
    public native var shadowBias: Double = 0.0
    public native var shadowMapWidth: Int = 512
    public native var shadowMapHeight: Int = 512
}