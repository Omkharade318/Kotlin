import kotlin.math.pow

fun main(){
  var fn = ::add1
  println(fn(5.43,6.46))

  fn = ::power
  println(fn(5.0,2.0))
}

fun add1(a:Double, b:Double):Double{
   return a+b
}

fun power(a:Double, b:Double):Double{
    return a.pow(b)       // pow() function gives the power ie raised to
}