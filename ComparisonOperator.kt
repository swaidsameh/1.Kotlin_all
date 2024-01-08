fun main() {
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
    println("\n")

    TimeCompare()
}

fun TimeCompare() {
    var time = 15
    var greeting = if (time < 18) "Good day." else "Good evening."
    println(greeting)
    time = 25
    greeting = if (time < 18) "Good day." else "Good evening."
    println(greeting)
    println()
}