(function (Kotlin) {
  'use strict';
  var _ = Kotlin.defineRootPackage(null, /** @lends _ */ {
    org: Kotlin.definePackage(null, /** @lends _.org */ {
      sample: Kotlin.definePackage(null, /** @lends _.org.sample */ {
        main: function (args) {
          var scene = THREE.Scene();
          var camera = THREE.PerspectiveCamera(75, window.innerWidth / window.innerHeight, 0.1, 1000);
          var renderer = THREE.WebGLRenderer();
          renderer.setSize(window.innerWidth, window.innerHeight);
          window.document.body.appendChild(renderer.domElement);
          var geometry = THREE.BoxGeometry(1, 1, 1);
          var material = THREE.MeshBasicMaterial(THREE.Color('0x00ff00'));
          var cube = THREE.Mesh(geometry, material);
          scene.add(cube);
        }
      })
    })
  });
  Kotlin.defineModule('basic', _);
  _.org.sample.main([]);
}(Kotlin));
