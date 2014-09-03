package js.threejs

import js.native

native("THREE")
public val ThreeJS: THREE = noImpl

native
public native trait THREE  {
    public native var MaterialCount: Int

    public native var NoShading: Int
    public native var FlatShading: Int
    public native var SmoothShading: Int

    public native var NoColors: Int
    public native var FaceColors: Int
    public native var VertexColors: Int

    public native var NormalBlending: Int
    public native var AdditiveBlending: Int
    public native var SubtractiveBlending: Int
    public native var MultiplyBlending: Int
    public native var AdditiveAlphaBlending: Int
}