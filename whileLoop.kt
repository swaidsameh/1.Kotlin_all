import java.util.*

fun main(args: Array<String>){
    var i=1
    val read = Scanner(System.`in`)
//    var n = read.nextInt()
    var sum =0
    print("To sum 1 to N, Enter N:")
    var n = read.nextInt()
    while(i < n) {
        print("$sum + $i = ")
        sum+=i
        println(sum)
        //println("$sum + $i = $sum")
        i++
    }
//    println(i)
    print("Sum of 1 to $n is: ")
    println(sum)
}