package solidPatternwithDesignPattern;

public class Book implements ResourceBorrow{
    public void borrowResource(Student student, ResourceType resourceType) {
        System.out.println(student.getName() + " is borrowing: " + resourceType.getTitle());
    }
}