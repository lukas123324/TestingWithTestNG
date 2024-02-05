package CalculationsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;
public class CalculationTest {

    /**
     * Test for positive numbers
     */
    @Test
    public void testFindMaxPositive() {
        int[] arr = {8, 2, 10, 11, 3};
        int result = Calculation.findMax(arr);
        Assert.assertEquals(result, 11);
    }

    /**
     * Test for negative numbers
     */
    @Test
    public void testFindMaxNegative() {
        int[] arr = {-8, -2, -10, -11, -3};
        int result = Calculation.findMax(arr);
        Assert.assertEquals(result, -2);
    }

    /**
     * Test for empty array
     */
    @Test
    public void testFindMaxEmptyArr() {
        int[] arr = {};
        int result = Calculation.findMax(arr);
        Assert.assertEquals(result, 0);
    }

    /**
     * Test for positive number
     */
    @Test
    public void testCubePositiv() {
        int result = Calculation.cube(3);
        Assert.assertEquals(result, 27);
    }

    /**
     * Test for negative number
     */
    @Test
    public void testCubeNegative() {
        int result = Calculation.cube(-2);
        Assert.assertEquals(result, -8);
    }

    /**
     * Test for zero
     */
    @Test
    public void testCubeNegativeNull() {
        int result = Calculation.cube(0);
        Assert.assertEquals(result, 0);
    }

    /**
     * Test for empty string
     */
    @Test
    public void testReverseWordEmpty() {
        String result = Calculation.reverseWord("");
        Assert.assertEquals(result, "");
    }

    /**
     * Test for two words
     */
    @Test
    public void testReverseWord() {
        String result = Calculation.reverseWord("Hello World");
        Assert.assertEquals(result, "olleH dlroW");
    }

    /**
     * Test positive numbers
     */
    @Test
    public void testPower() {
        int result = Calculation.toThePowerOf(2, 3);
        Assert.assertEquals(result, 8);
    }

    /**
     * Test negative base
     */
    @Test
    public void testPowerNegativeBase() {
        int result = Calculation.toThePowerOf(-2, 3);
        Assert.assertEquals(result, -8);
    }

    /**
     * Test negative exponent
     */
    @Test
    public void testPowerNegativeExpo() {
        int result = Calculation.toThePowerOf(2, -3);
        Assert.assertEquals(result, 0); // 0 because INTEGER
    }

    /**
     * Test negative base and exponent
     * and base is greater than exponent
     */
    @Test
    public void testPowerNegative() {
        int result = Calculation.toThePowerOf(-2, -9);
        Assert.assertEquals(result, 0); // 0 because INTEGER
    }
}
