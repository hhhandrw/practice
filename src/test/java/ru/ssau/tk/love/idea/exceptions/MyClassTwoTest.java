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

    @Test
    public void testGetArrayOfChars() {
        String[] stringsOne = {"apple", "ice", "pear"};
        char[] charsOne = new char[]{'p', 'c', 'e'};
        assertEquals(MyClassTwo.getArrayOfChars(stringsOne, 1), charsOne);

        char[] charsTwo = new char[]{'p', 'e', 'a'};
        assertEquals(MyClassTwo.getArrayOfChars(stringsOne, 2), charsTwo);

        Assert.assertThrows(NullPointerException.class, () -> MyClassTwo.getArrayOfChars(null, 1));

        String[] stringsTwo = {null, "ice", "pear"};
        Assert.assertThrows(NullPointerException.class, () -> MyClassTwo.getArrayOfChars(stringsTwo, 1));

        Assert.assertThrows(StringIndexOutOfBoundsException.class, () -> MyClassTwo.getArrayOfChars(stringsOne, 11));
        Assert.assertThrows(StringIndexOutOfBoundsException.class, () -> MyClassTwo.getArrayOfChars(stringsOne, -2));
    }

    @Test
    public void testGetChar() {
        String[] strings = {"apple", "ice", "pear"};
        assertEquals(MyClassTwo.getChar(strings,1,1), 'c');
        assertEquals(MyClassTwo.getChar(strings,2,0), 'p');

        Assert.assertThrows(ArrayIndexOutOfBoundsException.class, () -> MyClassTwo.getChar(strings, 5,1));
        Assert.assertThrows(StringIndexOutOfBoundsException.class, () -> MyClassTwo.getChar(strings, 1,5));
    }
}