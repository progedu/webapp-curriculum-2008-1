object Main {

  implicit class RitchString(val src: String){
    def twice: String = src + src

    def smile: String = src + ":-)"
  }

}
