package js.threejs

import js.native
import js.noImpl
import org.w3c.dom.Element
import java.util.ArrayList

native("THREE.Geometry")
public open class Geometry {
    //Properties
    public native var id: Int = js.noImpl
    public native var name: String = js.noImpl
    public native var vertices: Array<Vector3> = js.noImpl
    public native var colors: Array<Color> = js.noImpl
    //public native var faces: JSArray<Triangle> = js.noImpl
    //public native var faceVertexUvs: JSArray<UV> = js.noImpl
    //public native var morphTargets: Vector3 = js.noImpl
    //public native var morphColors: Vector3 = js.noImpl
    //public native var morphNormals: Vector3 = js.noImpl
    public native var skinWeights: Vector3 = js.noImpl
    public native var skinIndices: Vector3 = js.noImpl
    //public native var boundingBox: Vector3 = js.noImpl
    public native var boundingSphere: Double = js.noImpl
    public native var hasTangents: Boolean = js.noImpl
    public native var dynamic: Boolean = js.noImpl
    public native var verticesNeedUpdate: Boolean = js.noImpl
    public native var elementsNeedUpdate: Boolean = js.noImpl
    public native var uvsNeedUpdate: Boolean = js.noImpl
    public native var normalsNeedUpdate: Boolean = js.noImpl
    public native var tangentsNeedUpdate: Boolean = js.noImpl
    public native var colorsNeedUpdate: Boolean = js.noImpl
    public native var lineDistancesNeedUpdate: Boolean = js.noImpl
    public native var buffersNeedUpdate: Boolean = js.noImpl
    public native var lineDistances: Array<Double> = js.noImpl
    //Functions
    public fun applyMatrix(m: Matrix4): Unit = js.noImpl
    public fun computeFaceNormals(): Unit = js.noImpl
    public fun computeVertexNormals(): Unit = js.noImpl
    public fun computeMorphNormals(): Unit = js.noImpl
    public fun computeTangents(): Unit = js.noImpl
    public fun computeBoundingBox(): Unit = js.noImpl
    public fun computeBoundingSphere(): Unit = js.noImpl
    public fun merge(geometry: Geometry, m: Matrix4, materialIndexOffset: Int): Unit = js.noImpl
    public fun mergeVertices(): Unit = js.noImpl
    public fun makeGroups(m: Matrix4): Unit = js.noImpl
    public fun clone(m: Matrix4): Unit = js.noImpl
    public fun dispose(m: Matrix4): Unit = js.noImpl
    public fun computeLineDistances(m: Matrix4): Unit = js.noImpl
}

native("THREE.Object3D")
public open class Object3D {
    public native var parent: Object3D = js.noImpl
    public native var children: Array<Object3D> = js.noImpl
    public native var position: Vector3 = js.noImpl
    public native var rotation: Euler = js.noImpl
}