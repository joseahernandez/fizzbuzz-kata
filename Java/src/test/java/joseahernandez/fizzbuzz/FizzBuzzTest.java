package joseahernandez.fizzbuzz;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void fizzBuzzReturnTheNumberPassedAsArgument() {
        int number = 1;
        String result = FizzBuzz.fizzBuzz(number);

        assertEquals(String.valueOf(number), result);
    }

    @Test
    public void multiplesOfThreeReturnFizz() {
        int number = 3;
        String result = FizzBuzz.fizzBuzz(number);

        assertEquals("Fizz", result);
    }

    @Test
    public void multiplesOfFiveReturnBuzz() {
        int number = 5;
        String result = FizzBuzz.fizzBuzz(number);

        assertEquals("Buzz", result);
    }

    @Test
    public void multiplesOfThreeAndFiveReturnFizzBuzz() {
        int number = 15;
        String result = FizzBuzz.fizzBuzz(number);

        assertEquals("FizzBuzz", result);
    }
}
