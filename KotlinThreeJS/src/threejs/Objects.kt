package js.threejs

import js.dom.html.window
import js.jquery.*

native("THREE.Mesh")
public class Mesh(geometry: BoxGeometry, material: MeshBasicMaterial) : Object3D() {

}

native("THREE.PointCloud")
public class PointCloud(geometry: Geometry, material: Material) : Object3D() {

}