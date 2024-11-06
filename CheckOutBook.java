class CheckoutBookCommand implements Command {
    private LibraryItem book;

    public CheckoutBookCommand(LibraryItem book) {
        this.book = book;
    }

    public void execute() {
        System.out.println("Checking out book: " + book.title);
    }

    public void undo() {
        System.out.println("Undo checkout of book: " + book.title);
    }
}