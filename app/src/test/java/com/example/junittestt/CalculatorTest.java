package com.example.junittestt;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    /*
     * Test case: testAdd
     * Deskripsi: Memverifikasi bahwa metode add dengan benar menjumlahkan dua angka
     * Input: 5.0 dan 3.0
     * Output yang diharapkan: 8.0
     */
    @Test
    public void testAdd() {
        double result = calculator.add(5.0, 3.0);
        assertEquals(8.0, result, 0.001);
    }

    /*
     * Test case: testSubtract
     * Deskripsi: Memverifikasi bahwa metode subtract dengan benar mengurangkan angka kedua dari angka pertama
     * Input: 10.0 dan 4.0
     * Output yang diharapkan: 6.0
     */
    @Test
    public void testSubtract() {
        double result = calculator.subtract(10.0, 4.0);
        assertEquals(6.0, result, 0.001);
    }

    /*
     * Test case: testMultiply
     * Deskripsi: Memverifikasi bahwa metode multiply dengan benar mengalikan dua angka
     * Input: 7.0 dan 8.0
     * Output yang diharapkan: 56.0
     */
    @Test
    public void testMultiply() {
        double result = calculator.multiply(7.0, 8.0);
        assertEquals(56.0, result, 0.001);
    }

    /*
     * Test case: testDivide
     * Deskripsi: Memverifikasi bahwa metode divide dengan benar membagi angka pertama dengan angka kedua
     * Input: 20.0 dan 5.0
     * Output yang diharapkan: 4.0
     */
    @Test
    public void testDivide() {
        double result = calculator.divide(20.0, 5.0);
        assertEquals(4.0, result, 0.001);
    }
}