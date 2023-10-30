package labs.lab1.task7;

import labs.lab1.IOOperations.IO;

import java.util.Arrays;
import java.util.InputMismatchException;

public class Solution {

    public static double[] sortArray(double[] initialArray){
        double[] sortedArray = Arrays.copyOf(initialArray, initialArray.length);
        int i = 0;

        while (i < sortedArray.length - 1){
            if (sortedArray[i] <= sortedArray[i + 1]) {
                i++;
            } else {
                double temp = sortedArray[i];

                sortedArray[i] = sortedArray[i + 1];
                sortedArray[i + 1] = temp;
                if (i != 0) i--;
            }
        }

        return sortedArray;
    }

    public static void main(String[] args) {
        try{
            int N = IO.requestIntegerValue("Enter N - size of array: ");
            double[] array = IO.requestDoubleArrayOfNSize(N);

            IO.showResultTask7(array, sortArray(array));
        } catch (InputMismatchException e){
            System.out.println("Incorrect format of arguments");
        }
    }
}
