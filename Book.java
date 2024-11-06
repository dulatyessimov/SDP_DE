class Book extends LibraryItem {
    public Book(String title) {
        super(title);
    }

    public void display() {
        System.out.println("Book: " + title);
    }
}