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

    public static void ExploreScreening() {
        int i = 0;
        System.out.println("Символ\t№" + ++i); // табуляция
        System.out.println("Символ\b№" + ++i); // удаление последнего элемента
        System.out.println("Символ\n№" + ++i); // переход на новую строку
        System.out.println("Символ\r№" + ++i); // игнорирование текста до /r
        System.out.println("Символ\'№" + ++i); // символ '
        System.out.println("Символ\"№" + ++i); // символ "
        System.out.println("Символ\\№" + ++i); // символ \
    }

    public static int firstGetIndexOfIncluding(String firstStr, String secondStr) {
        return firstStr.indexOf(secondStr);
    }

    public static int secondGetIndexOfIncluding(String firstStr, String secondStr) {
        int i = (firstStr.length() - 1) / 2;
        return firstStr.indexOf(secondStr, i);
    }

    public static int thirdGetIndexOfIncluding(String firstStr, String secondStr) {
        int i = (firstStr.length() - 1) / 2;
        return firstStr.lastIndexOf(secondStr, i);
    }

    public static int getQuantityOfStringsInArray(String[] array, String pre, String post) {
        int count = 0;
        for (String s : array) {
            if (s.startsWith(pre) && s.endsWith(post)) {
                count++;
            }
        }
        return count;
    }

    public static int findStringsInArray(String[] array, String pre, String post) {
        int count = 0;
        for (String s : array) {
            if (s.trim().startsWith(pre) && s.trim().endsWith(post)) {
                count++;
            }
        }
        return count;
    }

    public static String replace(String sOne, String sTwo, String sThree) {
        String sFour = sOne;
        for (int i = 0; sFour.contains(sTwo) && i < 100; ++i) {
            sFour = sFour.replaceAll(sTwo, sThree);
        }
        return sFour;
    }
}
