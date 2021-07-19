package oop

fun main(args: Array<String>) {
    //Creating an object from the class
    var veh1:Car
    veh1 = Car()
    println(veh1.color)

    var veh2 = Car()
    println(veh2.manufacturer)

    veh1.accelerate()
    veh2.brake()

    var stud1 = Student("Hai","hai22@gmail.com","Female",4022,22)
    println(stud1.admNo)
    stud1.displayDetails()
}

class Car {
    var color = "Yellow"
    var wheels = 24
    var driveType = "Left"
    var manufacturer = "Mercedes"
    fun accelerate() {
        println("I can accelerate!")
    }
    fun brake() {
        println("I can brake!")
    }
}

class Student(name:String, email:String, gender:String, admNo:Int, age:Int) {
    //Properties
    var name:String
    var email:String
    var gender:String
    var admNo:Int
    var age:Int

    //this is the constructor
    init {
        this.name = name
        this.email = email
        this.gender = gender
        this.admNo = admNo
        this.age = age
    }
    fun displayDetails() {
        println("Hello $name, your email is $email, your gender is $gender," +
                " your admission is $admNo and your age is $age")
    }
}