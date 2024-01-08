fun main(args: Array<String>) {
    fun3()
}

fun fun3(){
    print("Enter a integer number A : ")
    var a: Int = readLine()!!.toInt()
    print("Enter a integer number B : ")
    var b: Int = readLine()!!.toInt()
    print("Enter a integer number C : ")
    var c: Int = readLine()!!.toInt()

//    if(a>b && a>c)
//    {
//        println("A is greater")
//    }
    if (a==b && a>c)
    {
        println("A and B are equal And Greater than C")
    }
    else if (a==c && a>b)
    {
        println("A and C are equal and Greater than B")
    }
    else if (b==c && c>a)
    {
        println("B and C are equal and Greater than A")
    }
    else if(a>b && a>c)
    {
         println("A is greater")
    }
    else if(b>c && b>a){
        println("B is graeter")
    }
    else if(c>a && c>b)
    {
        println("C is graeter")
    }

//    else if(b>c) {
//        println("B is greater")
//    }
//    else if(c>b)
//    {
//        println("C is greater")
//    }
    else
        println("A, B, C are equal")
}

fun fun2(){
    val number:Int= 100

    if(number>=0){
        println("Positive numner")
    }
    else
        println("negative number")
}
fun fun1(){
    val a= 60

    if(a>40)
    {
        println("A is greater than 40")
    }
    else if(a>30)
    {
        println("A is greater than 30")
    }
    else if(a>20) {
        println("A is greater than 20")
    }
    else if(a>10)
    {
        println("A is greater than 10")
    }
    else
        println("A, B, C")
}