import java.util.*

fun main(){

    val read = Scanner(System.`in`)
    print("To print even numbers 1 to N, Enter N:")
    val n = read.nextInt()
    for (i in 1..n){
        if (i%2==0){
            print("$i ")
        }
    }
}