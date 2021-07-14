fun main(args: Array<String>) {
    println("Hello Rocketman. Welcome to Kotlin")
    //Variables
    var name:String
    var age:Int

    val firstName:String
    val airtime:Int

    name = "May"
    age = 8

    println("Hey $name, you are $age years old")

    firstName = "June"
    airtime = 5000
    //firstName = 8000 This is impossible, you cant change val

    println("Congratulations $firstName, you won $airtime Safaricom airtime.")
}
