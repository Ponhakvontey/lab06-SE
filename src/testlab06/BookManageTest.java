package testlab06;
import org.junit.jupiter.api.Test;

import lab6.Book;
import lab6.BookManage;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class BookManageTest {

    @Test
    public void testAddBook() {
        BookManage bookManage = new BookManage();
        Book book = new Book("Book A", "Author A", 10.0);
        bookManage.addBook(book);
        List<Book> books = bookManage.getBooks();
        assertEquals(1, books.size());
        assertEquals(book, books.get(0));
    }

    @Test
    public void testListBooks() {
        BookManage bookManage = new BookManage();
        bookManage.addBook(new Book("Book A", "Author A", 10.0));
        bookManage.addBook(new Book("Book B", "Author B", 15.0));
        assertEquals(2, bookManage.getBooks().size());
    }

    @Test
    public void testUpdateBook() {
        BookManage bookManage = new BookManage();
        bookManage.addBook(new Book("Book A", "Author A", 10.0));
        bookManage.updateBook(0, new Book("Updated Book", "Updated Author", 20.0));
        assertEquals("Updated Book", bookManage.getBooks().get(0).getTitle());
    }

    @Test
    public void testDeleteBook() {
        BookManage bookManage = new BookManage();
        bookManage.addBook(new Book("Book A", "Author A", 10.0));
        bookManage.deleteBook(0);
        assertTrue(bookManage.getBooks().isEmpty());
    }

    @Test
    public void testDeleteAllBooks() {
        BookManage bookManage = new BookManage();
        bookManage.addBook(new Book("Book A", "Author A", 10.0));
        bookManage.addBook(new Book("Book B", "Author B", 15.0));
        bookManage.deleteAllBooks();
        assertTrue(bookManage.getBooks().isEmpty());
    }
}
