package com.epam.tc.hw1;

import static org.testng.AssertJUnit.assertEquals;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorMultTest extends Calculator {

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
    public void multLongLongTest1() {
        long actual = calculator.mult(50509240L, 1680408137L);
        assertEquals(actual, 84876137889685880L);
    }

    @Test
    public void multLongLongTest2() {
        long actual = calculator.mult(-7057393L, 8618980761L);
        assertEquals(actual, -60827534489816073L);
    }

    @Test
    public void multLongLongTest3() {
        long actual = calculator.mult(-264265426L, -368631354L);
        assertEquals(actual, 97416521801766804L);
    }

    @Test
    public void multLongLongTest4() {
        long actual = calculator.mult(476566L, 48503407L);
        assertEquals(actual, 23115074660362L);
    }

    @Test
    public void multDubleDoubleTest1() {
        double actual = calculator.mult(28105.62, 62396.43);
        assertEquals(actual, 1.75369035E9);
    }

    @Test
    public void multDubleDoubleTest2() {
        double actual = calculator.mult(19936.45, 26136.38);
        assertEquals(actual, 5.21066633E8);
    }

    @Test
    public void multDubleDoubleTest3() {
        double actual = calculator.mult(19570.75, 70693.35);
        assertEquals(actual, 1.383521879E9);
    }

    @Test
    public void multDubleDoubleTest4() {
        double actual = calculator.mult(40179.11, 316.22);
        assertEquals(actual, 1.2705438E7);
    }
}
