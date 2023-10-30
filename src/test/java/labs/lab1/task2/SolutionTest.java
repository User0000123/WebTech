package labs.lab1.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testIntersections(){
        Solution.initializeRectangles();
        Point[] points = new Point[]{new Point(1,1),
                new Point(5, 1), new Point(1, 5), new Point(1,6), new Point(-100, -100)};
        boolean[] results = new boolean[]{true, false, true, false, false};

        for (int i = 0; i < points.length; i++){
            assertEquals(Solution.isBelongsToRegion(points[i].x, points[i].y), results[i]);
        }
    }
    private record Point(int x, int y){}
}
