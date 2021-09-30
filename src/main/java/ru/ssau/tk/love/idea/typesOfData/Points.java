package ru.ssau.tk.love.idea.typesOfData;

public class Points {
    private Points() {
    }

    public static Point sum(Point firstPoint, Point secondPoint) {
        return new Point(firstPoint.x + secondPoint.x, firstPoint.y + secondPoint.y, firstPoint.z + secondPoint.z);
    }

    public static Point subtract(Point firstPoint, Point secondPoint) {
        return new Point(firstPoint.x - secondPoint.x, firstPoint.y - secondPoint.y, firstPoint.z - secondPoint.z);
    }

    public static Point divide(Point firstPoint, Point secondPoint) {
        if (secondPoint.x == 0 || secondPoint.y == 0 || secondPoint.z == 0) {
            throw new ArithmeticException("Dividing by zero");
        }
        return new Point(firstPoint.x / secondPoint.x, firstPoint.y / secondPoint.y, firstPoint.z / secondPoint.z);
    }

    public static Point multiply(Point firstPoint, Point secondPoint) {
        return new Point(firstPoint.x * secondPoint.x, firstPoint.y * secondPoint.y, firstPoint.z * secondPoint.z);
    }

    public static Point enlarge(Point point, double number) {
       return new Point(point.x * number, point.y * number, point.z * number);
    }

    public static void main(String[] args) {
        Point point = new Point(2,4,5);
        Point resultPoint = enlarge(point,5);
        System.out.println(resultPoint.x);
        System.out.println(resultPoint.y);
        System.out.println(resultPoint.z);
    }
}