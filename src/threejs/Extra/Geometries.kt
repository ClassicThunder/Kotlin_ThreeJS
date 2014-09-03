package js.threejs

import js.native
import js.noImpl
import js.dom.html.Object

native("THREE.BoxGeometry")
public class BoxGeometry(x: Int, y: Int, z: Int) {

}

//native("THREE.ShapeGeometry")
//fun ShapeGeometry(s: Shape) = ShapeGeometry(Array(1){s})

native("THREE.ShapeGeometry")
public class ShapeGeometry(shapes: Array<Shape>, options: Object = js.noImpl) : Geometry() {
    //Functions
    public fun addShapeList(shapes: Array<Shape>, options: Object): Unit = js.noImpl
    public fun addShape(shapes: Array<Shape>, options: Object): Unit = js.noImpl
}