scala> var a_int : Int = 3
var a_int: Int = 3

scala> var a_char : Char = 'd'
var a_char: Char = d

scala> var a_long : Long = 8345679
var a_long: Long = 8345679

scala> var b = 33
var b: Int = 33

scala> b = 3
// mutated b

scala> b
val res0: Int = 3

scala> var b_char = 'd
                    ^
       warning: symbol literal is deprecated; use Symbol("d") instead
var b_char: Symbol = Symbol(d)

scala> var b_char = 'd'
var b_char: Char = d

scala> var b_long = 8345679489
                    ^
       error: integer number too large

scala> var c_float = 1.2345
var c_float: Double = 1.2345

scala> c_float
val res2: Double = 1.2345

scala> var b_long = 8345679489f
var b_long: Float = 8.3456794E9

scala> val z = 8345678489L
val z: Long = 8345678489