package lab6;
import java.util.ArrayList;
import java.util.List;

public class BookManage {
    private List<Book> books;

    // Constructor
    public BookManage() {
        books = new ArrayList<>();
    }

    // List all books
    public List<Book> getBooks() {
        return books;
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (int i = 0; i < books.size(); i++) {
                System.out.println((i + 1) + ". " + books.get(i));
            }
        }
    }

    // Add a new book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    // Update an existing book by index
    public void updateBook(int index, Book updatedBook) {
        if (index >= 0 && index < books.size()) {
            books.set(index, updatedBook);
            System.out.println("Book updated successfully.");
        } else {
            System.out.println("Invalid index. No book updated.");
        }
    }

    // Delete a book by index
    public void deleteBook(int index) {
        if (index >= 0 && index < books.size()) {
            books.remove(index);
            System.out.println("Book deleted successfully.");
        } else {
            System.out.println("Invalid index. No book deleted.");
        }
    }

    // Delete all books
    public void deleteAllBooks() {
        books.clear();
        System.out.println("All books have been deleted.");
    }
}
