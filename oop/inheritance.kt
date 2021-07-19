package oop

fun main(args: Array<String>) {
    var kid1 = child("Junior",13)
    println(kid1.name)
    kid1.wash()
    kid1.cry()
    kid1.cook()
}

open class parent(open var name:String,open var age:Int) {
    fun cook() {
        println("Cooking!Check!")
    }
    fun wash() {
        println("Washing!Check!")
    }
}

class child(override var name: String, override var age: Int):parent(name,age) {
    fun cry() {
        println("Crying!Check and check!")
    }
}