package ru.ssau.tk.love.idea.controlWork;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MyClassTest {
    @Test
    public void testGetStringOfObjectsInArray() {
        int i = 1;
        Object[] array = {"fdfhd", "aaaa", i};
        assertEquals(MyClass.getStringOfObjectsInArray(array), "fdfhd aaaa 1 ");
    }
}