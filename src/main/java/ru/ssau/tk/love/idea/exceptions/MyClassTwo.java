package ru.ssau.tk.love.idea.exceptions;

import ru.ssau.tk.love.idea.typesOfData.Person;

public class MyClassTwo {
    public static String getFirstAndLastNames(Person person) {
        return person.toString();
    }

    public static char[] getArrayOfChars (String[] strings, int n) {
        char [] chars = new char[strings.length];
        int i = 0;
        for (String str: strings) {
            chars [i] = str.charAt(n);
            i++;
        }
        return chars;
    }
}
