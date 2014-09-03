package js.threejs

import js.native
import js.noImpl
import org.w3c.dom.Element
import java.util.ArrayList

native
val <T> undefined: T = noImpl

native("THREE.ImageUtils.loadTexture")
fun loadTexture(url: String): Texture = js.noImpl

native("THREE.SceneUtils.createMultiMaterialObject")
fun createMultiMaterialObject(geometry : Geometry, materials: Array<Material>): Object3D = js.noImpl