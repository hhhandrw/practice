package ru.ssau.tk.love.idea.strings;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MyStringTest {

    @Test
    public void testCheckStringIsPalindrome() {
        assertTrue(MyString.checkStringIsPalindrome("казак"));
        assertTrue(MyString.checkStringIsPalindrome("шалаш"));
    }
}