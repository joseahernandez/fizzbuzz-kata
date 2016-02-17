package joseahernandez.fizzbuzz

import org.junit.Test
import kotlin.test.assertEquals

class FizzBuzzTest {
    private val fizzBuzz: FizzBuzz = FizzBuzz()

    @Test
    fun fizzBuzzReturnTheNumberPassedAsArgument() {
        val number = 1
        val result = fizzBuzz.fizzBuzz(number)

        assertEquals(number.toString(), result)
    }

    @Test
    fun multiplesOfThreeReturnFizz() {
        val number = 3
        val result = fizzBuzz.fizzBuzz(number)

        assertEquals("Fizz", result)
    }

    @Test
    fun multiplesOfFiveReturnBuzz() {
        val number = 5
        val result = fizzBuzz.fizzBuzz(number)

        assertEquals("Buzz", result)
    }

    @Test
    fun multiplesOfThreeAndFiveReturnFizzBuzz() {
        val number = 15
        val result = fizzBuzz.fizzBuzz(number)

        assertEquals("FizzBuzz", result)
    }
}
