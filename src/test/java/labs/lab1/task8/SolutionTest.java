package labs.lab1.task8;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void testIndexesToInsert(){
        double[][] a = new double[][]{
                {0, 1, 2, 3, 4},
                {2, 6, 6, 7, 8},
                {5, 6, 9, 9, 15}
        };
        double[][] b = new double[][]{
                {-1, 3, 4, 5, 6, 7, 8},
                {5, 9, 9, 9, 12, 13, 14},
                {-10, 2, 4, 5, 6 , 7, 8}
        };
        ArrayList<ArrayList<Integer>> results = new ArrayList<>(){};

        results.add(new ArrayList<>(Arrays.stream(new int[]{0, 3, 4, 6, 6, 6, 6}).boxed().toList()));
        results.add(new ArrayList<>(Arrays.stream(new int[]{1, 6, 6, 6, 6, 6, 6}).boxed().toList()));
        results.add(new ArrayList<>(Arrays.stream(new int[]{0, 0, 0, 0, 1, 2, 2}).boxed().toList()));

        for (int i = 0; i < a.length; i++){
            assertEquals(results.get(i), Solution.getIndexesToInsert(a[i], b[i]));
        }
    }
}
