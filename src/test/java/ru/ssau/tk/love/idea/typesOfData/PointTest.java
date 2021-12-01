package ru.ssau.tk.love.idea.typesOfData;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointTest {
    @Test
    public void testToString() {
        Point point = new Point(1.2, 3.4, -7);
        assertEquals(point.toString(), "[1.2, 3.4, -7.0]");
    }
}