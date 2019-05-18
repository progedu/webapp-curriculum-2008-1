object Main {
  implicit class RichString(src: String) {
    def twice: String = src + src
  }
}
