// A function to calculate the area of a rectangle
fun area(length: Double, width: Double): Double {
    var A = length * width
    //println("Area: $A")
    return A // Return the value of A from the function
}

// A function to calculate the perimeter of a rectangle
fun perimeter(length: Double, width: Double): Double {
    var P = 2 * (length + width)
    //println("Perimeter: $P")
    return P // Return the value of P from the function
}


// A main function to test the code
fun main() {
    // Declare some variables for length and width
    val length = 10.0
    val width = 5.0
    val B: Double // Declare a variable for B
    val C: Double // Declare a variable for C

    // Call the area and perimeter functions and assign the return values to B and C
    B = area(length, width)
    C = perimeter(length, width)

    // Print the values of B and C
    println("B: $B")
    println("C: $C")
}
