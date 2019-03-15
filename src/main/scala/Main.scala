object Main {

  implicit class RichString(val string: String) {
    def twice: String = string + string
  }

}
