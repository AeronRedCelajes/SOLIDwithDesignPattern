package solidPatternwithDesignPattern;

public class ResourceType implements ResourceBorrow{
    public void borrowResource(Student student, Resources resources) {
        System.out.println(student.getName() + " is borrowing a/an " + resources.getResourceType() + ": " + resources.getTitle());
    }
}