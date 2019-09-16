package com.iterator;

import java.util.HashMap;
import java.util.Map;

public class MapRepository implements Container {

    private Map<Object, Object> mapOfStrings = new HashMap();

    MapRepository() {
        mapOfStrings.put("Key1", "John");
        mapOfStrings.put("Key2", "Dyna");
        mapOfStrings.put("Key3", "Jeff");
    }

    @Override
    public Iterator getIterator() {
        return new MapIterator(mapOfStrings);
    }
}
