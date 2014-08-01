package js.threejs

import js.native
import js.noImpl
import org.w3c.dom.Element

native("THREE.Object3D")
public open class Object3D {
    public native var position: Vector3 = js.noImpl
    public native var rotation: Euler = js.noImpl
}