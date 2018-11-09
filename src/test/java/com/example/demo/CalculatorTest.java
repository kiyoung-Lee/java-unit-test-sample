package com.example.demo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void sum_test() {
        int result = calculator.sum(2,3);
        Assert.assertEquals(5, result);
    }
}