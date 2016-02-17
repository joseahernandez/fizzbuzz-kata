package joseahernandez.fizzbuzz;

public class FizzBuzz {
    public static void main(String []args) {
        for (int i = 0; i <= 100; i++) {
            System.out.println(fizzBuzz(i));
        }
    }

    public static String fizzBuzz(int number) {
        String result = "";
        if (isFizz(number))
            result += "Fizz";
        if (isBuzz(number))
            result += "Buzz";

        if (!isFizz(number) && !isBuzz(number))
            result = String.valueOf(number);

        return result;
    }

    private static boolean isFizz(int number) {
        return multipleOfThree(number);
    }

    private static boolean isBuzz(int number) {
        return multipleOfFive(number);
    }

    private static boolean multipleOfThree(int number) {
        return number % 3 == 0;
    }

    private static boolean multipleOfFive(int number) {
        return number % 5 == 0;
    }
}
