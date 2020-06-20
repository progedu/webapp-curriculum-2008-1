object Main {
  implicit class RichString(val arg: String) {
    def twice: String = arg + arg
  }
}
