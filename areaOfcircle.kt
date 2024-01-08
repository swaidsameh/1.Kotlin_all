import java.util.*

fun main(args: Array<String>){
    val read = Scanner(System.`in`)
    val pi = 3.14159
    val R = read.nextDouble()
    val A = pi*R*R
    println("A=%.4f".format(A))
}