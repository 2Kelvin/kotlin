fun main(args: Array<String>) {
    var k:Int
    k = 120
    var j = if (k < 11) {
        "k is less than "
    }else {
        "k is greater than or equal to 10"
    }
    println(j)

    var marks = 64
    var grade = if (marks < 40) {
        "E"
    }else if (marks < 50) {
        "D"
    }else if (marks < 60) {
        "C"
    }else if (marks < 70) {
        "B"
    }else {
        "A"
    }
    println(grade)

    var guessedNumber = 0
    var result = when(guessedNumber) {
        1 -> "Oops!!!You lost!"
        2 -> "Oops!!!You lost!"
        3 -> "Congrats!!!You won!"
        4 -> "Oops!!!You lost!"
        else -> "Please enter any number from 1 to 4"
    }
    println(result)
}