package com.epam.tc.hw1;

import static org.testng.AssertJUnit.assertEquals;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorCosTest extends Calculator {

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
    public void cosDubleDoubleTest1() {
        double actual = calculator.cos(0.62);
        assertEquals(actual, 0.813878456662534);
    }

    @Test
    public void cosDubleDoubleTest2() {
        double actual = calculator.cos(19.45);
        assertEquals(actual, 0.825084787976750);
    }

    @Test
    public void cosDubleDoubleTest3() {
        double actual = calculator.cos(2.0);
        assertEquals(actual, -0.416146836547142);
    }

    @Test
    public void cosDubleDoubleTest4() {
        double actual = calculator.cos(0.0);
        assertEquals(actual, 1.0);
    }
}

