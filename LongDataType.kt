fun main() {
    //range -32768 -- 32767
    val a:Long= -9242121244511245
    val b= Long.MAX_VALUE
    val c= Long.MIN_VALUE
    val x: Long = b - c
    println("This a short value $a")
    println("This minimum short value $b")
    println(x)
    println("This maximum short value ${Long.MAX_VALUE}")
    println("This minimum short value $c K")
    println(Long.MIN_VALUE)
    println()
}