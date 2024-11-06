public class LibraryController {
    private LibraryService libraryService = new LibraryService();

    public void addBook(String title) {
        libraryService.addBook(title);
    }

    public void checkoutBook(LibraryItem book) {
        libraryService.checkoutBook(book);
    }
}