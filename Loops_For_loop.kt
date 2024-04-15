fun main()
{
    println("Simple for loop: ")
    for (num in 1..10) {
        println(num)
    }
    println()

    println("for loop using step: ")
    for (num in 1..10 step 2)
     println(num)

    println()
    
    println("for loop with index property: ")
    val planets = arrayOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn")
    for (planet in planets.indices)
       println(planets[planet])

    println()
    
    println("for loop using library function: ")
    val Celestials = arrayOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn")
    for((index, value) in Celestials.withIndex())
    println("The planet at no. ${index + 1} is ${value}")
}