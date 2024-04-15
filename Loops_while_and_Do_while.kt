fun main()
{
    print("Enter the value you want factorial of: ")
    var user = readLine()!!.toInt()

    var factorial = 1
    do{
        factorial *= user
        user--
    }
    while(user > 0)

    print("The factorial = ${factorial}")
}