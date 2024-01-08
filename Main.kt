import java.util.*

fun Long() {
    //range -32768 -- 32767
    val a:Long= -9242121244511245
    val b= Long.MAX_VALUE
    val c= Long.MIN_VALUE
    val x= c - b
    println("This a short value $a")
    println("This minimum short value $b")
    println(x)
    println("This maximum short value ${Long.MAX_VALUE}")
    println("This minimum short value $c K")
    println(Long.MIN_VALUE)
    println()
}

fun TimeCom() {
    var time = 15
    var greeting = if (time < 18) "Good day." else "Good evening."
    println(greeting)
    time = 25
    greeting = if (time < 18) "Good day." else "Good evening."
    println(greeting)
    println()
}

fun Short() {
    //range -32768 -- 32767
    val a:Short= -11245
    val b= Short.MAX_VALUE
    val c= Short.MIN_VALUE
    println("This a short value $a")
    println("This minimum short value $b")
    println("This maximum short value ${Short.MAX_VALUE}")
    println("This minimum short value $c K")
    println(Short.MIN_VALUE)
    println()
}

fun PrintHello(){
    val read = Scanner(System.`in`)

    print("Enter an Integer: ")
    val x = read.nextInt()

    if (x==1)
    {
        println("Hello World!1")
    }
    else if (x==2)
    {
        println("Hello World!2")
    }
    else if (x==3)
    {
        println("Hello World!3")
    }
    else {
        println("")
        println("Hello World!4")
        println("Hello World!5")
        println("Hello World!6")
        println("Hello World!7")
        println("Hello World!8")
    }
    println()
}

fun Sum(){
    val a = 10 //val a: Int = 10
    val b = 20 //val b: Int = 10
    val materials = "ABACUS"

    val c: Int = a+b
    println("Sum= $c")
    println(materials +" "+ materials)//Concatanation
    println()
}
fun Byte(){
    val num1:Byte=125
    val num2:Byte=-125
    val num3="Amar nam Razu"

    println("$num1 \n--> $num2 \n\t-->> $num3")

    println(Byte.MAX_VALUE)
    println(Byte.MIN_VALUE)
    println()
}

fun Sum1(){
    var a= 5
    a += a
    println(a)
    a++
    println(a)
    a+10
    println(a)
    println()
}

fun Float(){
    val num1:Float = 10.123456f
    val num2:Float = 222.431f
    val sum1 = num1+num2
    println(sum1)

    val num3:Double = 10.12345678910123
    val num4:Double = 222.431
    val sum2 = num3+num4
    println(sum2)
    println()
}
fun Character(){
    val charecter:Char = 'A'
    println(charecter)
    println()
}

fun BooleanOperator(){
    val isMarried:Boolean = true
    val haveChild:Boolean = false
    println("She is married = $isMarried")
    println("she has a child = $haveChild")
    println()
}
fun String(){
    var ch = charArrayOf('a', 'b', 'c')
    var name: String = "Miraz"
    println(name)

     ch = charArrayOf('a', 'b', 'c')
     name = "Miraz ABCD"
    println(name)
    println()
}
fun ArithmeticOperator(){
    //Double data type nile obossoi value te dosomik thakte hobe
    val num1:Double = 100.0
    val num2:Double = 200.0
//    addition
    val add = num1 + num2
    println("addition ${add}")
//    subtraction
    val sub = num1 - num2
    println("subtraction ${sub}")
//    multiplication
    val mul = num1 * num2
    println("multiplication ${mul}")
//    division
//    val num3 = 100.5
//    val num4 = 200.5
//    val div = num3 / num4
    val div = num1 / num2
    println("division ${div}")
//    modulus
    val mod = num1 % num2
    println("modulus ${mod}")
    println()
}

fun AssignmentOperator(){
    var a:Double
    var b:Double

//    a += b --> a = a+b
    a = 100.0
    b = 200.0
    print("a=${a} | b=${b} ")
    a += b
    println("[a += b --> a = a+b] : ${a}")

//    a -= b --> a = a-b
    a = 100.0
    b = 200.0
    print("a=${a} | b=${b} ")
    a -= b
    println("[a -= b --> a = a-b] : ${a}")

//    a *= b --> a = a*b
    a = 100.0
    b = 200.0
    print("a=${a} | b=${b} ")
    a *= b
    println("[a *= b --> a = a*b] : ${a}")

//    a /= b --> a = a/b
    a = 100.0
    b = 200.0
    print("a=${a} | b=${b} ")
    a /= b
    println("[a /= b --> a = a/b] : ${a}")

//    a %= b --> a = a%b
    a = 100.0
    b = 200.0
    print("a=${a} | b=${b} ")
    a %= b
    println("[a %= b --> a = a%b] : ${a}")
    println()
}

fun UnaryOperator(){
    var a = 2

//    positiv
    println(+a)

//    negative
    println(-a)

//    not
    val b = true
    println(!b)

//    pre increment
    a = 5
    print("pre increment  ")
    println(++a)

//    pre decrement
    a = 5
    print("pre decrement  ")
    println(--a)

//    post increment
    a = 5
    print("post increment  ")
    print(a++)
    print("  ")
    println(a)
//    post decrement
    a = 5
    print("post decrement  ")
    print(a--)
    print("  ")
    println(a)

    println()

}

fun ComparisonOperator(){
    val a = 10
    val b = 20
    println("a=$a , b=$b")
//    1. > greater then
    print("a>b :  ")
    println(a>b)
//    2. < less then
    print("a<b :  ")
    println(a<b)
//    3. >= greater then or equal
    print("a>=b :  ")
    println(a>=b)
//    4. <= less then or equal
    print("a<=b :  ")
    println(a<=b)
//    5. == equal
    print("a==b :  ")
    println(a==b)
//    6. != not equal
    print("a!=b :  ")
    println(a!=b)
    println()
}

fun LogicalOperator(){
    val a = 10
    val b = 20
    println("a=$a , b=$b")
//    || (OR)
    print("a>b OR a<b : ")
    println(a>b || a<b)
//    && (AND)
    print("a>b AND a<b : ")
    println(a>b && a<b)
    println()
}

fun main(args: Array<String>) {
    /*multi line comment*/
    //Single line comment

//    LogicalOperator()
//    ComparisonOperator()
//    UnaryOperator()
//    AssignmentOperator()
//    ArithmeticOperator()
//    String()
//    Character()
//    BooleanOperator()

//    Float()
//    Sum1()
//    Long()
    TimeCom()
//    Short()
//    Sum()
//    Sum1()
//    Byte()
//    PrintHello()

//    println("\n\nProgram arguments: ${args.joinToString()}")
}