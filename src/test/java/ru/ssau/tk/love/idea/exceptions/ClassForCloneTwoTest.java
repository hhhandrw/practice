package ru.ssau.tk.love.idea.exceptions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassForCloneTwoTest {

    @Test
    public void testClone() {
        ClassForCloneTwo a = new ClassForCloneTwo(5);
        Assert.assertThrows(CloneNotSupportedException.class, () -> {
                Object b = a.clone();
        });
    }
}