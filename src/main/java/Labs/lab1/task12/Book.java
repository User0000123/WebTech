package Labs.lab1.task12;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj instanceof Book book){
            return this.author.contentEquals(book.author)
                    && this.price == book.price
                    && this.title.contentEquals(book.title);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        final int SEED = 1731;
        int result = 589;

        result = SEED * (result * price + edition) * (price * result + edition * result);
        for (byte bt : author.getBytes()) result += bt;
        for (byte bt : title.getBytes()) result += bt;

        return result;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\n"
                +"Author: " + author + "\n"
                +"Price: " + price + "\n"
                +"Edition: " + edition + "\n";
    }

    public static void main(String[] args) {
        Book book = new Book("Las Vegas", "John Doe", 123);
        System.out.println(book.hashCode());
    }
}
