abstract class BookDecorator extends LibraryItem {
    protected LibraryItem book;

    public BookDecorator(LibraryItem book) {
        super(book.title);
        this.book = book;
    }

    public abstract void display();
}