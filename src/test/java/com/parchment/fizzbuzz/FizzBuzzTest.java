package com.parchment.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void row_when_1_return_1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("1", fizzBuzz.row(1));
    }

    @Test
    public void row_when_2_return_2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("2", fizzBuzz.row(2));
    }

    @Test
    public void row_when_3_return_Fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("Fizz", fizzBuzz.row(3));
    }

    @Test
    public void row_when_5_return_Buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("Buzz", fizzBuzz.row(5));
    }

    @Test
    public void row_when_6_return_Fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("Fizz", fizzBuzz.row(6));
    }

    @Test
    public void row_when_10_return_Buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("Buzz", fizzBuzz.row(10));
    }

    @Test
    public void row_when_15_return_FizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("FizzBuzz", fizzBuzz.row(15));
    }
}
