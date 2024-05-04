package solidPatternwithDesignPattern;

import java.util.*;

public class ResourceTest {
    public static void main(String[] args) {
        Map<String, ResourceType> resourceTypes = new HashMap<>();
        resourceTypes.put("book", new Book());
        resourceTypes.put("journal", new Journal());
        // This is where adding more resourceTypes as needed for the future

        Student student = new Student(resourceTypes);

        Resources book = new Resources("book", "Don Quixote");
        Resources journal = new Resources("journal", "Diary of a Wimpy Kid");

        student.borrowResource(book);
        student.borrowResource(journal);
    }
}
