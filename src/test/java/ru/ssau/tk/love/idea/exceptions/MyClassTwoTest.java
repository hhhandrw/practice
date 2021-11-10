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
        assertEquals(MyClassTwo.getChar(strings, 1, 1), 'c');
        assertEquals(MyClassTwo.getChar(strings, 2, 0), 'p');

        Assert.assertThrows(ArrayIndexOutOfBoundsException.class, () -> MyClassTwo.getChar(strings, 5, 1));
        Assert.assertThrows(StringIndexOutOfBoundsException.class, () -> MyClassTwo.getChar(strings, 1, 5));
    }

    @Test
    public void testGetDivision() {
        String a = "9";
        String b = "4";
        assertEquals(MyClassTwo.getDivision(a, b), 2);

        String c = "c";
        String d = "d";
        String e = "gnfsfgn";
        String f = "0";

        Assert.assertThrows(NumberFormatException.class, () -> MyClassTwo.getDivision(c, a));
        Assert.assertThrows(NumberFormatException.class, () -> MyClassTwo.getDivision(c, d));
        Assert.assertThrows(NumberFormatException.class, () -> MyClassTwo.getDivision(e, b));
        Assert.assertThrows(NumberFormatException.class, () -> MyClassTwo.getDivision(e, d));
        Assert.assertThrows(NumberFormatException.class, () -> MyClassTwo.getDivision(a, null));
        Assert.assertThrows(ArithmeticException.class, () -> MyClassTwo.getDivision(a, f));
    }
}