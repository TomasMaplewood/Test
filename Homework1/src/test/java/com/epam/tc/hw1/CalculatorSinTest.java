package com.epam.tc.hw1;

import static org.testng.AssertJUnit.assertEquals;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorSinTest extends Calculator {

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
    public void sinDoubleTest1() {
        double actual = calculator.sin(0.62);
        assertEquals(actual, 0.5810351605373051);
    }

    @Test
    public void sinDoubleTest2() {
        double actual = calculator.sin(19.45);
        assertEquals(actual, 0.5650089314775140
        );
    }

    @Test
    public void sinDoubleTest3() {
        double actual = calculator.sin(2.0);
        assertEquals(actual, 0.9092974268256817);
    }

    @Test
    public void sinDoubleTest4() {
        double actual = calculator.sin(0.0);
        assertEquals(actual, 0.0);
    }
}

