
import java.util.*

fun main(args: Array<String>) {

    val read = Scanner(System.`in`)

    val a = read.nextInt()
    val b = read.nextInt()
    val c = read.nextInt()

    val r1 = a+b*c
    val r2 = a*(b+c)
    val r3 = a*b*c
    val r4 = (a+b)*c

    if (r1 > r2 && r1 > r3 && r1 > r4){
        println(r1)
    }
    else if (r2 > r1 && r2 > r3 && r2 > r4){
        println(r2)
    }
    else if (r3 > r1 && r3 > r2 && r3 > r4){
        println(r3)
    }
    else{
        println(r4)
    }
}