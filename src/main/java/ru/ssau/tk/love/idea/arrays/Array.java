package ru.ssau.tk.love.idea.arrays;

public class Array {
    public static int[] createArray(int size) {
        return new int[size];
    }

    public static int[] generateArray(int size) {
        int[] array = new int[size];
        for (int i = 1; i < size - 1; i++) {
            array[i] = 1;
        }
        array[0] = 2;
        array[size - 1] = 2;
        return array;
    }

    public static int[] generateOddArray(int size) {
        int[] array = new int[size];
        int filler = 1;
        for (int i = 0; i < size; i++) {
            array[i] = filler;
            filler += 2;
        }
        return array;
    }

    public static int[] generateEvenArray(int size) {
        int[] array = new int[size];
        int filler = 2;
        for (int i = size - 1; i >= 0; i--) {
            array[i] = filler;
            filler += 2;
        }
        return array;
    }

    public static int[] generateFibonacciArray(int n) {
        int[] array = new int[n];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array;
    }

    public static int[] generateSqrArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i * i;
        }
        return array;
    }

    public static double[] getArrayOfSolutions(double a, double b, double c) {
        if (a == 0) {
            double[] array = new double[1];
            array[0] = -c / b;
            return array;
        } else {
            double discriminant = b * b - 4 * a * c;

            if (discriminant < 0) {
                return new double[0];
            } else if (discriminant == 0) {
                double[] array = new double[1];
                array[0] = -b / (2 * a);
                return array;
            } else if (discriminant > 0) {
                double[] array = new double[2];
                double sqrtOfDiscriminant = Math.sqrt(discriminant);
                array[0] = (-b - sqrtOfDiscriminant) / (2 * a);
                array[1] = (-b + sqrtOfDiscriminant) / (2 * a);
                return array;
            }
        }
        return new double[0];
    }
}