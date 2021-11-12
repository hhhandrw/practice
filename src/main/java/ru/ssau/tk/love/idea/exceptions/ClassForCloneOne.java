package ru.ssau.tk.love.idea.exceptions;

public class ClassForCloneOne implements Cloneable {

    public int a;

    public ClassForCloneOne(int a) {
        this.a = a;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
