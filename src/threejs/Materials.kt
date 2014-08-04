package js.threejs

import js.native
import js.noImpl
import js.dom.html.Object

native("THREE.Material")
public open class Material() {

}

native("THREE.MeshBasicMaterial")
public class MeshBasicMaterial(color: Color) : Material() {

}

native("THREE.PointCloudMaterial")
public class PointCloudMaterial(parameters: Any) : Material() {
    public native var color: Color = js.noImpl
    //public native var map: Int = js.noImpl
    public native var size: Double = js.noImpl
    public native var sizeAttenuation: Boolean = js.noImpl
    public native var vertexColors: Boolean = js.noImpl
    public native var fog: Boolean = js.noImpl
}