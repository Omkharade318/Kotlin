fun main(){

    println("Enter 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division")
    print("Enter Your Choice here: ")
    var choice = readLine()!!.toInt()
    
     var num1 : Float = 0f
     var num2 : Float = 0f

    if(choice in 1..4){
    print("Enter a number1: ")
     num1 = readLine()!!.toFloat()

    print("Enter a number2: ")
     num2 = readLine()!!.toFloat()
}

when(choice){
    1 -> println("${num1} + ${num2} = " + add(num1 , num2))
    2 -> println("${num1} - ${num2} = " + sub(num1 , num2))
    3 -> println("${num1} x ${num2} = " + mul(num1 , num2))
    4 -> println("${num1} / ${num2} = " + div(num1 , num2))
    else -> print("Enter a proper choice (1-4)")
    
    }
}

fun add (num1 : Float, num2 : Float) = num1 + num2
fun sub (num1 : Float, num2 : Float) = num1 - num2
fun mul (num1 : Float, num2 : Float) = num1 * num2
fun div (num1 : Float, num2 : Float) = num1 / num2