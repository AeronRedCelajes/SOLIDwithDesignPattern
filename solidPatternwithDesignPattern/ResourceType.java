package solidPatternwithDesignPattern;

public class ResourceType implements BorrowAction {
    @Override
    public void borrow(Resources resources, String title) {
        System.out.println("Borrowing " + resources.getResourceType() + ": " + title);
    }
}