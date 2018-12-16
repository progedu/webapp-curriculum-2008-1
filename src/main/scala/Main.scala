object Main {

  implicit class TwiceStrings(val src: String) {
    def twice: String = src * 2
  }

}
