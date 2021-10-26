package ru.ssau.tk.love.idea.strings;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MyStringTest {

    @Test
    public void testCheckStringIsPalindrome() {
        assertTrue(MyString.checkStringIsPalindrome("казак"));
        assertTrue(MyString.checkStringIsPalindrome("шалаш"));
        assertFalse(MyString.checkStringIsPalindrome("дом"));
    }

    @Test
    public void testCheckDifferentCase() {
        assertTrue(MyString.checkDifferentCase("Я увидел Лондон", "я увидел лондон"));
        assertTrue(MyString.checkDifferentCase("МЫ МОЛОДЦЫ", "мы молодцы"));
        assertFalse(MyString.checkDifferentCase(null, "мы молодцы"));
        assertFalse(MyString.checkDifferentCase(null, null));
        assertFalse(MyString.checkDifferentCase("МЫ МОЛОДЦЫ", null));
    }

    @Test
    public void testFirstGetIndexOfIncluding() {
        assertEquals(MyString.firstGetIndexOfIncluding("abcaadcafgafg", "adca"), 4);
        assertEquals(MyString.firstGetIndexOfIncluding("abcaadcafgafg", "mmmmmm"), -1);
    }

    @Test
    public void testSecondGetIndexOfIncluding() {
        assertEquals(MyString.secondGetIndexOfIncluding("abcaadcafgafg", "adca"), -1);
        assertEquals(MyString.secondGetIndexOfIncluding("abcaadcafgafg", "mmmmmm"), -1);
        assertEquals(MyString.secondGetIndexOfIncluding("abcaadcafgafg", "fga"), 8);
        assertEquals(MyString.secondGetIndexOfIncluding("abcaadcafgafg", "caf"), 6);
        assertEquals(MyString.secondGetIndexOfIncluding("abcaadcafgafg", "dcaf"), -1);
    }
}