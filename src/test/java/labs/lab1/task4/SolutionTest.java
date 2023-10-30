package labs.lab1.task4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testPrimeGetIndexesOfPrimeNumbers() {
        int[] testPrimes = {2909, 2917, 2927, 2939,	2953, 2957,	2963, 2969, 2971, 2999, 3001, 3011, 3019, 3023, 3037,
                            3041, 3049,	3061, 3067, 3079,  19, 37, 61, 127, 271, 331, 397, 547, 631, 919, 1657, 1801,
                1951, 2269, 2437, 2791, 3169, 3571, 4219, 4447, 5167, 5419, 6211, 7057, 7351, 8269, 9241, 10267, 11719,
                12097, 13267, 13669, 16651, 19441, 19927, 22447, 23497, 24571, 25117, 26227, 27361, 33391, 35317};
        List<Integer> result = IntStream.range(0, testPrimes.length).boxed().toList();

        assertEquals(result, Solution.getIndexesOfPrimeNumbers(testPrimes));
    }

    @Test
    void testCompoundGetIndexesOfPrimeNumbers() {
        int[] testCompound = {4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20, 21, 22, 24, 25, 26, 27, 28, 30, 32, 33, 34, 35,
                36, 38, 39, 40, 42, 44, 45, 46, 48, 49, 50, 51, 52, 54, 55, 56, 57, 58, 60, 62, 63, 64, 65, 66, 68, 69,
                70, 72, 74, 75, 76, 77, 78, 80, 81,82, 84, 85, 86, 87, 88, 90, 91, 92, 93, 94, 95, 96, 98, 99, 100};
        List<Integer> result = new ArrayList<>();

        assertEquals(result, Solution.getIndexesOfPrimeNumbers(testCompound));
    }
}