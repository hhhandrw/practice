package ru.ssau.tk.love.idea.controlWork;

public class MyClass {
    public static String getStringOfObjectsInArray(Object[] array) {
        StringBuilder concatenation = new StringBuilder();
        for (Object o : array) {
            concatenation.append(o.toString()).append(" ");
        }
        return concatenation.toString();
    }
}
