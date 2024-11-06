class Magazine extends LibraryItem {
    public Magazine(String title) {
        super(title);
    }

    public void display() {
        System.out.println("Magazine: " + title);
    }
}