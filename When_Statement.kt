fun main(){

    println("Enter 1 for addition, 2 for subtraction, 3 for multiplication and 4 for division")
    print("Enter your choice here: ")
    var x = readLine()!!.toInt()
 
    print("Enter a number1: ")
    var num1 = readLine()!!.toInt()

    print("Enter a number2: ")
    var num2 = readLine()!!.toInt()
    
    when(x){
        1 -> print("${num1} + ${num2} = ${num1 + num2}")  // ${} inside a string is called as string templating
        2 -> print("${num1} - ${num2} = ${num1 - num2}")
        3 -> print("${num1} * ${num2} = ${num1 * num2}")
        4 -> print("${num1} / ${num2} = ${num1 / num2}")
        else -> print("Enter a proper value (1-4) \n")
    }
}