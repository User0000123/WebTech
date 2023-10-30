package labs.lab1.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    private static final double EPSILON = 5.98E-08;

    @Test
    public void testExpressionSolving(){
        double[] x = {0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1.0, 1.1, 1.2, 1.3, 1.4, 1.5};
        double[] y = {0.100334672, 0.202710036, 0.30933625, 0.422793219, 0.54630249, 0.684136808, 0.84228838,
                1.029638557, 1.260158218, 1.557407725, 1.964759657, 2.572151622, 3.602102448, 5.797883715, 14.10141995};
        Solution.solveFunction(0.1, 1.5, 0.1, Math::tan);

        for (int i = 0; i < x.length; i++){
            assertTrue(Math.abs(y[i]/Solution.getRow(i).value() - 1) < EPSILON);
            assertTrue(Math.abs(x[i]/Solution.getRow(i).arg() - 1) < EPSILON);
        }
    }
}
