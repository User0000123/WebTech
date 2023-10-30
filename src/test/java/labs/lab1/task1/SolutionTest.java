package labs.lab1.task1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    private static final double EPSILON = 5.98E-08;

    @Test
    public void testFunction(){
        double[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] y = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        double [] result = {1.392274945, 2.493214051, 3.288715649, 4.195624062, 5.286165214, 6.147192635, 7.158175577,
                8.19248791, 9.092969977, 10.14168557};

        for (int i = 0; i < x.length; i++){
            assertTrue(Math.abs(result[i]/Solution.solveExpression(x[i], y[i]) - 1) < EPSILON);
        }
    }
}
