package oop

fun main(args: Array<String>) {
    var teacherOne = sensei("Joey",27)
    println(teacherOne.name)
    teacherOne.read()
}
//forces any object inheriting the abstract class have all the properties in the abstract class
abstract class student(open var name:String, open var age:Int){
    abstract fun read()
    abstract fun write()
}

class sensei(override var name: String, override var age: Int):student(name,age){
    override fun read() {
        println("Am a teacher and I can read")
    }
    override fun write() {
        println("Am a teacher and I can write")
    }
}