package lt.wonderb0.advent.day4

object PassphraseChecker {
  private case class CheckResult(valid: Boolean = true, seen: Set[String] = Set.empty)

  def checkPhrase(phrase: String): Boolean = {

      phrase.split(" ").foldLeft(CheckResult())({
        case (r, s) =>
          if (r.seen.contains(s)) r.copy(valid = false)
          else r.copy(seen = r.seen + s)
      }).valid
    }

  def checkPhraseAnagrams(phrase: String): Boolean = {
    val wordCharMaps = phrase.split(" ").map {
      word => word.toSeq
    }.map {
      wordSeq => wordSeq.foldLeft(Map[Char, Int]().withDefaultValue(0)) {
        case (m, c) => m.updated(c, m(c) + 1)
      }
    }.toSeq

    wordCharMaps.size == wordCharMaps.toSet.size
  }

  def main(args: Array[String]): Unit = {
    println(Passphrases().count(checkPhraseAnagrams))
  }
}