package com.epam.tc.hw1;

import static org.testng.AssertJUnit.assertEquals;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorSumTest extends Calculator {
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
    public void sumLongLongTest1() {
        long actual = calculator.sum(5050924074231259813L, 1680408137707665638L);
        assertEquals(actual, 6731332211938925451L);
    }

    @Test
    public void sumLongLongTest2() {
        long actual = calculator.sum(-7057393437131528568L, 8618980761875499399L);
        assertEquals(actual, 1561587324743970831L);
    }

    @Test
    public void sumLongLongTest3() {
        long actual = calculator.sum(-26426542622217393L, -3686313541507674849L);
        assertEquals(actual, -3712740084129892242L);
    }

    @Test
    public void sumLongLongTest4() {
        long actual = calculator.sum(4765667447389388974L, 4850340724009747192L);
        assertEquals(actual, -8830735902310415450L);
    }

    @Test
    public void sumDubleDoubleTest1() {
        double actual = calculator.sum(28105.62, 62396.43);
        assertEquals(actual, 90502.05);
    }

    @Test
    public void sumDubleDoubleTest2() {
        double actual = calculator.sum(19936.45, 26136.38);
        assertEquals(actual, 46072.83);
    }

    @Test
    public void sumDubleDoubleTest3() {
        double actual = calculator.sum(19570.75, 70693.35);
        assertEquals(actual, 90264.1);
    }

    @Test
    public void sumDubleDoubleTest4() {
        double actual = calculator.sum(40179.11, 316.22);
        assertEquals(actual, 40495.33);
    }
}
