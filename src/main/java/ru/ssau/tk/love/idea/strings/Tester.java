package ru.ssau.tk.love.idea.strings;

public class Tester {
    public static void main(String[] args) {
        String str = ("What a lovely day today");
        MyString.printString(str);

        MyString.getByteString(str);
        String rusStr = ("шоколад");
        MyString.getByteString(rusStr);
        String mixStr = ("chocolate-шоколад");
        MyString.getByteString(mixStr);
    }
}
