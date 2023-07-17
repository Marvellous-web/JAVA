package com.abcd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class CalculatorTest {

    Calculator calc;

    @BeforeEach
    public void setup() {calc=new Calculator();
    }

    @AfterEach
    public void clean() {calc=null;}

    @Test
    public void testAddEqual() { assertEquals (5,calc.add(2,3));
    }

    @Test
    public void testAddNotEqual()
    {
        assertNotEquals(6,calc.add(1,2));
    }
}