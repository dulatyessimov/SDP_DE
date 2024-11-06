public class LibraryService {
    private Library library = Library.getInstance();
    private BookAvailabilityNotifier notifier = new BookAvailabilityNotifier();

    public void addBook(String title) {
        LibraryItem book = ItemFactory.createItem("Book", title);
        library.addItem(book);
        notifier.notifyObservers("A new book titled '" + title + "' is available.");
    }

    public void checkoutBook(LibraryItem book) {
        Command checkoutCommand = new CheckoutBookCommand(book);
        checkoutCommand.execute();
    }

    public void returnBook(LibraryItem book) {
        System.out.println("Returning book: " + book.title);
        library.addItem(book);
    }
}