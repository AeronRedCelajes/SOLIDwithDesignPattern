package solidPatternwithDesignPattern;

public class ResourceType implements ResourceBorrow {
    @Override
    public void borrow(Resources resources, String title) {
        System.out.println("Borrowing " + resources.getResourceType() + ": " + title);
    }
}