fun main()
{
    print("Enter a number: ")
    val n = readLine()!!.toInt()

    for (i in 1 .. n){

        for (j in i .. n)
        print(" ")

        for (k in 1 .. i)
        print("$")

        for (l in 1 .. i-1)
        print("$")

        println()
    }
      
}


//     $          for input 4
//    $$$
//   $$$$$
//  $$$$$$$