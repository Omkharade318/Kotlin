fun main() {

    var arr = arrayOf(1,2,3);
    var arr2 = arrayOf("Hello","World")
    
    for(i in arr)
      println(i) 

    println()
      
    for(i in arr)
      println(arr[i-1])  // can be written like this too // * we can also use arr.get(i-1)

    println()

    for(i in arr2)
      println(i)

      println()

  println("Array elements with its index: ")      
    var arr3 = arrayOf<Int>(2,4,6,8)  // Explicitly declaring array

    for ((i,e) in arr3.withIndex())  // i is the index and e is the number/element associated to that index
      println("${i} - ${e}")

    println()

 println("Changing elements in array: ")
    var arr4 = arrayOf("Sun","Moon","Earth")

    for(i in arr4)
      println(i)

    println()

    arr4.set(2,"Jupiter")  

    for(i in arr4)
      println(i)
}