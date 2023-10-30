package labs.lab1.task16;

import labs.lab1.task12.Book;

import java.util.Comparator;

public class Comparators {

    public static Comparator<Book> getComparatorByTitle(){
        return new ComparatorByTitle();
    }

    public static Comparator<Book> getComparatorByTitleAuthor(){
        return new ComparatorByTitle().thenComparing(new ComparatorByAuthor());
    }

    public static Comparator<Book> getComparatorByAuthorTitle(){
        return new ComparatorByAuthor().thenComparing(new ComparatorByTitle());
    }

    public static Comparator<Book> getComparatorByAuthorTitlePrice(){
        return getComparatorByAuthorTitle().thenComparing(new ComparatorByPrice());
    }
}
