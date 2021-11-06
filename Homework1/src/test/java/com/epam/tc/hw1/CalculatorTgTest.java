package com.epam.tc.hw1;

import static org.testng.AssertJUnit.assertEquals;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorTgTest extends Calculator {

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
    public void tgDoubleTest1() {
        double actual = calculator.tg(0.62);
        assertEquals(actual, 0.713909006659240);
    }

    @Test
    public void tgDoubleTest2() {
        double actual = calculator.tg(19.45);
        assertEquals(actual, 0.684788932859874);
    }

    @Test
    public void tgDoubleTest3() {
        double actual = calculator.tg(-2.0);
        assertEquals(actual, -2.185039863261520);
    }

    @Test
    public void tgDoubleTest4() {
        double actual = calculator.tg(0.0);
        assertEquals(actual, 0.0);
    }
}
