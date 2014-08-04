package js.threejs

import js.dom.html.*

native
fun <T> Array<T>.push(item: T): Unit = js.noImpl

native
fun Window.addEventListener(name: String, vCode: (Event) -> Unit, idk: Boolean): Unit = js.noImpl

native
fun HTMLDocument.addEventListener(name: String, vCode: (Event) -> Unit, idk: Boolean): Unit = js.noImpl
