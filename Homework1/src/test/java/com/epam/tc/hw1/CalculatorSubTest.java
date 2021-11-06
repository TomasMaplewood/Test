package com.epam.tc.hw1;

import static org.testng.AssertJUnit.assertEquals;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorSubTest extends Calculator {

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
    public void subLongLongTest1() {
        long actual = calculator.sub(5050924074231259813L, 1680408137707665638L);
        assertEquals(actual, 3370515936523594175L);
    }

    @Test
    public void subLongLongTest2() {
        long actual = calculator.sub(-7057393437131528568L, 8618980761875499399L);
        assertEquals(actual, 2770369874702523649L);
    }

    @Test
    public void subLongLongTest3() {
        long actual = calculator.sub(-26426542622217393L, -3686313541507674849L);
        assertEquals(actual, 3659886998885457456L);
    }

    @Test
    public void subLongLongTest4() {
        long actual = calculator.sub(4765667447389388974L, 4850340724009747192L);
        assertEquals(actual, -84673276620358218L);
    }

    @Test
    public void subDubleDoubleTest1() {
        double actual = calculator.sub(28105.62, 62396.43);
        assertEquals(actual, -34290.81);
    }

    @Test
    public void sumDubleDoubleTest2() {
        double actual = calculator.sub(19936.45, 26136.38);
        assertEquals(actual, -6199.93);
    }

    @Test
    public void subDubleDoubleTest3() {
        double actual = calculator.sub(19570.75, 70693.35);
        assertEquals(actual, -51122.600000000006);
    }

    @Test
    public void subDubleDoubleTest4() {
        double actual = calculator.sub(40179.11, 316.22);
        assertEquals(actual, 39862.89);
    }
}
