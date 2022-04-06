package ro.ase.cts.prototype;

import java.util.ArrayList;

public class BookShop implements Cloneable{
    private String name;
    private ArrayList<Book> books;

    public BookShop() {
        books = new ArrayList<>();
    }

    public BookShop(String name, ArrayList<Book> books) {
        this.name = name;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }

    public static BookShop loadDataFromDB(String name) {
        BookShop bookShop = new BookShop();
        bookShop.name = name;
        Book book = null;
        for(int i = 0; i <10; i++) {
            book = new Book("Title" + i, "Eu", i*100);
            bookShop.books.add(book);
        }
        return bookShop;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        BookShop copy = new BookShop();
        copy.name = this.name;
        copy.books = (ArrayList<Book>) this.books.clone();
        return copy;
    }
}
