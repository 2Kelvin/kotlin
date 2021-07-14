fun main(args: Array<String>) {
    //While loop
    var x:Int = 0
    while (x < 5) {
        println(x)
        x++
    }

    //Do while loop
    var y:Int = 10
    do {
        println(y)
        y++
    } while (y < 15)

    //Repeat loop
    repeat(10) {
        println("Hello Rocketman")
    }

    //For loop
    var names = arrayOf("Jordan","Steph","Ball","Joel","KD")
    for (jina in names){
        println(jina)
    }

    var numbers = 1..10
    for (nambari in numbers) {
        println(nambari)
    }

    var num = 10 downTo 1
    for (ni in num) {
        println(ni)
    }
}