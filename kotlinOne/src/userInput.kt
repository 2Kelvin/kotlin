import java.util.*

fun main(args: Array<String>) {
    //Calculating the BMI
    var pick = Scanner(System.`in`)
    println("Enter your name")
    var name = pick.next()

    println("Enter your weight")
    var weight = pick.nextDouble()

    println("Enter your height")
    var heig = pick.nextDouble()

    var bmi = weight/Math.pow(heig,2.0)
    println("Hello $name, your BMI is $bmi")

    //Calculating the volume of a cylinder
    var hold = Scanner(System.`in`)
    println("Enter the radius of the cylinder")
    var radius = hold.nextDouble()

    println("Enter the height of the cylinder")
    var height = hold.nextDouble()

    var volume = 22/7 * (Math.pow(radius,2.0)) * height
    println("The volume of the cylinder is $volume")
}