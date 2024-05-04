package solidPatternwithDesignPattern;

public class Book implements ResourceTypeBorrow {
    @Override
    public void borrow(String title) {
        System.out.println("Borrowing book: " + title);
    }
}