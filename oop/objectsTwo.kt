package oop

import java.util.*

fun main(args: Array<String>) {
    var take = Scanner(System.`in`)
    println("How many users do you have?")
    var  userNo = take.nextInt()
    //Instantiate the array
    var users = arrayOfNulls<user>(userNo)
    println("Enter the $userNo users details")
    //loop to take the users details
    var i = 0
    while (i < userNo) {

        println("Enter user " +(i+1)+ " name")
        var name = take.next()
        println("Enter user " +(i+1)+ " email")
        var email = take.next()
        println("Enter user " +(i+1)+ " password")
        var password = take.next()

        users[i] = user(name,email,password)
        i++
    }
    //loop to display the users
    for (n in users) {
        if (n != null) {
            println(n.name + "---" + n.email + "---" + n.password + "---")
        }
    }
}

class user(name:String,email:String,password:String) {
    var name:String
    var email:String
    var password:String

    init {
        this.name = name
        this.email = email
        this.password = password
    }
}