(function (Kotlin) {
  'use strict';
  var _ = Kotlin.defineRootPackage(null, /** @lends _ */ {
    org: Kotlin.definePackage(null, /** @lends _.org */ {
      Kotlin_ThreeJS: Kotlin.definePackage(null, /** @lends _.org.Kotlin_ThreeJS */ {
        EventHelper: Kotlin.createClass(null, function (window) {
          this.$MouseMove_3uq39x$ = _.org.Kotlin_ThreeJS.EventHelper.EventHelper$f;
          this.$MouseUp_u85p9d$ = _.org.Kotlin_ThreeJS.EventHelper.EventHelper$f_0;
          this.$MouseDown_3ukcfa$ = _.org.Kotlin_ThreeJS.EventHelper.EventHelper$f_1;
          this.$MouseOut_dmg5me$ = _.org.Kotlin_ThreeJS.EventHelper.EventHelper$f_2;
          this.$KeyUp_1maazr$ = _.org.Kotlin_ThreeJS.EventHelper.EventHelper$f_3;
          this.$KeyDown_6r2yjk$ = _.org.Kotlin_ThreeJS.EventHelper.EventHelper$f_4;
          this.$WindowResize_bgfe5h$ = _.org.Kotlin_ThreeJS.EventHelper.EventHelper$f_5;
        }, /** @lends _.org.Kotlin_ThreeJS.EventHelper.prototype */ {
          MouseMove: {
            get: function () {
              return this.$MouseMove_3uq39x$;
            },
            set: function (value) {
              window.document.removeEventListener('mousemove', this.$MouseMove_3uq39x$, false);
              this.$MouseMove_3uq39x$ = value;
              window.document.addEventListener('mousemove', value, false);
            }
          },
          MouseUp: {
            get: function () {
              return this.$MouseUp_u85p9d$;
            },
            set: function (value) {
              window.document.removeEventListener('mouseup', this.$MouseUp_u85p9d$, false);
              this.$MouseUp_u85p9d$ = value;
              window.document.addEventListener('mouseup', value, false);
            }
          },
          MouseDown: {
            get: function () {
              return this.$MouseDown_3ukcfa$;
            },
            set: function (value) {
              window.document.removeEventListener('mousedown', this.$MouseDown_3ukcfa$, false);
              this.$MouseDown_3ukcfa$ = value;
              window.document.addEventListener('mousedown', value, false);
            }
          },
          MouseOut: {
            get: function () {
              return this.$MouseOut_dmg5me$;
            },
            set: function (value) {
              window.document.removeEventListener('mouseout', this.$MouseOut_dmg5me$, false);
              this.$MouseOut_dmg5me$ = value;
              window.document.addEventListener('mouseout', value, false);
            }
          },
          KeyUp: {
            get: function () {
              return this.$KeyUp_1maazr$;
            },
            set: function (value) {
              window.removeEventListener('keyup', this.$KeyUp_1maazr$, false);
              this.$KeyUp_1maazr$ = value;
              window.addEventListener('keyup', value, false);
            }
          },
          KeyDown: {
            get: function () {
              return this.$KeyDown_6r2yjk$;
            },
            set: function (value) {
              window.removeEventListener('keydown', this.$KeyDown_6r2yjk$, false);
              this.$KeyDown_6r2yjk$ = value;
              window.addEventListener('keydown', value, false);
            }
          },
          WindowResize: {
            get: function () {
              return this.$WindowResize_bgfe5h$;
            },
            set: function (value) {
              window.removeEventListener('resize', this.$WindowResize_bgfe5h$, false);
              this.$WindowResize_bgfe5h$ = value;
              window.addEventListener('resize', value, false);
            }
          }
        }, /** @lends _.org.Kotlin_ThreeJS.EventHelper */ {
          EventHelper$f: function (event) {
          },
          EventHelper$f_0: function (event) {
          },
          EventHelper$f_1: function (event) {
          },
          EventHelper$f_2: function (event) {
          },
          EventHelper$f_3: function (event) {
          },
          EventHelper$f_4: function (event) {
          },
          EventHelper$f_5: function (event) {
          }
        }),
        main$f: function (p) {
          return function () {
            p.v.Render();
          };
        },
        main: function (args) {
          var p = {v: new _.org.Kotlin_ThreeJS.Example(window)};
          p.v.SetUpInput();
          p.v.CreateParticles();
          window.setInterval(_.org.Kotlin_ThreeJS.main$f(p), 1000 / 30 | 0);
        },
        Example: Kotlin.createClass(null, function (window) {
          this.mouseX = 0.0;
          this.mouseY = 0.0;
          this.windowHalfX = window.innerWidth / 2;
          this.windowHalfY = window.innerHeight / 2;
          this.materials = [];
          this.colorParams = [];
          this.scene = new THREE.Scene();
          this.scene.fog = new THREE.FogExp2(new THREE.Color('0x000000'), 8.0E-4);
          this.camera = new THREE.PerspectiveCamera(75.0, window.innerWidth / window.innerHeight, 1, 3000);
          this.camera.position.z = 1000.0;
          this.renderer = new THREE.WebGLRenderer();
          this.renderer.setSize(window.innerWidth, window.innerHeight);
          this.geometry = new THREE.Geometry();
          this.helper = new _.org.Kotlin_ThreeJS.EventHelper(window);
          this.sprite1 = THREE.ImageUtils.loadTexture('textures/sprites/snowflake1.png');
          this.sprite2 = THREE.ImageUtils.loadTexture('textures/sprites/snowflake2.png');
          this.sprite3 = THREE.ImageUtils.loadTexture('textures/sprites/snowflake3.png');
          this.sprite4 = THREE.ImageUtils.loadTexture('textures/sprites/snowflake4.png');
          this.sprite5 = THREE.ImageUtils.loadTexture('textures/sprites/snowflake5.png');
          window.document.body.appendChild(this.renderer.domElement);
        }, /** @lends _.org.Kotlin_ThreeJS.Example.prototype */ {
          SetUpInput: function () {
            var mouseMove = _.org.Kotlin_ThreeJS.Example.SetUpInput$f(this);
            this.helper.MouseMove = mouseMove;
            var resize = _.org.Kotlin_ThreeJS.Example.SetUpInput$f_0(this);
            this.helper.WindowResize = resize;
          },
          CreateParticles: function () {
            var spriteParams = [this.sprite2, this.sprite3, this.sprite1, this.sprite5, this.sprite4];
            var sizeParams = [20.0, 15.0, 10.0, 8.0, 5.0];
            this.colorParams = [[1.0, 0.2, 0.5], [0.95, 0.1, 0.5], [0.9, 0.05, 0.5], [0.85, 0.0, 0.5], [0.8, 0.0, 0.5]];
            var tmp$0, tmp$1;
            {
              tmp$0 = 20000 + 1;
              for (var i = 0; i !== tmp$0; i++) {
                var vertex = new THREE.Vector3();
                vertex.x = Math.random() * 2000 - 1000;
                vertex.y = Math.random() * 2000 - 1000;
                vertex.z = Math.random() * 2000 - 1000;
                this.geometry.vertices.push(vertex);
              }
            }
            {
              tmp$1 = 4 + 1;
              for (var i_0 = 0; i_0 !== tmp$1; i_0++) {
                var color = this.colorParams[i_0];
                var sprite = {v: spriteParams[i_0]};
                var size = {v: sizeParams[i_0]};
                var sizeObject = _.org.Kotlin_ThreeJS.Example.CreateParticles$f(size, sprite);
                this.materials[i_0] = new THREE.PointCloudMaterial(sizeObject);
                this.materials[i_0].color.setHSL(color[0], color[1], color[2]);
                var particles = new THREE.PointCloud(this.geometry, this.materials[i_0]);
                particles.rotation.x = Math.random() * 6;
                particles.rotation.y = Math.random() * 6;
                particles.rotation.z = Math.random() * 6;
                this.scene.add(particles);
              }
            }
          },
          Render: function () {
            var time = (new Date()).getTime() * 5.0E-5;
            this.camera.position.x = this.camera.position.x + (this.mouseX - this.camera.position.x) * 0.05;
            this.camera.position.y = this.camera.position.y + (-this.mouseY - this.camera.position.y) * 0.05;
            this.camera.lookAt(this.scene.position);
            var tmp$0, tmp$1;
            {
              tmp$0 = this.scene.children.length - 1 + 1;
              for (var i = 0; i !== tmp$0; i++) {
                var obj = this.scene.children[i];
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
              tmp$1 = this.materials.length - 1 + 1;
              for (var i_0 = 0; i_0 !== tmp$1; i_0++) {
                var color = this.colorParams[i_0];
                var h = 360 * (color[0] + time) % 360 / 360;
                this.materials[i_0].color.setHSL(h, color[1], color[2]);
              }
            }
            this.renderer.render(this.scene, this.camera);
          }
        }, /** @lends _.org.Kotlin_ThreeJS.Example */ {
          SetUpInput$f: function (this$Example) {
            return function (event) {
              this$Example.mouseX = event.clientX - this$Example.windowHalfX;
              this$Example.mouseY = event.clientY - this$Example.windowHalfY;
            };
          },
          SetUpInput$f_0: function (this$Example) {
            return function (event) {
              this$Example.windowHalfX = window.innerWidth / 2;
              this$Example.windowHalfY = window.innerHeight / 2;
              this$Example.camera.aspect = window.innerWidth / window.innerHeight;
              this$Example.camera.updateProjectionMatrix();
              this$Example.renderer.setSize(window.innerWidth, window.innerHeight);
            };
          },
          CreateParticles$f: function (size, sprite) {
            return Kotlin.createObject(null, function () {
              this.size = size.v;
              this.map = sprite.v;
              this.blending = THREE.AdditiveBlending;
              this.depthTest = false;
              this.transparent = true;
            });
          }
        })
      })
    })
  });
  Kotlin.defineModule('game', _);
  _.org.Kotlin_ThreeJS.main([]);
}(Kotlin));
