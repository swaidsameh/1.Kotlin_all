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
        if(average in 80.0..100.0){
            gp = 4.00
            grade = "A+"
            println("Grade Point is : $gp\n Grade is : $grade")
        }
        else if(average in 75.0..79.0){
            gp = 3.75
            grade = "A"
            println("Grade Point is : $gp\n Grade is : $grade")
        }
        else if(average in 70.0..74.0){
            gp = 3.50
            grade = "A-"
            println("Grade Point is : $gp\n Grade is : $grade")
        }
        else if(average in 65.0..69.0){
            gp = 3.25
            grade = "B+"
            println("Grade Point is : $gp\n Grade is : $grade")
        }
        else if(average in 60.0..64.0){
            gp = 3.00
            grade = "B"
            println("Grade Point is : $gp\n Grade is : $grade")
        }
        else if(average in 55.0..59.0){
            gp = 2.75
            grade = "B-"
            println("Grade Point is : $gp\n Grade is : $grade")
        }
        else if(average in 50.0..54.0){
            gp = 2.50
            grade = "C+"
            println("Grade Point is : $gp\n Grade is : $grade")
        }
        else if(average in 45.0..49.0){
            gp = 2.25
            grade = "C"
            println("Grade Point is : $gp\n Grade is : $grade")
        }
        else if(average in 40.0..44.0){
            gp = 2.00
            grade = "D"
            println("Grade Point is : $gp\n Grade is : $grade")
        }
        else if(average in 0.0..39.0){
            gp = 0.00
            grade = "F"
            println("Grade Point is : $gp\n Grade is : $grade")
        }
        else{
            println("Invalid Input")
        }
    }
}