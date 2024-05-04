package solidPatternwithDesignPattern;

public class Journal implements ResourceTypeBorrow {
    @Override
    public void borrow(String title) {
        System.out.println("Borrowing journal: " + title);
    }
}