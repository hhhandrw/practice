package ru.ssau.tk.love.idea.typesOfData;

public class NamedPoint extends Point {

    private String name;

    public NamedPoint(double x, double y, double z) {
        super(x, y, z);
    }

    public NamedPoint(double x, double y, double z, String name) {
        super(x, y, z);
        this.name = name;
    }

    public NamedPoint() {
        this(0, 0, 0, "Origin");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        if (this.name == null) {
            return super.toString();
        }
        return this.name + " " + super.toString();
    }
}