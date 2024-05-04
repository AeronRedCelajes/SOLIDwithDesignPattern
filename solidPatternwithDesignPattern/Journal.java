package solidPatternwithDesignPattern;

public class Journal implements ResourceType {
    @Override
    public void borrow(String title) {
        System.out.println("Borrowing journal: " + title);
    }
}