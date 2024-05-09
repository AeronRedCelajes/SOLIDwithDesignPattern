package solidPatternwithDesignPattern;

import java.util.*;

public class ResourceProcessor {
    private final Map<String, ResourceBorrow> resourceTypes;

    public ResourceProcessor(Map<String, ResourceBorrow> resourceTypes) {
        this.resourceTypes = resourceTypes;
    }

    public void borrowResource(Student student, ResourceType resourceType) {
        String type = resourceType.getResourceType();
        ResourceBorrow resourceBorrow = resourceTypes.get(type);

        if (!resourceTypes.containsKey(type)) {
            throw new IllegalArgumentException("Invalid resource type: " + type);
        }

        resourceBorrow.borrowResource(student, resourceType);
    }
}