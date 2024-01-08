import java.util.*

fun main() {
    val read = Scanner(System.`in`)
    print("Enter a number: ")
    val term = read.nextInt()
    leap(term)
}
fun leap(leap:Int){
    if(leap%4==0 && leap%100!=0 || leap %400 == 0){
        println("Leap year")
    }
    else{
        println("Not Leap Year")
    }
}