package solidPatternwithDesignPattern;

import java.util.*;

public class ResourceTest {
    public static void main(String[] args) {
        Map<String, BorrowAction> resourceTypes = new HashMap<>();
        resourceTypes.put("book", new ResourceTypeBorrow());
        resourceTypes.put("journal", new ResourceTypeBorrow());
        resourceTypes.put("thesis", new ResourceTypeBorrow());
        resourceTypes.put("audio book", new ResourceTypeBorrow());
        // This is where adding more resourceTypes as needed for the future

        Student student = new Student(resourceTypes);

        Resources book = new Resources("book", "Don Quixote");
        Resources journal = new Resources("journal", "Diary of a Wimpy Kid");
        Resources thesis = new Resources("thesis", "Einstein's thesis");
        Resources audioBook = new Resources("audio book", "Funny Story");

        student.borrowResource(book);
        student.borrowResource(journal);
        student.borrowResource(thesis);
        student.borrowResource(audioBook);
    }
}