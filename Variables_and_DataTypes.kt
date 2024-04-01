fun main(){
    // Type inference:- Kotlin has this feature that automatically tells it what type of variable it is on declaration by var or val
    println("Variables: ")
    var age = 10 // var can be reassigned
    println(age);

    age = 25
    // age = 12.4 //* Not allowed, this is called type checking
    println(age);

    val pi = 3.142 // val can't be reassigned
    println(pi);

    // pi = 12.3; //! error
    
    var Score : Int = 12 // explicitly defining the datatype of variable
    println(Score)

    println()
    // Data Types
    println("Data Types: ")
    var num1 : Float = 7.14f  // f or F is used for float
    var num2 : Double = 0.000006
    var isPrime : Boolean = false;
    var Name : String = "Luffy"

    println(num1)
    println(num2)
    println(isPrime)
    println(Name)

    println()

    // Scientific numbers:
    println("Scientific Numbers: ")
    val myNum1 : Float = 35e3f       // 35 x 10^3
    val myNum2 : Double = 12E4       // 12 x 10^4
    val myNum3 : Double = 12e-4      // 12 x 10^-4
    val myNum4 : Float  = 11E-5f     // 11 x 10^-5

    println(myNum1)
    println(myNum2)
    println(myNum3)
    println(myNum4)

}