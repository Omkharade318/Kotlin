fun main(){

    print("Enter a number: ")
    val n = readLine()!!.toInt()
    
    for (i in 0 until(n)){   

        for (j in i until(n-1))
           print(" ")
      
        for (k in 0 until(i+1))   
           print("$")
        println()   
    }


}

//       $      for input 4
//      $$
//     $$$
//    $$$$
