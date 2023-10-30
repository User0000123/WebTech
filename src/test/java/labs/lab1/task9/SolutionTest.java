package labs.lab1.task9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void testBasket(){
        Ball[] balls = new Ball[]{new Ball(Color.BLUE, 10),
                new Ball(Color.BLACK, 15),
                new Ball(Color.YELLOW, 5),
                new Ball(Color.BLUE, 25)};
        Basket basket = new Basket(balls);

        assertEquals(basket.getCountByColor(Color.BLACK), 1);
        assertEquals(basket.getCountByColor(Color.GREEN), 0);
        assertEquals(basket.getCountByColor(Color.BLUE), 2);

        assertEquals(basket.getWeightOfBasket(), 55);
        basket.addBall(new Ball(Color.GREEN, 10));
        assertEquals(basket.getWeightOfBasket(), 65);
        basket.deleteBall(0);
        assertEquals(basket.getWeightOfBasket(), 55);
    }
}
