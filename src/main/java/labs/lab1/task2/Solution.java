package labs.lab1.task2;

import java.util.ArrayList;
import java.util.InputMismatchException;

import labs.lab1.IOOperations.IO;

public class Solution {
    public static ArrayList<Rectangle> rectangles;

    public static void main(String[] args) {
        initializeRectangles();

        try {
            double x = IO.requestDoubleValue("Enter X: ");
            double y = IO.requestDoubleValue("Enter Y: ");

            IO.showResultTask2(x, y, isBelongsToRegion(x, y));
        } catch (InputMismatchException e) {
            System.out.println("Number format was wrong");
        }
    }

    public static void initializeRectangles(){
        rectangles = new ArrayList<>();

        rectangles.add(new Rectangle(-4, 5, 4, 0));
        rectangles.add(new Rectangle(-6, 0, 6, -3));
    }

    public static boolean isBelongsToRegion(double x, double y){
        boolean belongsToRegion = false;

        for (Rectangle rectangle : rectangles){
            if (rectangle.isPointInRectangle(x, y)){
                belongsToRegion = true;
                break;
            }
        }

        return belongsToRegion;
    }
}
