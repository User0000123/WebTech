package labs.lab1.task9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Basket {

    private static final double MAX_BALL_WEIGHT = 10;

    private final ArrayList<Ball> balls = new ArrayList<>();

    public Basket(){}

    public Basket(int ballsCount) {
        fillTheBasket(ballsCount);
    }

    public Basket(Ball[] ballsToAdd) {
        balls.addAll(Arrays.asList(ballsToAdd));
    }

    public void addBall(Ball ball){
        balls.add(ball);
    }

    public void deleteBall(int index){
        balls.remove(index);
    }

    public void fillTheBasket(int ballsCount){
        for (int i = 0; i < ballsCount; i++){
            balls.add(new Ball(Color.getRandomColor(), ThreadLocalRandom.current().nextDouble(MAX_BALL_WEIGHT)));
        }
    }

    public double getWeightOfBasket(){
        double weight = 0;

        for (Ball ball : balls){
            weight += ball.getWeight();
        }

        return weight;
    }

    public int getCountByColor(Color color){
        int countFilteredBalls = 0;

        for (Ball ball : balls) {
            if (ball.getColor() == color) {
                countFilteredBalls++;
            }
        }

        return countFilteredBalls;
    }
}
