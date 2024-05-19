fun main(){

    print("Enter a number: ")
    val n = readLine()!!.toInt()

    for(i in n downTo(1)){

        for (j in 1 .. n - i)
          print(" ")
        
        for (k in i .. (2*i-1)) 
          print("*") 
          
        println()  
    }
}

//   $$$$       for input 4
//    $$$
//     $$
//      $