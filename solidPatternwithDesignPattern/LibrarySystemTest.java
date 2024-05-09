package solidPatternwithDesignPattern;

import java.util.*;

public class LibrarySystemTest {
    public static void main(String[] args) {

        // This is where adding more resourceTypes as needed for the future
        Map<String, ResourceBorrow> resourceTypes = new HashMap<>();
        resourceTypes.put("book", new ResourceType());
        resourceTypes.put("journal", new ResourceType());
        resourceTypes.put("thesis", new ResourceType());
        resourceTypes.put("audio book", new ResourceType());

        // This is where to create students
        Student student1 = new Student("Aeron");
        Student student2 = new Student("Jage");
        Student student3 = new Student("Hans");

        // This is where to create resource types
        Resources book1 = new Resources("book", "Fairy Tail Manga");
        Resources journal = new Resources("journal", "My Journal in NEU");
        Resources thesis = new Resources("thesis", "Research About The Universe");
        Resources audioBook = new Resources("audio book", "My Funny Story");

        ResourceProcessor resourceProcessor = new ResourceProcessor(resourceTypes);

        resourceProcessor.borrowResource(student1, book1);
        System.out.println();

        resourceProcessor.borrowResource(student2, journal);
        System.out.println();

        resourceProcessor.borrowResource(student2, thesis);
        System.out.println();

        resourceProcessor.borrowResource(student3, audioBook);
    }
}