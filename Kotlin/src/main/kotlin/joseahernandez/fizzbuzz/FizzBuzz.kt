package joseahernandez.fizzbuzz

class FizzBuzz {
    fun fizzBuzz(number: Int): String {
        var result = ""
        if (isFizz(number)) result = "Fizz"
        if (isBuzz(number)) result += "Buzz"

        if (!isFizz(number) && !isBuzz(number)) result = number.toString()

        return result
    }

    private fun isFizz(number: Int) = number % 3 == 0

    private fun isBuzz(number: Int) = number % 5 == 0
}

fun main(args: Array<String>) {
    val fizzBuzz = FizzBuzz()

    for ( i in 1..100) {
        println(fizzBuzz.fizzBuzz(i))
    }
}