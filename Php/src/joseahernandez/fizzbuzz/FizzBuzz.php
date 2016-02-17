<?php

namespace joseahernandez\fizzbuzz;

class FizzBuzz
{
    public function fizzBuzz($number)
    {
        $result = '';
        if ($this->isFizz($number))
            $result = 'Fizz';
        if ($this->isBuzz($number))
            $result .= 'Buzz';

        if (!$this->isFizz($number) && !$this->isBuzz($number))
            $result = (string)$number;

        return $result;
    }

    private function isFizz($number)
    {
        return $number % 3 == 0;
    }

    private function isBuzz($number)
    {
        return $number % 5 == 0;
    }
}