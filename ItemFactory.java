class ItemFactory {
    public static LibraryItem createItem(String type, String title) {
        switch (type) {
            case "Book":
                return new Book(title);
            case "Magazine":
                return new Magazine(title);
            default:
                throw new IllegalArgumentException("Unknown type");
        }
    }
}