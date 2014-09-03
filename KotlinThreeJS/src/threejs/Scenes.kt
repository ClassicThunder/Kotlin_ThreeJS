package js.threejs

import js.native
import js.noImpl

native("THREE.Scene")
public class Scene : Object3D() {
    //Properties
    public native var fog: FogExp2 = js.noImpl
    //Functions
    public fun add(a: Any): Unit = js.noImpl
}

native("THREE.FogExp2")
public class FogExp2(color: Color, density: Double) {
    //Properties
    public native var name: String = js.noImpl
    public native var color: Color = js.noImpl
    public native var density: Double = js.noImpl
    //Functions
    public fun clone(): FogExp2 = js.noImpl
}