package com.epam.tc.hw1;

import static org.testng.AssertJUnit.assertEquals;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorPowTest extends Calculator {

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
    public void powDubleDoubleTest1() {
        double actual = calculator.pow(0.62, 0.5);
        assertEquals(actual, 1.0);
    }

    @Test
    public void powDubleDoubleTest2() {
        double actual = calculator.pow(19.45, 6.38);
        assertEquals(actual, 5.413992302576813E7);
    }

    @Test
    public void powDubleDoubleTest3() {
        double actual = calculator.pow(2.0, 3.0);
        assertEquals(actual, 8.0);
    }

    @Test
    public void powDubleDoubleTest4() {
        double actual = calculator.pow(28105.62, 0.0);
        assertEquals(actual, 1.0);
    }
}
