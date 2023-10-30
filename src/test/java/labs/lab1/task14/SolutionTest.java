package labs.lab1.task14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testCloning(){
        Book book1 = new Book("Las Vegas", "John Doe", 123);
        Book book2 = new Book("Example Book", "Author", 0);
        Book book3 = new Book("LV", "JD", 123);
        Book book4 = new Book("", "", 0);

        try {
            Book book1clone = ((Book) book1.clone());
            Book book2clone = ((Book) book2.clone());

            assertEquals(book1, book1clone);
            assertEquals(book2, book2clone);
            assertEquals(book3, book3.clone());
            assertEquals(book4, book4.clone());

            assertNotSame(book1, book1clone);
            assertNotSame(book2, book2clone);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
