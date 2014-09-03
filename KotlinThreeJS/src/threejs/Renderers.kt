package js.threejs

import org.w3c.dom.Element

native("THREE.WebGLRenderer")
public class WebGLRenderer {
    public native var domElement: Element = js.noImpl
    //Functions
    public fun setSize(innerWidth: Double, innerHeight: Double): Unit = js.noImpl
    public fun setClearColor(color: Int): Unit = js.noImpl
    public fun render(scene: Scene, camera: PerspectiveCamera): Unit = js.noImpl
}
