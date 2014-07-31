package org.sample

import js.native
import js.noImpl
import org.w3c.dom.Element

native
public native trait Color {
    //Properties
    public native var r: Double
    public native var b: Double
    public native var g: Double
    //Functions
    public fun setRGB(t: Int, b: Int, g: Int): Unit
}

native
public native trait BoxGeometry {

}

native
public native trait MeshBasicMaterial {

}

native
public native trait Mesh {

}

native
public native trait WebGLRenderer {
    public native var domElement: Element
    //Functions
    public fun setSize(innerWidth: Double, innerHeight: Double): Unit
    public fun render(scene: Scene, camera: PerspectiveCamera): Unit
}

native
public native trait Scene {
    //Functions
    public fun add(mesh: Mesh): Unit
}

native
public native trait Camera : Object3D {

}

native
public native trait PerspectiveCamera : Camera {
    //Properties
    public native var fov: Double
    public native var aspect: Double
    public native var near: Double
    public native var far: Double
    //Functions
    public fun setLens(focalLength: Int, frameSize: Int): Unit
    public fun setViewOffset(fullWidth: Int, fullHeight: Int, x : Int, y: Int, width: Int, height: Int): Unit
    public fun updateProjectionMatrix(): Unit
}

native
public class THREEClass {
    //Functions
    public fun BoxGeometry(x: Int, y: Int, z: Int): BoxGeometry = js.noImpl
    public fun MeshBasicMaterial(color: Color): MeshBasicMaterial = js.noImpl
    public fun WebGLRenderer(): WebGLRenderer = js.noImpl
    public fun Mesh(geometry: BoxGeometry, material: MeshBasicMaterial): Mesh = js.noImpl
    public fun Scene(): Scene = js.noImpl
    public fun Color(hexString: String): Color = js.noImpl
    public fun PerspectiveCamera(fovDegrees: Number, aspect: Number, near: Number, far: Number): PerspectiveCamera = js.noImpl

    //Math
    public fun Vector3(x: Int, y: Int, z: Int): Vector3 = js.noImpl
    public fun Euler(x: Int, y: Int, z: Int, order: String): Euler = js.noImpl
}

native
public val THREE: THREEClass = THREEClass();

native
public native trait Object3D {
    public native var position: Vector3
}