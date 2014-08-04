(function (Kotlin) {
  'use strict';
  var _ = Kotlin.defineRootPackage(null, /** @lends _ */ {
    org: Kotlin.definePackage(null, /** @lends _.org */ {
      sample: Kotlin.definePackage(null, /** @lends _.org.sample */ {
        main$f: function (windowHalfX, mouseX, windowHalfY, mouseY) {
          return function (event) {
            mouseX.v = event.clientX - windowHalfX.v;
            mouseY.v = event.clientY - windowHalfY.v;
          };
        },
        main$f_0: function (windowHalfX, windowHalfY, camera, renderer) {
          return function (event) {
            windowHalfX.v = window.innerWidth / 2;
            windowHalfY.v = window.innerHeight / 2;
            camera.v.aspect = window.innerWidth / window.innerHeight;
            camera.v.updateProjectionMatrix();
            renderer.v.setSize(window.innerWidth, window.innerHeight);
          };
        },
        main$f_1: function (camera, mouseX, mouseY, scene, materials, colorParameters, renderer) {
          return function () {
            var time = (new Date()).getTime() * 5.0E-5;
            camera.v.position.x = camera.v.position.x + (mouseX.v - camera.v.position.x) * 0.05;
            camera.v.position.y = camera.v.position.y + (-mouseY.v - camera.v.position.y) * 0.05;
            camera.v.lookAt(scene.v.position);
            var tmp$0, tmp$1;
            {
              tmp$0 = scene.v.children.length - 1 + 1;
              for (var i = 0; i !== tmp$0; i++) {
                var obj = scene.v.children[i];
                {
                  if (Kotlin.isType(obj, THREE.PointCloud)) {
                    if (i < 4) {
                      obj.rotation.y = time * (i + 1.0);
                    }
                     else {
                      obj.rotation.y = time * -(i + 1.0);
                    }
                  }
                }
              }
            }
            {
              tmp$1 = materials.v.length - 1 + 1;
              for (var i_0 = 0; i_0 !== tmp$1; i_0++) {
                var color = colorParameters[i_0];
                var h = 360 * (color[0] + time) % 360 / 360;
                materials.v[i_0].color.setHSL(h, color[1], color[2]);
              }
            }
            renderer.v.render(scene.v, camera.v);
          };
        },
        main: function (args) {
          var mouseX = {v: 0.0};
          var mouseY = {v: 0.0};
          var windowHalfX = {v: window.innerWidth / 2};
          var windowHalfY = {v: window.innerHeight / 2};
          var scene = {v: new THREE.Scene()};
          var camera = {v: new THREE.PerspectiveCamera(75, window.innerWidth / window.innerHeight, 1, 3000)};
          camera.v.position.z = 1000.0;
          var renderer = {v: new THREE.WebGLRenderer()};
          renderer.v.setSize(window.innerWidth, window.innerHeight);
          window.document.body.appendChild(renderer.v.domElement);
          var geometry = new THREE.Geometry();
          var onDocumentMouseMove = _.org.sample.main$f(windowHalfX, mouseX, windowHalfY, mouseY);
          window.document.addEventListener('mousemove', onDocumentMouseMove, false);
          var onWindowResize = _.org.sample.main$f_0(windowHalfX, windowHalfY, camera, renderer);
          window.addEventListener('resize', onWindowResize, false);
          var tmp$0, tmp$1;
          {
            tmp$0 = 20000 + 1;
            for (var i = 0; i !== tmp$0; i++) {
              var vertex = new THREE.Color();
              vertex.x = Math.random() * 2000 - 1000;
              vertex.y = Math.random() * 2000 - 1000;
              vertex.z = Math.random() * 2000 - 1000;
              geometry.vertices.push(vertex);
            }
          }
          var parameters = [5.0, 4.0, 3.0, 2.0, 1.0];
          var materials = {v: []};
          {
            tmp$1 = parameters.length - 1 + 1;
            for (var i_0 = 0; i_0 !== tmp$1; i_0++) {
              var size = {v: parameters[i_0]};
              var sizeObject = Kotlin.createObject(null, function () {
                this.size = size.v;
              });
              materials.v[i_0] = new THREE.PointCloudMaterial(sizeObject);
              var particles = new THREE.PointCloud(geometry, materials.v[i_0]);
              particles.rotation.x = Math.random() * 6;
              particles.rotation.y = Math.random() * 6;
              particles.rotation.z = Math.random() * 6;
              scene.v.add(particles);
            }
          }
          var colorParameters = [[0.8, 1.0, 0.5], [0.85, 1.0, 0.5], [0.9, 1.0, 0.5], [0.95, 1.0, 0.5], [1.0, 1.0, 0.5]];
          var render = _.org.sample.main$f_1(camera, mouseX, mouseY, scene, materials, colorParameters, renderer);
          window.setInterval(render, 1000 / 30 | 0);
        }
      })
    })
  });
  Kotlin.defineModule('game', _);
  _.org.sample.main([]);
}(Kotlin));
