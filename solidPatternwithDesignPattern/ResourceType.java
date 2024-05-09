package solidPatternwithDesignPattern;

public class ResourceType {
    private final String resourceType;
    private final String title;

    public ResourceType(String resourceType, String title) {
        this.resourceType = resourceType;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getResourceType() {
        return resourceType;
    }
}