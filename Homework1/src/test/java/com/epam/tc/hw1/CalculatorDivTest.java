package com.epam.tc.hw1;

import static org.testng.AssertJUnit.assertEquals;

import com.epam.tat.module4.Calculator;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorDivTest extends Calculator {
    
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
    public void divLongLongTest1() throws IOException {
        try {
            long actual = calculator.div(50509240L, 0);
            assertEquals(actual, new NumberFormatException());
        } catch (NumberFormatException ex) {
            Assert.assertNotEquals("", ex.getMessage());
        }
    }

    @Test
    public void divLongLongTest2() {
        long actual = calculator.div(-7057393437131528568L, 8618980761875499399L);
        assertEquals(actual, 0);
    }

    @Test
    public void divLongLongTest3() {
        long actual = calculator.div(-26426542622217393L, -3686313541507674849L);
        assertEquals(actual, 0);
    }

    @Test
    public void divLongLongTest4() throws IOException {
        try {
            long actual = calculator.div(4765667447389388974L, 0);
            assertEquals(actual, new NumberFormatException());
        } catch (NumberFormatException ex) {
            Assert.assertNotEquals("", ex.getMessage());
        }
    }

    @Test
    public void divDubleDoubleTest1() {
        double actual = calculator.div(28105.62, -0.0);
        assertEquals(actual, "-Infinity");
    }

    @Test
    public void divDubleDoubleTest2() {
        double actual = calculator.div(19936.45, 26136.38);
        assertEquals(actual, 0.7627854354734664);
    }

    @Test
    public void divDubleDoubleTest3() {
        double actual = calculator.div(19570.75, 70693.35);
        assertEquals(actual, 0.27684004223876785);
    }
}
