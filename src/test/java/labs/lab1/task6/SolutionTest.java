package labs.lab1.task6;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void testMatrixGeneration() {
        double[] array1 = {1, 2, 3.4, 4, 5, 6, 7};
        double[] array2 = {2.3, 4.5, 7.8, 9.4, 0, 1.2, 3.4};
        double[] array3 = {5.67, 3, 3.6, 8, 4.3, 5.6, 4.5};

        double[][] resultA1 = {
                {1, 2, 3.4, 4, 5, 6, 7},
                {2, 3.4, 4, 5, 6, 7, 1},
                {3.4, 4, 5, 6, 7, 1, 2},
                {4, 5, 6, 7, 1, 2, 3.4},
                {5, 6, 7, 1, 2, 3.4, 4},
                {6, 7, 1, 2, 3.4, 4, 5},
                {7, 1, 2, 3.4, 4, 5, 6}
        };
        double[][] resultA2 = {
                {2.3, 4.5, 7.8, 9.4, 0, 1.2, 3.4},
                {4.5, 7.8, 9.4, 0, 1.2, 3.4, 2.3},
                {7.8, 9.4, 0, 1.2, 3.4, 2.3, 4.5},
                {9.4, 0, 1.2, 3.4, 2.3, 4.5, 7.8},
                {0, 1.2, 3.4, 2.3, 4.5, 7.8, 9.4},
                {1.2, 3.4, 2.3, 4.5, 7.8, 9.4, 0},
                {3.4, 2.3, 4.5, 7.8, 9.4, 0, 1.2}
        };
        double[][] resultA3 = {
                {5.67, 3, 3.6, 8, 4.3, 5.6, 4.5},
                {3, 3.6, 8, 4.3, 5.6, 4.5, 5.67},
                {3.6, 8, 4.3, 5.6, 4.5, 5.67, 3},
                {8, 4.3, 5.6, 4.5, 5.67, 3, 3.6},
                {4.3, 5.6, 4.5, 5.67, 3, 3.6, 8},
                {5.6, 4.5, 5.67, 3, 3.6, 8, 4.3},
                {4.5, 5.67, 3, 3.6, 8, 4.3, 5.6}
        };

        assertTrue(Arrays.deepEquals(resultA1, Solution.getSquareMatrix(array1)));
        assertTrue(Arrays.deepEquals(resultA2, Solution.getSquareMatrix(array2)));
        assertTrue(Arrays.deepEquals(resultA3, Solution.getSquareMatrix(array3)));
    }
}
