package solidPatternwithDesignPattern;

public class ResourceType implements ResourceTypeBorrow {
    @Override
    public void borrow(Resources resources, String title) {
        System.out.println("Borrowing " + resources.getResourceType() + ": " + title);
    }
}