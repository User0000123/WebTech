package labs.lab1.task15;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testComparable() {
        Book[] books = new Book[10];

        for (int i = 0; i < books.length; i++) {
            books[i] = new Book("", "", 1, ThreadLocalRandom.current().nextInt());
        }
        Arrays.sort(books);

        for (int i = 0; i < books.length - 1; i++) {
            assertTrue(books[i + 1].getIsbn() >= books[i].getIsbn());
        }
    }
}
