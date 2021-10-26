package ru.ssau.tk.love.idea.strings;

import com.sun.istack.internal.Nullable;

public class MyString {
    public static void printString(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    public static void getByteString(String str) {
        byte[] bytes = str.getBytes();
        for (byte b : bytes) {
            System.out.println(b);
        }
    }

    public static void getComparison() {
        String firstString = "А и Б сидели на трубе";
        String secondString = new String(firstString);
        System.out.println(firstString == secondString);
        System.out.println(firstString.equals(secondString));
    }

    public static boolean checkStringIsPalindrome(String str) {
        String palindrome = new StringBuilder(str).reverse().toString();
        return str.equals(palindrome);
    }

    public static boolean checkDifferentCase(String firstStr, String secondStr) {
        if (firstStr == null || secondStr == null) {
            return false;
        }
        return (!firstStr.equals(secondStr)) && (firstStr.equalsIgnoreCase(secondStr));
    }
}
