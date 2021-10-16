package ru.ssau.tk.love.idea.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayTest {
    private final static double DELTA = 0.0001;

    @Test
    public void createArrayTest() {
        assertEquals(Array.createArray(5), new int[5]);
        assertEquals(Array.createArray(15), new int[15]);
        assertEquals(Array.createArray(0), new int[0]);
    }

    @Test
    public void generateArrayTest() {
        int[] referenceArray = new int[]{2, 1, 1, 1, 2};

        assertEquals(referenceArray[0], Array.generateArray(5)[0]);
        assertEquals(referenceArray[1], Array.generateArray(5)[1]);
        assertEquals(referenceArray[2], Array.generateArray(5)[2]);
        assertEquals(referenceArray[3], Array.generateArray(5)[3]);
        assertEquals(referenceArray[4], Array.generateArray(5)[4]);
    }

    @Test
    public void generateOddArrayTest() {
        int[] referenceArray = new int[]{1, 3, 5, 7, 9};

        assertEquals(referenceArray[0], Array.generateOddArray(5)[0]);
        assertEquals(referenceArray[1], Array.generateOddArray(5)[1]);
        assertEquals(referenceArray[2], Array.generateOddArray(5)[2]);
        assertEquals(referenceArray[3], Array.generateOddArray(5)[3]);
        assertEquals(referenceArray[4], Array.generateOddArray(5)[4]);
    }

    @Test
    public void generateEvenArrayTest() {
        int[] referenceArray = new int[]{10, 8, 6, 4, 2};

        assertEquals(referenceArray[0], Array.generateEvenArray(5)[0]);
        assertEquals(referenceArray[1], Array.generateEvenArray(5)[1]);
        assertEquals(referenceArray[2], Array.generateEvenArray(5)[2]);
        assertEquals(referenceArray[3], Array.generateEvenArray(5)[3]);
        assertEquals(referenceArray[4], Array.generateEvenArray(5)[4]);
    }

    @Test
    public void generateFibonacciArrayTest() {
        int[] referenceArray = new int[]{0, 1, 1, 2, 3, 5, 8, 13};

        assertEquals(referenceArray[0], Array.generateFibonacciArray(8)[0]);
        assertEquals(referenceArray[1], Array.generateFibonacciArray(8)[1]);
        assertEquals(referenceArray[2], Array.generateFibonacciArray(8)[2]);
        assertEquals(referenceArray[3], Array.generateFibonacciArray(8)[3]);
        assertEquals(referenceArray[4], Array.generateFibonacciArray(8)[4]);
        assertEquals(referenceArray[5], Array.generateFibonacciArray(8)[5]);
        assertEquals(referenceArray[6], Array.generateFibonacciArray(8)[6]);
        assertEquals(referenceArray[7], Array.generateFibonacciArray(8)[7]);
    }

    @Test
    public void generateSqrArrayTest() {
        int[] referenceArray = new int[]{0, 1, 4, 9, 16, 25};

        assertEquals(referenceArray[0], Array.generateSqrArray(6)[0]);
        assertEquals(referenceArray[1], Array.generateSqrArray(6)[1]);
        assertEquals(referenceArray[2], Array.generateSqrArray(6)[2]);
        assertEquals(referenceArray[3], Array.generateSqrArray(6)[3]);
        assertEquals(referenceArray[4], Array.generateSqrArray(6)[4]);
        assertEquals(referenceArray[5], Array.generateSqrArray(6)[5]);
    }

    @Test
    public void getArrayOfSolutionsTest() {
        assertEquals(Array.getArrayOfSolutions(1, 4, 3), new double[]{-3, -1});
        assertEquals(Array.getArrayOfSolutions(0, 4, 4), new double[]{-1});
        assertEquals(Array.getArrayOfSolutions(1, 4, 4), new double[]{-2});
        assertEquals(Array.getArrayOfSolutions(4, 4, 4), new double[]{});
    }

    @Test
    public void getExceptDivisibleByThreeArrayTest() {
        int[] referenceArray = new int[]{1, 2, 4, 5, 7, 8};

        assertEquals(Array.getExceptDivisibleByThreeArray(6), referenceArray);
    }

    @Test
    public void getProgressionArrayTest() {
        int[] referenceArray = new int[]{1, 4, 7, 10, 13, 16};

        assertEquals(Array.getProgressionArray(6,1,3), referenceArray);
    }
}