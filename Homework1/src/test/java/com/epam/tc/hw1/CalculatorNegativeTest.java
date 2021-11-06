package com.epam.tc.hw1;

import static org.testng.AssertJUnit.assertEquals;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorNegativeTest extends Calculator {

    protected Calculator calculator;

    @BeforeMethod
    public void setUp() {
        calculator = new Calculator();
    }

    @AfterMethod
    public void tearDown() {
        calculator = null;
    }

    @Test
    public void negativeLongLongTest1() {
        boolean actual = calculator.isNegative(-7057393437131528568L);
        assertEquals(actual, true);
    }

    @Test
    public void negativeLongLongTest2() {
        boolean actual = calculator.isNegative(7057393437131528568L);
        assertEquals(actual, false);
    }

    @Test
    public void negativeLongLongTest3() {
        boolean actual = calculator.isNegative(0L);
        assertEquals(actual, false);
    }
}

