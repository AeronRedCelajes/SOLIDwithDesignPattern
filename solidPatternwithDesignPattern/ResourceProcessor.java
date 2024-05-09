package solidPatternwithDesignPattern;

import java.util.*;

public class ResourceProcessor {
    private final Map<String, ResourceBorrow> resourceTypes;

    public ResourceProcessor(Map<String, ResourceBorrow> resourceTypes) {
        this.resourceTypes = resourceTypes;
    }

    public void borrowResource(Student student, Resources resources) {
        String resourceType = resources.getResourceType();
        ResourceBorrow resourceBorrow = resourceTypes.get(resourceType);

        if (!resourceTypes.containsKey(resourceType)) {
            throw new IllegalArgumentException("Invalid resource type: " + resourceType);
        }

        resourceBorrow.borrowResource(student, resources);
    }
}