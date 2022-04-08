object Main {
  implicit class RichString(str: String) {
    def twice():String = str + str
  }
}
