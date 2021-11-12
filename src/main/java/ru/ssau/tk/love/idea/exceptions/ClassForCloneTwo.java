package ru.ssau.tk.love.idea.exceptions;

public class ClassForCloneTwo {

    public int a;

    public ClassForCloneTwo(int a) {
        this.a = a;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
