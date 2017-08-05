object Main {

  implicit class RichString(val src: String) {
    def twice: String = src + src
  }

}
