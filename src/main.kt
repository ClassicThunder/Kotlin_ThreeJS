package org.sample

import js.dom.html.window
import js.jquery.*

fun main(args: Array<String>) {

    var scene : Scene = THREE.Scene();
    var camera : PerspectiveCamera = THREE.PerspectiveCamera(75, window.innerWidth/window.innerHeight, 0.1, 1000);

    var renderer : WebGLRenderer = THREE.WebGLRenderer();
    renderer.setSize(window.innerWidth, window.innerHeight);

    window.document.body.appendChild(renderer.domElement);

    var geometry = THREE.BoxGeometry(1,1,1);
    var material = THREE.MeshBasicMaterial(THREE.Color("0x00ff00"));
    var cube = THREE.Mesh(geometry, material);

    scene.add(cube);
}