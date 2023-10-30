package labs.lab1.task1;

import labs.lab1.IOOperations.IO;

import java.util.InputMismatchException;

import static java.lang.Math.sin;
import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class Solution {

    public static void main(String[] args) {
        try{
            double x = IO.requestDoubleValue("Enter X: ");
            double y = IO.requestDoubleValue("Enter Y: ");

            IO.showResultTask1(x, y, solveExpression(x, y));
        } catch (InputMismatchException e) {
            System.out.println("Number format was wrong");
        }
    }

    public static double solveExpression(double x, double y){
        return (1 + pow(sin(x+y), 2))
                / (2 + abs(x - 2 * x / (1 + pow(x, 2) * pow(y, 2)))) + x;
    }
}
