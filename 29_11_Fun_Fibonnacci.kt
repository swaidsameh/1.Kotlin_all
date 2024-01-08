import java.util.*

fun main() {
    val read = Scanner(System.`in`)
    print("Enter a number: ")
    val term = read.nextInt()
 fibo(term)
}
fun fibo(term:Int){
    var n1 = 0
    var n2 = 1
    var count = 0
    while (count < term){
        print("$n1 ")
        val next = n1 + n2
        n1 = n2
        n2 = next
        count+=1
    }
}
