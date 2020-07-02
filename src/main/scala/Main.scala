object Main {
  implicit  class twiceString(val src: String) {
    def twice: String = src + src
  }
}
