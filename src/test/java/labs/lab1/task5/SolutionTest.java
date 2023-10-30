package labs.lab1.task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void testMinimumValues(){
        int[][] tables = new int[][]{
                {1,1,1,1,1},
                {-1, 2, -3, 4, 5},
                {0},
                {0, 34, -4, -4, 35},
                {5, 4, 3, 2, 1}
            };
        int[] results = {4, 1, 0, 2, 4};

        for (int i = 0; i < results.length; i++){
            assertEquals(results[i], Solution.getMinimumKToDelete(tables[i]));
        }
    }
}
