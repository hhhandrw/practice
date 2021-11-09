package ru.ssau.tk.love.idea.exceptions;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.ssau.tk.love.idea.typesOfData.Person;

import static org.testng.Assert.*;

public class MyClassTwoTest {

    @Test
    public void testGetFirstAndLastNames() {
        Person person = new Person("Andrey", "Khlebodarov", 789);
        assertEquals(MyClassTwo.getFirstAndLastNames(person), "Andrey Khlebodarov");

        Assert.assertThrows(NullPointerException.class, () -> {
            MyClassTwo.getFirstAndLastNames(null);
        });
    }
}