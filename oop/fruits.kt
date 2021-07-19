package oop

fun main(args: Array<String>) {
    var know = fruits("red","0.2kg")
    know.allowsBoiling()
    know.eatenRaw()
    know.blend()
}

open class fruits(open var color:String,open var weight:String) {
    fun allowsBoiling(){
        println("Can be boiled!")
    }
    fun eatenRaw(){
        println("Can be eaten raw!")
    }
    fun blend(){
        println("Can be blended!")
    }
}

class prod(override var color: String, override var weight: String):fruits(color,weight){

}