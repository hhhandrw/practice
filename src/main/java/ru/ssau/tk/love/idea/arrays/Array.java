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

    public static int[] getExceptDivisibleByThreeArray(int size) {
        int[] array = new int[size];
        int a = 1;
        for (int i = 0; i < size; i++) {
            array[i] = a;
            a++;
            if (a % 3 == 0) {
                a++;
            }
        }
        return array;
    }

    public static int[] getProgressionArray(int size, int firstElement, int difference) {
        int[] array = new int[size];
        int a = firstElement + difference;
        array[0] = firstElement;
        for (int i = 1; i < size; i++) {
            array[i] = a;
            a += difference;
        }
        return array;
    }

    public static double[] getGeometricProgressionArray(int size, double firstElement, double q) {
        double[] array = new double[size];
        double a = firstElement * q;
        array[0] = firstElement;
        for (int i = 1; i < size; i++) {
            array[i] = a;
            a *= q;
        }
        return array;
    }

    public static int[] getArrayOfDividers(int a) {
        int quantityOfDividers = 0;
        for (int i = 1; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                quantityOfDividers++;
            }
        }
        int[] dividers = new int[quantityOfDividers];
        int j = 0;
        for (int i = 1; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                dividers[j] = i;
                j++;
            }
        }
        return dividers;
    }

    public static int[] getSymmetricalArray(int size) {
        int[] symmetricalArray = new int[size];
        int j = 1;
        if (size % 2 != 0) {
            for (int i = 0; i <= (size / 2); i++) {
                symmetricalArray[i] = j;
                j++;
            }
            j = size / 2;
            for (int i = (size / 2) + 1; i < size; i++) {
                symmetricalArray[i] = j;
                j--;
            }
        } else {
            for (int i = 0; i < (size / 2); i++) {
                symmetricalArray[i] = j;
                j++;
            }
            j = size / 2;
            for (int i = (size / 2); i < size; i++) {
                symmetricalArray[i] = j;
                j--;
            }
        }
        return symmetricalArray;
    }

    public static void getOppositeArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            double a = array[i] * (-1);
            array[i] = a;
        }
    }

    public static boolean arrayContainsNumber(double[] array, double number) {
        boolean contains = false;
        for (double d : array) {
            if (d == number) {
                contains = true;
                break;
            }
        }
        return contains;
    }

    public static boolean arrayContainsNull(Integer[] array) {
        boolean contains = false;
        for (Integer i : array) {
            if (i == null) {
                contains = true;
                break;
            }
        }
        return contains;
    }

    public static int getQuantityOfEvenNumbers(int[] array) {
        int q = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                q++;
            }
        }
        return q;
    }

    public static int getMax(int[] array) {
        if (array.length == 0) {
            return 0;
        } else {
            int max = 0;
            for (int i : array) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        }
    }

    public static double getSum(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static boolean quantityOfDividersOfFirstIsMore(int[] array) {
        int a = 0;
        int b = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] % array[0] == 0) {
                a++;
            }
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] % array[array.length - 1] == 0) {
                b++;
            }
        }
        boolean bool;
        bool = a > b;
        return bool;
    }

    public static int getIndexOfElement(double[] array, double a) {
        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i] == a) {
                break;
            }
        }
        return i;
    }

    public static void swapMaxAndMin(double[] array) {
        double max = array[0];
        double min = array[0];
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                maxIndex = i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                minIndex = i;
            }
        }
        array[maxIndex] = min;
        array[minIndex] = max;
    }

    public static void applyBitwiseNegation(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ~array[i];
        }
    }

    public static int[] getBitwiseNegationArray(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0, j = 0; i < array.length; i++, j++) {
            newArray[j] = ~array[i];
        }
        return newArray;
    }

    public static int[] getPairSumArray(int[] array) {
        int[] pairSumArray;
        if (array.length % 2 == 0) {
            pairSumArray = new int[array.length / 2];
            for (int i = 0; i < pairSumArray.length; i++) {
                pairSumArray[i] = array[i * 2] + array[i * 2 + 1];
            }
        } else {
            pairSumArray = new int[array.length / 2 + 1];
            for (int i = 0; i < pairSumArray.length - 1; i++) {
                pairSumArray[i] = array[i * 2] + array[i * 2 + 1];
                pairSumArray[array.length / 2] = array[array.length - 1];
            }
        }
        return pairSumArray;
    }
}