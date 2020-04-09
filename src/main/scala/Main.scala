object Main {
  implicit class TwiceString(val src: String) {
    def twice: String = src + src
  }
}
