package solidPatternwithDesignPattern;

public class Resources {
    private final String resourceType;
    private final String title;

    public Resources(String resourceType, String title) {
        this.resourceType = resourceType;
        this.title = title;
    }

    public String getResourceType() {
        return resourceType;
    }

    public String getTitle() {
        return title;
    }
}