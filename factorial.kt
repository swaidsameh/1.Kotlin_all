import java.util.*

fun main() {
    val read = Scanner(System.`in`)
    print("Enter a number: ")
    val a = read.nextInt()
    var fact = 1
    for (i in a downTo 1) //automatically reduces value of i by one in every loop
    {
        fact *= i
    }
    println("Factorial of $a is : $fact")
}