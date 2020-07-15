package com.parchment.fizzbuzz;

public class FizzBuzz {

    public String row(int rowNumber) {

        //TODO a lot of conditionals
//        if( rowNumber %3 == 0 && rowNumber %5 )
        if (rowNumber % 3 == 0) {
            return "Fizz";
        } else if (rowNumber % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(rowNumber);
        }

    }
}
