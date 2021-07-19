package oop

import java.util.*

fun main() {
    //Getting input from the user through the scanner
    var scanner = Scanner(System.`in`)
    println("How many employees do you have?")

    var name = scanner.next()
    println("Hi there, please enter your name")
    var role = scanner.next()
    println("Enter your job position")
    var gender = scanner.next()
    println("Enter your gender")
    var salary = scanner.nextDouble()
    println("Enter your salary")
    var age = scanner.nextInt()
    println("Enter your age")
    var phoneNo = scanner.nextInt()
    println("Enter your phone number")
}

class Employees(name:String, role:String, gender:String, salary:Double, age:Int,phoneNo:Int) {
    //Properties
    var name:String
    var role:String
    var gender:String
    var salary:Double
    var age:Int
    var phoneNo:Int
    //this is the constructor
    init {
        this.name = name
        this.role = role
        this.gender = gender
        this.salary = salary
        this.age = age
        this.phoneNo = phoneNo


    }
    fun displayDetails() {
        println("Hi $name, your job position is $role, your gender is $gender," +
                " your salary is Ksh $salary, your age is $age" +
                " and your phone number is $phoneNo")
    }
}