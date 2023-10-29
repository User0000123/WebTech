package Labs.lab1.task2;

import static java.lang.Math.abs;

public class Rectangle {
    private static final double EPSILON = 5.96e-08;

    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Rectangle(double x1, double y1, double x2, double y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public boolean isPointInRectangle(double x, double y){
        return (x > x1 || abs(x/x1 - 1) < EPSILON)
                && (x < x2 || abs(x/x2 - 1) < EPSILON)
                && (y < y1 || abs(y/y1 - 1) < EPSILON)
                && (y > y2 || abs(y/y2 - 1) < EPSILON);
    }
}
