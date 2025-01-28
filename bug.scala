```scala
class MyClass[T](val value: T) {
  def myMethod(other: MyClass[T]): Boolean = {
    value == other.value
  }
}

object Main extends App {
  val a = new MyClass(1)
  val b = new MyClass(1.0)
  println(a.myMethod(b)) // This will compile but return false, showcasing type variance issue
}
```