package labs.lab1.task3;

import labs.lab1.IOOperations.IO;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.function.Function;

public class Solution {
    private static final double EPSILON = 5.98e-08;
    private static ArrayList<TableRow> rows;

    public static void main(String[] args) {

        try{
            double a = IO.requestDoubleValue("Enter a: ");
            double b = IO.requestDoubleValue("Enter b: ");
            double h = IO.requestDoubleValue("Enter h: ");

            solveFunction(a, b, h, Math::tan);
            for (TableRow row : rows){
                IO.showResultTask3(row.arg, row.value);
            }
        } catch (InputMismatchException e){
            System.out.println("Incorrect format of args");
        }
    }

    public static void solveFunction(double a, double b, double h, Function<Double, Double> function){
        rows = new ArrayList<>();

        for (double arg = a; arg < b || Math.abs(arg/b - 1) < EPSILON; arg += h){
            rows.add(new TableRow(arg, function.apply(arg)));
        }
    }

    public static TableRow getRow(int index){
        return rows.get(index);
    }

    public record TableRow(double arg, double value){}
}
