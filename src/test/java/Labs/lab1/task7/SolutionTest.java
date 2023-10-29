package Labs.lab1.task7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void testSortArray() {
        double[] initialArray = {234, 4, 1, 32, 0, 2, 62, 1345, 4, 7, 0};
        double[] sortedArray = {0, 0, 1, 2, 4, 4, 7, 32, 62, 234, 1345};

        assertArrayEquals(sortedArray, Solution.sortArray(initialArray));
    }
}
