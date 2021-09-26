package ru.ssau.tk.love.idea.typesOfData;

public class Point {
    public final double x;
    public final double y;
    public final double z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static void main(String[] args) {
        Point firstPoint = new Point(1.55, 2.789, 3.2);
        Point secondPoint = new Point(-99.66, 302, 5.1);
        Point thirdPoint = new Point(0, 0, 0);
        Point forthPoint = new Point(-4, -44.99, -100);
    }
}
