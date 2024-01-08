import java.util.*

fun main(args: Array<String>) {
//    print("Enter your name: ")
//    var name:String = readLine()!!
//    println("My name is: ${ name }")
//
//    print("Enter an integer number: ")
//    var num1: Int = readLine()!!.toInt()
//    print("Enter an integer number: ")
//    var num2: Int = readLine()!!.toInt()
//    println("Your numbers are: ${ num1 } and ${ num2 }")
//    var sum : Int = num1 + num2
//    println("Your sum is: ${ sum }")

    UserInput_JavaPack()
}


fun UserInput_JavaPack(){
    //print("Enter Anything: ")
    val read = Scanner(System.`in`)

    print("Enter an Integer: ")
    val x = read.nextInt()

    print("Enter a String: ")
    val y = read.next()

    println(x)
    println(y)

}
