package labs.lab1.task13;

import labs.lab1.task15.Book;

import java.util.Objects;

public class ProgrammerBook extends Book {

    private String language;
    private int level;

    public ProgrammerBook(){}

    public ProgrammerBook(String title, String author, int price, String language, int level) {
        super(title, author, price);

        this.language = language;
        this.level = level;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getLanguage(){
        return this.language;
    }

    public int getLevel(){
        return this.level;
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

        ProgrammerBook programmerBook = (ProgrammerBook) obj;
        if (super.equals(programmerBook)) {
            return language.contentEquals(programmerBook.language) && this.level == programmerBook.level;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.language, this.level);
    }

    @Override
    public String toString() {
        return getClass().getName() +"{"+ "Title:'" + super.getTitle() + "';"
                +"Author:'" + super.getAuthor() + "';"
                +"Price:'" + super.getPrice() + "';"
                + "Language:'" + this.language + "';"
                + "Level:'" + this.level + "'}";
    }

    public static void main(String[] args) {
        ProgrammerBook programmerBook1 = new ProgrammerBook("Las Vegas", "John Doe", 123, "English", 12);
        ProgrammerBook programmerBook2 = new ProgrammerBook("Las Vegas", "John Doe", 123, "English", 12);

        System.out.println(programmerBook1.equals(programmerBook2));
    }
}
