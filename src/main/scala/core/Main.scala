package core

import com.raquo.laminar.api.L._
import org.scalajs.dom
import scalacss.DevDefaults._

object Main {
  def main(args: Array[String]): Unit = {
    println("Hello, Laminar")

    val sty = styleTag(CSS.render[String])
    dom.document.querySelector("head").appendChild(sty.ref)

    val res = div(cls := CSS.yellowBack.htmlClass, "Hello, Laminar")
    render(dom.document.getElementById("root"), res)
  }
}
