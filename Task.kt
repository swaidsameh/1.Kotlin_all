
//import java.util.*
//fun main(args: Array<String>) {
//
//    val read = Scanner(System.`in`)
//    print("Enter an integer number A : ")
//    var a = read.nextInt()
//    print("Enter a integer number B : ")
//    var b = read.nextInt()
//    print("Enter a integer number C : ")
//    var c = read.nextInt()
//
//
//    if (a==b && a>c) {
//        println("A and B are equal And Greater than C")
//    } else if (a==c && a>b) {
//        println("A and C are equal and Greater than B")
//    } else if (b==c && c>a) {
//        println("B and C are equal and Greater than A")
//    } else if(a>b && a>c) {
//        println("A is greater")
//    } else if(b>c && b>a) {
//        println("B is greater")
//    } else if(c>a && c>b) {
//        println("C is greater")
//    } else
//        println("A, B, C are equal")
//}



import java.util.*
fun main() {

    val scanner = Scanner(System.`in`)
    print("Enter the number of Subjects: ")
    val n = scanner.nextInt()
    var sum = 0.0
    val average: Double
    var terminated = false
    val gp: Double
    val grade:String

    for (i in 1..n) {
        print("Enter the mark $i-th subject : ")
        val input = scanner.nextDouble()
        if (input>100){
            println("Input is more than 100, terminating the program.")
            terminated = true
            break
        }
        else{
            sum += input
        }
    }

    if (!terminated) {
        average = sum / n
        println("The average of the $n inputs is $average")
        println("Total number is : $sum")
        println("The average of $n subjects is $average")
        when (average) {
            in 80.0..100.0 -> {
                gp = 4.00
                grade = "A+"
                println("Grade Point is : $gp\n Grade is : $grade")
            }
            in 75.0..79.0 -> {
                gp = 3.75
                grade = "A"
                println("Grade Point is : $gp\n Grade is : $grade")
            }
            in 70.0..74.0 -> {
                gp = 3.50
                grade = "A-"
                println("Grade Point is : $gp\n Grade is : $grade")
            }
            in 65.0..69.0 -> {
                gp = 3.25
                grade = "B+"
                println("Grade Point is : $gp\n Grade is : $grade")
            }
            in 60.0..64.0 -> {
                gp = 3.00
                grade = "B"
                println("Grade Point is : $gp\n Grade is : $grade")
            }
            in 55.0..59.0 -> {
                gp = 2.75
                grade = "B-"
                println("Grade Point is : $gp\n Grade is : $grade")
            }
            in 50.0..54.0 -> {
                gp = 2.50
                grade = "C+"
                println("Grade Point is : $gp\n Grade is : $grade")
            }
            in 45.0..49.0 -> {
                gp = 2.25
                grade = "C"
                println("Grade Point is : $gp\n Grade is : $grade")
            }
            in 40.0..44.0 -> {
                gp = 2.00
                grade = "D"
                println("Grade Point is : $gp\n Grade is : $grade")
            }
            in 0.0..39.0 -> {
                gp = 0.00
                grade = "F"
                println("Grade Point is : $gp\n Grade is : $grade")
            }
            else -> {
                println("Invalid Input")
            }
        }
    }
}