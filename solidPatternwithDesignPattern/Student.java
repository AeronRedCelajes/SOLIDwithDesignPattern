package solidPatternwithDesignPattern;

import java.util.*;

public class Student {
    private final Map<String, ResourceTypeBorrow> resourceTypes = new HashMap<>();

    public Student(Map<String, ResourceTypeBorrow> resourceTypes){
        this.resourceTypes.putAll(resourceTypes);
    }

    public void borrowResource(Resources resources) {
        String resourceType = resources.getResourceType();

        if (!resourceTypes.containsKey(resourceType))
            throw new IllegalArgumentException("Invalid resource type: " + resourceType);

        ResourceTypeBorrow resource = resourceTypes.get(resourceType);
        resource.borrow(resources, resources.getTitle());
    }
}