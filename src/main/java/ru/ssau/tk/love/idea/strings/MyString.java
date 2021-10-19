package ru.ssau.tk.love.idea.strings;

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
}
