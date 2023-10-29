package Labs.lab1.task9;

import java.util.concurrent.ThreadLocalRandom;

public enum Color {
    BLUE, GREEN, ORANGE, BLACK, YELLOW;

    public static Color getRandomColor(){
        return Color.values()[ThreadLocalRandom.current().nextInt(Color.values().length)];
    }
}
