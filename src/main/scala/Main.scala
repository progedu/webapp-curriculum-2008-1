object Main {

  implicit class RichString(val src: String) {
    def twice: String = src + src
    def increase(count: Int): String = {
      var result: String = ""
      for(_ <- 0 to  count) {
        result += src
      }
      result
    }
  }
}
