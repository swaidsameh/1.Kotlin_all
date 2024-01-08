fun main() {
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