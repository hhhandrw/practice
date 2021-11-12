package ru.ssau.tk.love.idea.exceptions;

import org.testng.annotations.Test;

public class ClassForCloneOneTest {
    @Test
    public void testClone() {
        ClassForCloneOne a = new ClassForCloneOne(5);
        try {
            Object b = a.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}