package labs.lab1.IOOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IO {
    private static final Scanner in = new Scanner(System.in);

    public static void showResultTask1(double x, double y, double result){
        System.out.printf("x = %f, y = %f, result = %f", x, y, result);
    }

    public static void showResultTask2(double x, double y, boolean result){
        System.out.printf("x = %f, y = %f, result = %b", x, y, result);
    }

    public static void showResultTask3(double arg, double result){
        System.out.printf("""
                ************************
                |%10.7f |%10.7f|
                """, arg, result);
    }

    public static void showResultTask4(int[] initialArray, ArrayList<Integer> indexes){
        System.out.println("Initial array: " + Arrays.toString(initialArray));
        System.out.println("Indexes of prime numbers: " + indexes.toString());

    }

    public static void showResultTask5(int[] initialArray, int amountToDelete){
        System.out.println("Initial array: " + Arrays.toString(initialArray));
        System.out.println("K = " + amountToDelete);
    }

    public static void showResultTask6(double[] initialArray, double[][] matrix){
        System.out.println("Initial array: " + Arrays.toString(initialArray));

        for (double[] doubles : matrix) {
            for (double aDouble : doubles) {
                System.out.printf("%f ", aDouble);
            }
            System.out.println();
        }

    }

    public static void showResultTask7(double[] unsortedArray, double[] sortedArray){
        System.out.println("Unsorted array: " + Arrays.toString(unsortedArray));
        System.out.println("Sorted array: " + Arrays.toString(sortedArray));
    }

    public static double requestDoubleValue(String message) throws InputMismatchException {
        System.out.print(message);

        return in.nextDouble();
    }

    public static int requestIntegerValue(String message) throws InputMismatchException{
        System.out.print(message);

        return in.nextInt();
    }

    public static int[] requestIntArrayOfNSize(int N){
        int[] array = new int[N];

        for (int i = 0; i < N; i++){
            array[i] = in.nextInt();
        }
        return array;
    }

    public static double[] requestDoubleArrayOfNSize(int N){
        double[] array = new double[N];

        for (int i = 0; i < N; i++){
            array[i] = in.nextDouble();
        }
        return array;
    }
}
