fun main(args: Array<String>) {
//    leap year if it is divisible by 4 and by 400 but not by 100 [i % 400 == 0 || i % 100 != 0 && i % 4 == 0]
    val year =2000..2050
    for(i in year step 2) // sep keyword jumps 2 steps
    {
        if(i % 400 == 0 || i % 100 != 0 && i % 4 == 0) {
            println("$i is a Leap Year")
        }else {
            println("$i is not a Leap Year")
        }
    }
    println("Program arguments: ${args.joinToString()}")
}
