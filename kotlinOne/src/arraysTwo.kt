import java.util.*

fun main(args: Array<String>) {
    var myScanner = Scanner(System.`in`)
    println("How many friends do you have?")
    var number = myScanner.nextInt()
    println("Enter the $number names")
    var friends = arrayOfNulls<String>(number)
    //a loop that receives all the friends names
    var i = 0
    while (i<number) {
        friends[i] = myScanner.next()
        i++
    }
    //a loop printing the names of the friends
    for (friendsNames in friends) {
        println(friendsNames)
    }
}