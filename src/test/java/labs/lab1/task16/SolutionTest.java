package labs.lab1.task16;

import labs.lab1.task12.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class SolutionTest {

    private final ArrayList<Book> test = new ArrayList<>();

    @BeforeEach
    public void initializeTestList(){
        test.clear();
        test.add(new Book("Title 1", "Author A", 1));
        test.add(new Book("Title 4", "Author B", 5));
        test.add(new Book("Title 2", "Author C", 2));
        test.add(new Book("Title 2", "Author G", 4));
        test.add(new Book("Title 2", "Author A", 1));
        test.add(new Book("Title 2", "Author C", 5));
        test.add(new Book("Title 5", "Author E", 3));
    }

    @Test
    public void testComparatorByTitle() {
        ArrayList<Book> testByTitleExpected = new ArrayList<>();
        testByTitleExpected.add(new Book("Title 1", "Author A", 1));
        testByTitleExpected.add(new Book("Title 2", "Author C", 2));
        testByTitleExpected.add(new Book("Title 2", "Author G", 4));
        testByTitleExpected.add(new Book("Title 2", "Author A", 1));
        testByTitleExpected.add(new Book("Title 2", "Author C", 5));
        testByTitleExpected.add(new Book("Title 4", "Author B", 5));
        testByTitleExpected.add(new Book("Title 5", "Author E", 3));

        test.sort(Comparators.getComparatorByTitle());
        assertEquals(test, testByTitleExpected);
    }

    @Test
    public void testComparatorByTitleAuthor() {
        ArrayList<Book> testByTitleAuthorExpected = new ArrayList<>();
        testByTitleAuthorExpected.add(new Book("Title 1", "Author A", 1));
        testByTitleAuthorExpected.add(new Book("Title 2", "Author A", 1));
        testByTitleAuthorExpected.add(new Book("Title 2", "Author C", 2));
        testByTitleAuthorExpected.add(new Book("Title 2", "Author C", 5));
        testByTitleAuthorExpected.add(new Book("Title 2", "Author G", 4));
        testByTitleAuthorExpected.add(new Book("Title 4", "Author B", 5));
        testByTitleAuthorExpected.add(new Book("Title 5", "Author E", 3));

        test.sort(Comparators.getComparatorByTitleAuthor());
        assertEquals(test, testByTitleAuthorExpected);
    }

    @Test
    public void testComparatorByAuthorTitle() {
        ArrayList<Book> testByAuthorTitleExpected = new ArrayList<>();
        testByAuthorTitleExpected.add(new Book("Title 1", "Author A", 1));
        testByAuthorTitleExpected.add(new Book("Title 2", "Author A", 1));
        testByAuthorTitleExpected.add(new Book("Title 4", "Author B", 5));
        testByAuthorTitleExpected.add(new Book("Title 2", "Author C", 2));
        testByAuthorTitleExpected.add(new Book("Title 2", "Author C", 5));
        testByAuthorTitleExpected.add(new Book("Title 5", "Author E", 3));
        testByAuthorTitleExpected.add(new Book("Title 2", "Author G", 4));

        test.sort(Comparators.getComparatorByAuthorTitle());
        assertEquals(test, testByAuthorTitleExpected);
    }

    @Test
    public void testComparatorByAuthorTitlePrice() {
        ArrayList<Book> testByAuthorTitlePriceExpected = new ArrayList<>();
        testByAuthorTitlePriceExpected.add(new Book("Title 1", "Author A", 1));
        testByAuthorTitlePriceExpected.add(new Book("Title 2", "Author A", 1));
        testByAuthorTitlePriceExpected.add(new Book("Title 4", "Author B", 5));
        testByAuthorTitlePriceExpected.add(new Book("Title 2", "Author C", 2));
        testByAuthorTitlePriceExpected.add(new Book("Title 2", "Author C", 5));
        testByAuthorTitlePriceExpected.add(new Book("Title 5", "Author E", 3));
        testByAuthorTitlePriceExpected.add(new Book("Title 2", "Author G", 4));

        test.sort(Comparators.getComparatorByAuthorTitlePrice());
        assertEquals(test, testByAuthorTitlePriceExpected);
    }
}
