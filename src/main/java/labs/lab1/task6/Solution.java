package labs.lab1.task6;

import labs.lab1.IOOperations.IO;

import java.util.InputMismatchException;

public class Solution {

    public static void main(String[] args) {
        try{
            int N = IO.requestIntegerValue("Enter N - size of array: ");
            double[] array = IO.requestDoubleArrayOfNSize(N);

            IO.showResultTask6(array, getSquareMatrix(array));
        } catch (InputMismatchException e){
            System.out.println("Incorrect format of arguments");
        }
    }

    public static double[][] getSquareMatrix(double[] numbers){
        double[][] result = new double[numbers.length][numbers.length];

        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers.length; j++){
                result[i][j] = numbers[(i + j) % numbers.length];
            }
        }

        return result;
    }
}
