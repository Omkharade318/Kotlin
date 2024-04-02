fun main(){
   var num1 = 12 
   var num2 = 8

   //Arithmetic Operaors
   println("Arithmetic Operators: ")
   println(num1 + num2)
   println(num1 - num2)
   println(num1 * num2)
   println(num1 / num2.toFloat())
   println(num1 % num2)

   println()

  // Relational Operators
  println("Relational Operators: ")
  println(num1 == num2)
  println(num1 != num2)
  println(num1 >= num2)
  println(num1 <= num2)
  println(num1 >  num2)
  println(num1 <  num2)

  println()
  // Logical Operators
  println("Logical Operators: ")
  val Percentage70Above = false
  val KnowCoding = true

  var Hired = Percentage70Above && KnowCoding // AND 
  println("Hired: ${Hired}")

  Hired = Percentage70Above || KnowCoding  // OR
  println("Hired2: ${Hired}")
  
  var IsPrime = false
  println(!IsPrime)          // NOT

  
  
}
