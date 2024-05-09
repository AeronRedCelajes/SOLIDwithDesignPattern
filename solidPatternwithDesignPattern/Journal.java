package solidPatternwithDesignPattern;

public class Journal implements ResourceBorrow {
    public void borrowResource(Student student, ResourceType resourceType) {
        System.out.println(student.getName() + " is borrowing a " + resourceType.getResourceType() + ": " + resourceType.getTitle());
    }
}