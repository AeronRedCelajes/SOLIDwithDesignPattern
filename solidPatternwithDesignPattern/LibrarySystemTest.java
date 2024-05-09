package solidPatternwithDesignPattern;

public class LibrarySystemTest {
    public static void main(String[] args) {

        // This is where to create students
        Student student1 = new Student("Aeron");
        Student student2 = new Student("Cesar");

        // This is where to create resource types
        ResourceType bookType1 = new ResourceType("Fairy Tail Manga");
        ResourceType bookType2 = new ResourceType("One Piece Manga");
        ResourceType journalType1 = new ResourceType("My Journal");
        ResourceType journalType2 = new ResourceType("My Journey To NEU");

        // This is where the resource types can use actions
        ResourceBorrow bookBorrower = new Book();
        ResourceBorrow journalBorrower = new Journal();

        bookBorrower.borrowResource(student1, bookType1);
        System.out.println();

        bookBorrower.borrowResource(student2, bookType2);
        System.out.println();

        journalBorrower.borrowResource(student2, journalType1);
        System.out.println();

        journalBorrower.borrowResource(student1, journalType2);
        System.out.println();
    }
}