package org.sample

import js.dom.html.window
import js.threejs.*
import js.dom.html.Object
import js.dom.html.Event
import org.w3c.dom.events.MouseEvent

fun main(args: Array<String>) {

    var mouseX = 0.0
    var mouseY = 0.0

    var windowHalfX = window.innerWidth / 2;
    var windowHalfY = window.innerHeight / 2;

    var scene : Scene = Scene();

    var camera : PerspectiveCamera = PerspectiveCamera(75, window.innerWidth/window.innerHeight, 1, 3000 );
    camera.position.z = 1000.0;

    var renderer : WebGLRenderer = WebGLRenderer();
    renderer.setSize(window.innerWidth, window.innerHeight);

    window.document.body.appendChild(renderer.domElement);
    var geometry = Geometry();


    val onDocumentMouseMove = { (event: Event) : Unit ->
        mouseX = event.clientX - windowHalfX;
        mouseY = event.clientY - windowHalfY;
    }
    window.document.addEventListener("mousemove", onDocumentMouseMove, false );

    val onWindowResize = { (event: Event) : Unit ->
        windowHalfX = window.innerWidth / 2;
        windowHalfY = window.innerHeight / 2;

        camera.aspect = window.innerWidth / window.innerHeight;
        camera.updateProjectionMatrix();

        renderer.setSize( window.innerWidth, window.innerHeight );
    }
    window.addEventListener("resize", onWindowResize, false );

    for (i in 0..20000) {

        var vertex = Vector3();
        vertex.x = Math.random() * 2000 - 1000;
        vertex.y = Math.random() * 2000 - 1000;
        vertex.z = Math.random() * 2000 - 1000;

        geometry.vertices.push(vertex);
    }

    val parameters = array(5.0, 4.0, 3.0, 2.0, 1.0)

    var materials = array<PointCloudMaterial>()

    for (i in 0..parameters.size-1) {
        var size = parameters[i];

        var sizeObject = object {
            var size: Double = size
        }
        materials[i] = PointCloudMaterial(sizeObject);

        var particles = PointCloud(geometry, materials[i]);

        particles.rotation.x = Math.random() * 6;
        particles.rotation.y = Math.random() * 6;
        particles.rotation.z = Math.random() * 6;

        scene.add(particles);
    }

    val colorParameters = array(
            array(.80, 1.0, .5),
            array(.85, 1.0, .5),
            array(.90, 1.0, .5),
            array(.95, 1.0, .5),
            array(1.0, 1.0, .5))

    var render = {
        var time = Date().getTime() * 0.00005;

        camera.position.x += (mouseX - camera.position.x) * 0.05;
        camera.position.y += (-mouseY - camera.position.y) * 0.05;

        camera.lookAt(scene.position);

        for (i in 0..scene.children.size-1) {

            var obj = scene.children[i];

            when (obj) {
                is PointCloud -> {
                    if (i < 4) {
                        obj.rotation.y = time * (i+1.0);
                    } else {
                        obj.rotation.y = time * (-(i+1.0));
                    }
                }
            }
        }

        for ( i in 0..materials.size-1) {

            var color = colorParameters[i];

            var h = ( 360 * ( color[0] + time ) % 360 ) / 360;
            materials[i].color.setHSL(h, color[1], color[2]);
        }

        renderer.render(scene, camera);
    };
    window.setInterval(render, 1000 / 30);
}