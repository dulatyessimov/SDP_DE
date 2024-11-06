class RareBookDecorator extends BookDecorator {
    public RareBookDecorator(LibraryItem book) {
        super(book);
    }

    public void display() {
        book.display();
        System.out.println("This is a rare book.");
    }
}