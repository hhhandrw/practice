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
}