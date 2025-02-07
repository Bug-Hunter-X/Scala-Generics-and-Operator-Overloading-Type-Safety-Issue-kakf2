```scala
class MyClass[T](val value: T) {
  def myMethod(other: MyClass[T]): T = {
    value + other.value 
  }
}

object Main extends App {
  val num1 = new MyClass[Int](10)
  val num2 = new MyClass[Int](20)
  val sum = num1.myMethod(num2) //This line is problematic
  println(sum) // Output: 30 

  val str1 = new MyClass[String]("Hello")
  val str2 = new MyClass[String](" World")
  val strSum = str1.myMethod(str2) //This line is problematic
  println(strSum) //Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
}
```