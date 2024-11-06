public class Main {
    public static void main(String[] args) {
        LibraryController controller = new LibraryController();
        LibraryItem book1 = ItemFactory.createItem("Book", "Design Patterns in Java");

        User user1 = new User("Alice");
        User user2 = new User("Bob");
        BookAvailabilityNotifier notifier = new BookAvailabilityNotifier();
        notifier.addObserver(user1);
        notifier.addObserver(user2);

        notifier.notifyObservers("The book 'Design Patterns in Java' is now available.");

        // Command pattern: Checkout and undo checkout
        controller.checkoutBook(book1);
        
        // Decorator pattern: Adding rare property to a book
        LibraryItem rareBook = new RareBookDecorator(book1);
        rareBook.display();
    }
}