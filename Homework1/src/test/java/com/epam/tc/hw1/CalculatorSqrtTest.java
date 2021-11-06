package com.epam.tc.hw1;

import static org.testng.AssertJUnit.assertEquals;

import com.epam.tat.module4.Calculator;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorSqrtTest extends Calculator {

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
    public void sqrtDubleDoubleTest1() throws IOException {
        try {
            double actual = calculator.sqrt(-81);
            assertEquals(actual, new NumberFormatException());
        } catch (NumberFormatException ex) {
            Assert.assertNotEquals("", ex.getMessage());
        }
    }

    @Test
    public void sqrtDubleDoubleTest2() {
        double actual = calculator.sqrt(0);
        assertEquals(actual, 0.0);
    }

    @Test
    public void sqrtDubleDoubleTest3() {
        double actual = calculator.sqrt(144.0);
        assertEquals(actual, 12.0);
    }

    @Test
    public void sqrtDubleDoubleTest4() {
        double actual = calculator.sqrt(58.4);
        assertEquals(actual, 7.64198926981712);
    }
}
