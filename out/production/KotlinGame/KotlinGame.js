(function (Kotlin) {
  'use strict';
  var _ = Kotlin.defineRootPackage(null, /** @lends _ */ {
    org: Kotlin.definePackage(null, /** @lends _.org */ {
      sample: Kotlin.definePackage(null, /** @lends _.org.sample */ {
        main: function (args) {
          document.getElementById('email').setAttribute('value', 'hello@kotlinlang.org');
        }
      })
    })
  });
  Kotlin.defineModule('KotlinGame', _);
  _.org.sample.main([]);
}(Kotlin));
