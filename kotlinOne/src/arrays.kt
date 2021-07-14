fun main(args: Array<String>) {
    var names = arrayOf("Mi","Zo","Su","Ky","Vue","Ey","Nae","Ling")

    //printing an array object at a specific index
    println(names[3])

    //Iterating through the array with a for loop
    for (selName in names) {
        println(selName)
    }

    //printing an array length
    println(names.size)

    //Iterating through the array with a while loop
    var arrSize = names.size
    var x =0
    while (x < arrSize) {
        println(names[x])
        x++
    }

    //Creating an array that can only hold strings
    var cars = arrayOfNulls<String>(6)
    cars[0] = "BMW"
    cars[1] = "Tesla"
    cars[2] = "Ford"
    cars[3] = "VW"
    cars[4] = "Range"
    cars[5] = "Mercedes"
    for (vehicle in cars) {
        println(vehicle)
    }
}