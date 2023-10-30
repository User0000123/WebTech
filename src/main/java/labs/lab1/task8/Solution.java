package labs.lab1.task8;

import java.util.ArrayList;

public class Solution {

    public static ArrayList<Integer> getIndexesToInsert(double[] a, double[] b) {
        ArrayList<Integer> indexesToInsert = new ArrayList<>();
        int aCurrentPosition = 0;
        int bPosition = 0;

        if (a.length == 0 || b.length == 0) return null;


        while (bPosition < b.length) {

            /* searching for element in the A-array that is not less than current B-element */
            while (aCurrentPosition < a.length && a[aCurrentPosition] < b[bPosition]) {
                aCurrentPosition++;
            }

            if (aCurrentPosition >= a.length) {

                /* Adding all remaining elements of B-array as added before non-existing index of A-array */
                for (;bPosition < b.length; bPosition++) {
                    indexesToInsert.add(aCurrentPosition + 1);
                }
                break;
            } else {
                indexesToInsert.add(aCurrentPosition);
                bPosition++;
            }
        }

        return indexesToInsert;
    }

    public static void main(String[] args) {
        System.out.println(getIndexesToInsert(new double[]{0, 1, 2, 3, 4}, new double[]{-1, 3, 4, 5, 6 , 7, 8}));
    }
}
