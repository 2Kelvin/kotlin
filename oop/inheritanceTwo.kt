package oop

fun main(args: Array<String>) {
    var trial1 = normUser("mei@gmail.com","klk9889")
    trial1.login()
    trial1.accessPortal()
}

open class normUser(open var email:String, open var password:String) {
    fun login(){
        println("Logging in...")
    }
    fun accessPortal(){
        println("Accessing the student portal...")
    }
}

class admin(override var email: String, override var password: String):normUser(email,password) {
    fun addUser(){
        println("Adding users...")
    }
    fun sus(){
        println("Suspending students...")
    }
}
