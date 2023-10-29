package Labs.lab1.task4;

import Labs.lab1.IOOperations.IO;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class Solution {

    public static void main(String[] args) {
        try{
            int N = IO.requestIntegerValue("Enter N - size of array: ");
            int[] array = IO.requestIntArrayOfNSize(N);

            IO.showResultTask4(array, getIndexesOfPrimeNumbers(array));
        } catch (InputMismatchException e){
            System.out.println("Incorrect format of arguments");
        }
    }

    public static ArrayList<Integer> getIndexesOfPrimeNumbers(int[] array){
        ArrayList<Integer> indexesOfPrimes = new ArrayList<>();

        for (int i = 0; i< array.length; i++){
            if (isPrimeNumber(array[i])) indexesOfPrimes.add(i);
        }
        return indexesOfPrimes;
    }

    /* Miller-Rabin algorithm */
    private static boolean isPrimeNumber(int number) {
        if (Integer.compareUnsigned(number, 2) > 0) {
            long temp = Integer.toUnsignedLong(number) - 1;
            int s;
            int t;
            int k = (int) Math.ceil(Math.log(temp + 1) / Math.log(2));

            s = Long.numberOfTrailingZeros(temp);
            t = (int) (temp >> s);

            secondCondition:
            for (int i = 0; i < k; i++) {
                int a = (int) (Math.random() * (temp - 3) + 2);
                long x = Integer.toUnsignedLong(doFastExp(a, t, number));

                if (x == 1 || x == temp) {
                    continue;
                }

                for (int j = 0; j < s - 1; j++) {
                    x = Integer.toUnsignedLong(doFastExp((int) x, 2, number));

                    if (x == 1) {
                        return false;
                    }
                    if (x == temp) {
                        continue secondCondition;
                    }
                }
                return false;
            }
            return true;
        } else return Integer.compareUnsigned(number, 2) == 0;
    }

    /* Fast exponential algorithm */
    private static int doFastExp(int a_, int z, int n_) {
        long x = 1;
        long a = Integer.toUnsignedLong(a_);
        long n = Integer.toUnsignedLong(n_);

        while (z != 0) {
            while (z % 2 == 0) {
                z = z / 2;
                a = Long.remainderUnsigned(a*a, n);
            }
            z = z - 1;
            x = Long.remainderUnsigned(x*a, n);
        }
        return (int) x;
    }
}
