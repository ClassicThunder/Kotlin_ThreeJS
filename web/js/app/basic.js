(function (Kotlin) {
  'use strict';
  var _ = Kotlin.defineRootPackage(null, /** @lends _ */ {
    org: Kotlin.definePackage(null, /** @lends _.org */ {
      sample: Kotlin.definePackage(null, /** @lends _.org.sample */ {
        main$f: function (cube, renderer, scene, camera) {
          return function () {
            cube.v.rotation.x = cube.v.rotation.x + 0.1;
            cube.v.rotation.y = cube.v.rotation.y + 0.1;
            renderer.v.render(scene.v, camera.v);
          };
        },
        main: function (args) {
          var scene = {v: new THREE.Scene()};
          var camera = {v: new THREE.PerspectiveCamera(75, window.innerWidth / window.innerHeight, 0.1, 1000)};
          var renderer = {v: new THREE.WebGLRenderer()};
          renderer.v.setSize(window.innerWidth, window.innerHeight);
          window.document.body.appendChild(renderer.v.domElement);
          var geometry = new THREE.BoxGeometry(1, 1, 1);
          var material = new THREE.MeshBasicMaterial(new THREE.Color('0x00ff00'));
          var cube = {v: new THREE.Mesh(geometry, material)};
          scene.v.add(cube.v);
          camera.v.position.z = 5.0;
          var render = _.org.sample.main$f(cube, renderer, scene, camera);
          window.setInterval(render, 1000 / 30 | 0);
        }
      })
    })
  });
  Kotlin.defineModule('basic', _);
  _.org.sample.main([]);
}(Kotlin));
