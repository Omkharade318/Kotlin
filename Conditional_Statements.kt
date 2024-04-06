fun main() {

    print("Enter Your Age: ")
    val age: Int = readLine()!!.toInt()

    val result =
            if (age > 18 && age < 120) "You can Drive"
            else if (age < 18 && age > 0) "You Cannot Drive" 
            else "Invalid Input"
            
    print(result)
}
