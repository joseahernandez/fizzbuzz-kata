<?php

namespace joseahernandez\fizzbuzz;

class FizzBuzzTest extends \PHPUnit_Framework_TestCase
{
    private $fizzBuzz;

    protected function setUp()
    {
        $this->fizzBuzz = new FizzBuzz();
    }


    /**
     * @test
     */
    public function fizzBuzzReturnTheNumberPassedAsArgument()
    {
        $number = 1;
        $result = $this->fizzBuzz->fizzBuzz($number);

        $this->assertSame('1', $result);
    }

    /**
     * @test
     */
    public function multiplesOfThreeReturnFizz() {
        $number = 3;
        $result = $this->fizzBuzz->fizzBuzz($number);

        $this->assertSame('Fizz', $result);
    }

    /**
     * @test
     */
    public function multiplesOfFiveReturnBuzz() {
        $number = 5;
        $result = $this->fizzBuzz->fizzBuzz($number);

        $this->assertSame('Buzz', $result);
    }

    /**
     * @test
     */
    public function multiplesOfThreeAndFiveReturnFizzBuzz() {
        $number = 15;
        $result = $this->fizzBuzz->fizzBuzz($number);

        $this->assertSame('FizzBuzz', $result);
    }
}