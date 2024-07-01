package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
    @Test
    public void testSum() {
        Calculate calculate = new Calculate();
        int expected = 5;
        assertEquals(expected, calculate.sum(2, 3));
    }

    @Test
    public void testAverage() {
        Calculate calculate = new Calculate();
        double expected = 2.5;
        assertEquals(expected, calculate.average(2, 3), 0.001);
    }

    @Test
    public void testSumFromOneToTen() {
        Calculate calculate = new Calculate();
        int expected = 55;
        assertEquals(expected, calculate.sumFromOneToTen());
    }

    @Test
    public void testAverageFromOneToTen() {
        Calculate calculate = new Calculate();
        double expected = 5.5;
        assertEquals(expected, calculate.averageFromOneToTen(), 0.001);
    }

    @Test
    public void testSumOddFromOneToTen() {
        Calculate calculate = new Calculate();
        int expected = 25;
        assertEquals(expected, calculate.sumOddFromOneToTen());
    }

    @Test
    public void testSumEvenFromOneToTen() {
        Calculate calculate = new Calculate();
        int expected = 30;
        assertEquals(expected, calculate.sumEvenFromOneToTen());
    }
}
