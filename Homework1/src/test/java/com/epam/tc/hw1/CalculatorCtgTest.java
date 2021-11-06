package com.epam.tc.hw1;

import static org.testng.AssertJUnit.assertEquals;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorCtgTest extends Calculator {

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
    public void ctgDoubleTest1() {
        double actual = calculator.ctg(0.62);
        assertEquals(actual, 1.400738736550660);
    }

    @Test
    public void ctgDoubleTest2() {
        double actual = calculator.ctg(19.45);
        assertEquals(actual, 0.460303973990520);
    }

    @Test
    public void ctgDoubleTest3() {
        double actual = calculator.ctg(-2.0);
        assertEquals(actual, 0.457657554360286);
    }

    @Test
    public void ctgDoubleTest4() {
        double actual = calculator.ctg(0.0);
        assertEquals(actual, "Infinity");
    }
}
