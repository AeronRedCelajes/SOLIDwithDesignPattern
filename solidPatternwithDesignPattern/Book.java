package solidPatternwithDesignPattern;

public class Book implements ResourceType {
    @Override
    public void borrow(String title) {
        System.out.println("Borrowing book: " + title);
    }
}