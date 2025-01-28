```scala
class MyClass[T](val value: T) {
  def myMethod(other: Any): Boolean = {
    value match {
      case num1: Number =>
        other match {
          case num2: Number =>
            num1.doubleValue == num2.doubleValue // Compare using double values for numeric compatibility
          case _ => false
        }
      case _ => false
    }
  }
}

object Main extends App {
  val a = new MyClass(1)
  val b = new MyClass(1.0)
  println(a.myMethod(b)) // Correctly prints true
  val c = new MyClass("hello")
  val d = new MyClass(1)
  println(a.myMethod(c)) // Correctly prints false
}
```