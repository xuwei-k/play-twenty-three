package play.twentythree

sealed abstract class MergeStrategy(val name: String)

object MergeStrategy {
  case object Deep extends MergeStrategy("deepMerge")
  case object Plus extends MergeStrategy("++")
}
