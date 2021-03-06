package ru.ssau.tk.love.idea.typesOfData;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NamedPointTest {
    NamedPoint firstPoint = new NamedPoint();
    NamedPoint secondPoint = new NamedPoint(1, 2, 4);
    NamedPoint thirdPoint = new NamedPoint(5, 2, 1, "A");

    @Test
    public void testGetName() {
        assertEquals(firstPoint.getName(), "Origin");
        assertNull(secondPoint.getName());
        assertEquals(thirdPoint.getName(), "A");
    }

    @Test
    public void testSetName() {
        firstPoint.setName("X");
        secondPoint.setName("Y");

        assertEquals(firstPoint.getName(), "X");
        assertEquals(secondPoint.getName(), "Y");
        assertEquals(thirdPoint.getName(), "A");
    }

    @Test
    public void testToString() {
        NamedPoint first = new NamedPoint(1, 2, 3);
        assertEquals(first.toString(), "[1.0, 2.0, 3.0]");

        NamedPoint second = new NamedPoint(1, 2, 3, "C");
        assertEquals(second.toString(), "C [1.0, 2.0, 3.0]");
    }
}