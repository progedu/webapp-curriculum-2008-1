object Main {
class Primary(val src: String) {
   def twice: String = src + src
 }
  implicit def enprimary(arg: String): Primary = new Primary(arg)
}
