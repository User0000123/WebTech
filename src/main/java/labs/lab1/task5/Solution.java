package labs.lab1.task5;

import labs.lab1.IOOperations.IO;

import java.util.Arrays;
import java.util.InputMismatchException;

public class Solution {

    public static int getMinimumKToDelete(int[] A){
        int arraySize = A.length;
        int[] distances = new int[arraySize];
        int maxSubsequentLength = 1;

        Arrays.fill(distances, 1);

        for (int i = 0; i < A.length; i++){
            for (int j = 0; j < i; j++){
                if (A[i] > A[j] && distances[j] + 1 > distances[i]){
                    distances[i] = distances[j] + 1;
                    if (maxSubsequentLength < distances[i]){
                        maxSubsequentLength = distances[i];
                    }
                }
            }
        }

        return arraySize - maxSubsequentLength;
    }

    public static void main(String[] args) {
        try{
            int N = IO.requestIntegerValue("Enter N - size of array: ");
            int[] array = IO.requestIntArrayOfNSize(N);

            IO.showResultTask5(array, getMinimumKToDelete(array));
        } catch (InputMismatchException e){
            System.out.println("Incorrect format of arguments");
        }
    }
}
