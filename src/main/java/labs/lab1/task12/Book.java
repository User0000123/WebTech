package labs.lab1.task12;

import java.util.Objects;

public class Book {

    private static int edition;

    private String title;
    private String author;
    private int price;

    public Book(){}

    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPrice() {
        return this.price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (null == obj) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Book book = (Book) obj;
        if (book.hashCode() == this.hashCode()) {
            return title.contentEquals(book.title) && author.contentEquals(book.author) && price == book.price;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price, edition);
    }

    @Override
    public String toString() {
        return getClass().getName() +"{"+ "Title:'" + title + "';"
                +"Author:'" + author + "';"
                +"Price:'" + price + "'}";
    }

    public static void main(String[] args) {
        Book book1 = new Book("Las Vegas", "John Doe", 123);
        Book book2 = new Book("Las Vegas", "John Doe", 123);
        System.out.println(book1.equals(book2));
    }
}
