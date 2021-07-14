import java.util.*

fun main(args: Array<String>) {
    var pickFromUser = Scanner(System.`in`)
    println("How many employees do you have?")
    var employeesNum = pickFromUser.nextInt()
    var employees = arrayOfNulls<String>(employeesNum)
    var salary = arrayOfNulls<Double>(employeesNum)
    println("Enter the $employeesNum employees")
    //loop to receive the names and salaries of the employees
    var i = 0
    while (i<employeesNum) {
        employees[i] = pickFromUser.next()
        println("Enter " +employees[i]+ "'s salary")
        salary[i] = pickFromUser.nextDouble()
        i++
    }
    //loop to print employee names and salaries
    var u = 0
    while (u<employeesNum) {
        println(employees[u]+ "----------Ksh " +salary[u])
        u++
    }
}