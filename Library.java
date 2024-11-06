import java.util.ArrayList;
import java.util.List;

public class Library {
    private static Library instance;
    private List<LibraryItem> items;

    private Library() {
        items = new ArrayList<>();
    }

    public static Library getInstance() {
        if (instance == null) {
            instance = new Library();
        }
        return instance;
    }

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void removeItem(LibraryItem item) {
        items.remove(item);
    }

    public List<LibraryItem> getItems() {
        return items;
    }
}
