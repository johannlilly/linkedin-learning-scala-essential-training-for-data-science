(base) user@zyxic-ambp-13-512 ~ % scala
Welcome to Scala 2.13.4 (OpenJDK 64-Bit Server VM, Java 15.0.1).
Type in expressions for evaluation. Or try :help.

scala> 
val temps = Array(50, 51, 56, 53, 40)
val temps: Array[Int] = Array(50, 51, 56, 53, 40)

scala> temps(1)
val res0: Int = 51

scala> temps(0)
val res1: Int = 50

scala> temps.length
val res2: Int = 5

scala> temps(0) = 52

scala> val temps2: Array[Int] = new Array[Int](10)
val temps2: Array[Int] = Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)

scala> val temps3 = Array.ofDim[Int](10,10)
val temps3: Array[Array[Int]] = Array(Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0), Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0), Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0), Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0), Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0), Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0), Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0), Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0), Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0), Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0))

scala> import Array._
import Array._

scala> 
