package ru.ssau.tk.love.idea.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayTest {
    @Test
    public void newArrayTest(){
        assertEquals(Array.newArray(5), new int[5]);
        assertEquals(Array.newArray(15), new int[15]);
        assertEquals(Array.newArray(0), new int[0]);
    }
}