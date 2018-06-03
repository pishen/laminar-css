package core

import scalacss.DevDefaults._

object CSS extends StyleSheet.Inline {
  import dsl._

  val yellowBack = style(
    backgroundColor.yellow
  )
}
