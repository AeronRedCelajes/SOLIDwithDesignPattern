package solidPatternwithDesignPattern;

public class ResourceTypeBorrow implements BorrowAction {
    @Override
    public void borrow(Resources resources, String title) {
        System.out.println("Borrowing " + resources.getResourceType() + ": " + title);
    }
}