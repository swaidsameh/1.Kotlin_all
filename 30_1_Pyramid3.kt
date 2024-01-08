fun main(args: Array<String>) {

    rep()

}
fun rep(){
    var n = 10
    repeat(n){
        println("Hello world")

    }
}
fun pyr4(){
        val n =7
    for (i in 1..n) {
        repeat(i - 1) {
            print(" * ")
        }
        repeat(n - i + 1) {
            print(" ")
        }
        println()
    }
}
fun pyr3(){
    val num =7
        for (i in 1..num ){
//        for (i in 1..num step (2)){
            for (j in num downTo i){
                print(" ")
            }
            for (k in 1..i){
//                print(" *")
                if (i % 2 != 0)
                {
                    print(" *")
                }
            }
            println("")
        }
}

fun pyr2() {
    val num = 7
    for (i in 1..num step (2)) {
        for (j in num downTo i) {
            print(" ")
        }
        for (k in 1..i) {
            print(" *")
        }
        println("")
    }
        println("")


    for (i in num  downTo 1 step 2) {
        for (j in num downTo i) {
            print(" ")
        }
        for (k in 1..i) {
            print(" *")
        }
        println("")
    }
}


fun pyr1() {
    val num = 7
    for (i in 1..num) {
        if (i % 2 == 0) {
            continue
        }
        for (j in num downTo i) {
            print(" ")
        }
        for (k in 1..i) {
            print(" *")
        }
        println("")
    }
}
