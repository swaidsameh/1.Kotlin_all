import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter a year: ")
    val year = scanner.nextInt()
//    2000, 2004, 2008, 2012, 2016, 2020, 2024, 2028, 2032, 2036, 2040, 2044, and 2048
    if (year % 400 == 0 || year % 100 == 0 || year % 4 == 0) {
        println("$year is a leap year.")
    } else {
        println("$year is not a leap year.")
    }
}
