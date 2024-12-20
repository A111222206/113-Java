public class PhysicalBook extends Book {
    private String shelflcation;

    public PhysicalBook(String title, String author, String shelflcation) {
        super(title, author);
        this.shelflcation = shelflcation;
    }

    public String getShelflcation() {
        return shelflcation;
    }

    @Override
    public String toString() {
        return super.toString() + "書架位置: " + shelflcation;
    }
}
