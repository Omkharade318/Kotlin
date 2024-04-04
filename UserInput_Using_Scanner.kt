import java.util.Scanner;

fun main(){
    
    var user = Scanner(System.`in`)
    println("Enter an Integer: ") 
    var num1 = user.nextInt()
    println("The entered integer is: ${num1}")

    var user2 = Scanner(System.`in`)
    println("Enter a Float: ")
    var num2 = user2.nextFloat()
    println("The entered Float is: ${num2}")

    var user3 = Scanner(System.`in`)
    println("Enter a String: ")
    var str = user3.nextLine()
    println("The entered String is: ${str}")
}