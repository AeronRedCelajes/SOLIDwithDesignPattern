package solidPatternwithDesignPattern;

import java.util.*;

public class Student {
    private final Map<String, ResourceBorrow> resourceTypes = new HashMap<>();

    public Student(Map<String, ResourceBorrow> resourceTypes){
        this.resourceTypes.putAll(resourceTypes);
    }

    public void borrowResource(Resources resources) {
        String resourceType = resources.getResourceType();

        if (!resourceTypes.containsKey(resourceType))
            throw new IllegalArgumentException("Invalid resource type: " + resourceType);

        ResourceBorrow resource = resourceTypes.get(resourceType);
        resource.borrow(resources, resources.getTitle());
    }
}