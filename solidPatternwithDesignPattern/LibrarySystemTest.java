package solidPatternwithDesignPattern;

import java.util.*;

public class LibrarySystemTest {
    public static void main(String[] args) {

        Map<String, ResourceBorrow> resourceTypes = new HashMap<>();
        resourceTypes.put("book", new Book());
        resourceTypes.put("journal", new Journal());

        // This is where to create students
        Student student1 = new Student("Aeron");
        Student student2 = new Student("Jage");

        // This is where to create resource types
        ResourceType book1 = new ResourceType("book","Fairy Tail Manga");
        ResourceType journal1 = new ResourceType("journal","My Journal in NEU");
        ResourceType book2 = new ResourceType("book","One Piece Manga");
        ResourceType journal2 = new ResourceType("journal","My Funny Journal");

        ResourceProcessor resourceProcessor = new ResourceProcessor(resourceTypes);

        resourceProcessor.borrowResource(student1, book1);
        System.out.println();

        resourceProcessor.borrowResource(student2, journal1);
        System.out.println();

        resourceProcessor.borrowResource(student2, book2);
        System.out.println();

        resourceProcessor.borrowResource(student1, journal2);
    }
}