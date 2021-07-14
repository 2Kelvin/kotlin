import java.util.*

fun main(args: Array<String>) {
    kawhi()

    myAverage(45, 129.4, 89.83f)

    var scanner = Scanner(System.`in`)

    println("Enter the principle")
    var principle = scanner.nextDouble()

    println("Enter the rate")
    var rate = scanner.nextDouble()

    println("Enter the time")
    var time = scanner.nextDouble()

    simInterest(principle,rate,time)
}

fun kawhi() {
    println("What it do baaaabbyyyy!!")
}

fun myAverage(x:Int, y:Double, z:Float) {
    var average = (x+y+z)/3.0
    println("Your answer is $average")
}

fun simInterest(p:Double, r:Double, t:Double) {
    var simpleInterest = (p*r*t)/100.0
    if (simpleInterest <= 10000) {
        println("Get the loan. Your interest will be $simpleInterest")
    } else {
        println("The loan is too expensive")
    }
}