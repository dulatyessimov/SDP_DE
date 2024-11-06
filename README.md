# SDP_DE

1. Overview of the System Architecture
This project is structured around the Model-View-Controller (MVC) pattern, providing a modular, well-organized system. It uses a Library Management System (LMS) as a real-world scenario where a library’s items, users, and interactions are modeled. Key goals include efficient book management, user notification on book availability, simplified interfaces, and extendable functionalities like adding new item types.
Main Components:
•	Model: Manages data related to library items, users, and their statuses.
•	View: Not directly implemented here, as this is a command-line project. The main class functions as a minimal interface.
•	Controller: LibraryController controls interactions between the user interface and the backend (library service and items).
________________________________________
2. Design Patterns and Their Role
1.	Singleton Pattern (Library):
o	Ensures only one instance of the library exists to avoid multiple instances that could cause inconsistencies in item data.
o	Provides centralized control over all library items.
2.	Factory Method Pattern (ItemFactory):
o	Creates library items based on a specified type (e.g., book, magazine) using the factory method.
o	This makes it easy to add new item types without modifying the core code, adhering to the Open/Closed Principle.
3.	Decorator Pattern (RareBookDecorator):
o	Dynamically adds "rare" status to books, enhancing item properties without modifying the Book class itself.
o	Provides flexibility in item management, allowing us to extend functionality for special collections or rare items.
4.	Observer Pattern (User, BookAvailabilityNotifier):
o	Notifies users of changes (like new book availability) via observer notifications.
o	Useful in scenarios where users can subscribe to library updates and be notified without actively checking.
5.	Command Pattern (CheckoutBookCommand):
o	Encapsulates checkout actions, with support for undo functionality.
o	Adds flexibility for managing user actions in the library, allowing for reversible operations.
6.	Facade Pattern (LibraryService):
o	Simplifies interaction with the library by centralizing key functions like addBook() and checkoutBook().
o	Provides a streamlined API, hiding underlying complexity and making it easier for clients to use the system.
________________________________________
3. UML Diagrams
Below is a description of the UML structure for each pattern:
•	Singleton Pattern UML: Library class has a static instance and provides a global getInstance method.
•	Factory Method Pattern UML: LibraryItem (abstract) is extended by Book and Magazine. ItemFactory handles the creation of these items.
•	Decorator Pattern UML: RareBookDecorator extends BookDecorator, which wraps around LibraryItem.
•	Observer Pattern UML: BookAvailabilityNotifier maintains a list of User observers and notifies them.
•	Command Pattern UML: CheckoutBookCommand implements Command, with execute and undo.
•	Facade Pattern UML: LibraryService interacts with Library and BookAvailabilityNotifier to provide a simplified interface.
4. Usage Instructions
1.	Setup:
o	Ensure Java Development Kit (JDK) is installed.
o	Clone the repository and navigate to the project directory.
2.	Compile and Run:
o	Compile the Java files: javac *.java.
o	Run the main program: java Main.
3.	Main Commands:
o	Add Item: LibraryController uses ItemFactory to add new items to the library.
o	Checkout Item: Uses CheckoutBookCommand to checkout a book and can undo() this checkout.
o	Mark Item as Rare: Use RareBookDecorator to dynamically mark a book as rare.
o	User Notifications: Register User objects to receive notifications on new book additions.
________________________________________
5. Assumptions and Limitations
Assumptions
•	Single Library Instance: The system assumes a single library instance for all items.
•	Simplified Interface: No graphical user interface (GUI) was implemented, as the focus is on the backend structure.
•	Limited Item Types: Only Book and Magazine are implemented, but more can be added easily with the ItemFactory.
Limitations
•	No Database: This system does not store data in a database. All data is stored in memory, so data is lost when the application closes.
•	Command-Line Interface: The main class acts as a command-line interface, limiting user interaction. GUI could enhance usability.
•	Undo Functionality: Currently limited to book checkout. Extending this to other commands could improve user control.
________________________________________
6. Conclusion
This LMS project demonstrates the effective application of several design patterns in a cohesive and modular structure. Each pattern’s role is clearly defined, contributing to code flexibility, ease of maintenance, and adherence to good software engineering principles. Future improvements could involve integrating a database, adding more item types, and developing a GUI for enhanced user experience.

