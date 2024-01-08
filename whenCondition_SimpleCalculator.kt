import java.util.Scanner
//fun main(args: Array<String>)
fun main() {
    val read = Scanner(System.`in`)
    print("Enter a number: ")
    val a = read.nextDouble()
    print("Enter a number: ")
    val b = read.nextDouble()
    print("Enter an operator: ")
    val operator = read.next()
    val result: Any = when(operator){
        "+" -> {
            a+b
        }
        "-" -> {
            a-b
        }
        "*" -> {
            a*b
        }
        "/" -> {
            a/b
        }
        "%" -> {
            a%b
        }
        else -> {
            "$operator is not valid"
        }
    }
    println("$a $operator $b = $result")
}