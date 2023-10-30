package labs.lab1.task15;

import java.util.Objects;

public class Book implements Comparable<Book>{
    private static int edition;

    private String title;
    private String author;
    private int price;
    private int isbn;

    public Book(){}

    public Book(String title, String author, int price, int isbn){
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
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

    public void setIsbn(int isbn){
        this.isbn = isbn;
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

    public int getIsbn(){
        return this.getIsbn();
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
            return title.contentEquals(book.title) && author.contentEquals(book.author)
                    && price == book.price && isbn == book.isbn;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price, edition, isbn);
    }

    @Override
    public String toString() {
        return getClass().getName() +"{"+ "Title:'" + title + "';"
                +"Author:'" + author + "';"
                +"Price:'" + price + "';"
                +"Isbn:'" + isbn + "'}";
    }

    public static void main(String[] args) {
        Book book1 = new Book("Las Vegas", "John Doe", 123, 133);
        Book book2 = new Book("Las Vegas", "John Doe", 123, 1235);
        System.out.println(book1.compareTo(book2));
    }

    @Override
    public int compareTo(Book o) {
        return Integer.compare(isbn, o.isbn);
    }
}
