package org.sample

import js.dom.html.window
import js.jquery.*
import js.threejs.*

fun main(args: Array<String>) {

    var scene : Scene = Scene();
    var camera : PerspectiveCamera = PerspectiveCamera(75, window.innerWidth/window.innerHeight, 0.1, 1000);

    var renderer : WebGLRenderer = WebGLRenderer();
    renderer.setSize(window.innerWidth, window.innerHeight);

    window.document.body.appendChild(renderer.domElement);

    var geometry = BoxGeometry(1,1,1);
    var material = MeshBasicMaterial(Color("0x00ff00"));

    var cube = Mesh(geometry, material);
    scene.add(cube);

    camera.position.z = 5.0;

    var render = {

        cube.rotation.x += 0.1;
        cube.rotation.y += 0.1;

        renderer.render(scene, camera);
    };
    window.setInterval(render, 1000 / 30);
}