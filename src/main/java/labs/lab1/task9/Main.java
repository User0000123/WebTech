package labs.lab1.task9;

public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket(10);

        System.out.println(basket.getWeightOfBasket());
        System.out.println(basket.getCountByColor(Color.BLUE));
    }
}
