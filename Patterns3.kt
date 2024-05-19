fun main(){

    print("Enter a Number: ")
    val n = readLine()!!.toInt()

    for(i in 1..n){
        for (j in n downTo(i))
        print("$")

    println()    
    }

    // for (i in 1 .. n){
    //     for (j in i .. n)
    //     print("$")

    //     println()
    // }
}

// $$$$     for input 4
// $$$
// $$
// $