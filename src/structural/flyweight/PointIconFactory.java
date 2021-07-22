package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

// This class is purely responsible for creating Point Icon Objects, we rely on it so we don't create multiple objects in memory.
public class PointIconFactory {
    private Map<PointType, PointIcon> icons = new HashMap<>();

    // Creates a cache or a pool of objects to reuse
    public PointIcon getPointIcon(PointType type){
        // Key -> Value
        // PointType -> PointIcon

        // If we don't have a type for a given icon we should create it and store it.
        if(!icons.containsKey(type)){
            var icon = new PointIcon(type, null); // Instead of null a real icon (Eg: cafe.jpg)
            icons.put(type, icon);
        }

        return icons.get(type);

    }
}
