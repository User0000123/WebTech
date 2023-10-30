package labs.lab1.task16;

import labs.lab1.task12.Book;

import java.util.Comparator;

public class ComparatorByAuthor implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getAuthor().compareTo(o2.getAuthor());
    }
}
