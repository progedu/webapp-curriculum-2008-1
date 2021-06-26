object TypeClass {

  trait Addiative[A] {
    def plus(a: A, b: A): A
    def zero: A
  }

  case class Point(x: Int, y: Int)

  object Point {
    implicit object PointAdditive extends Addiative[Point] {
      def plus(a: Point, b: Point): Point = {
        Point(a.x + b.x, a.y + b.y)
      }
      def zero: Point = Point(0, 0)
    }
  }

  def sum[A](lst: List[A])(implicit m: Addiative[A]): A =
    lst.foldLeft(m.zero)((x, y) => m.plus(x, y))
}
