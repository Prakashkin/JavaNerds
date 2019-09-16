package com.iterator;

import java.util.Map;

public class MapIterator implements Iterator {

    private Map<Object, Object> objectMap;
    private int index;
    private java.util.Iterator<Object> mapIterator;

    MapIterator(Map objectMap) {
        this.objectMap = objectMap;
        mapIterator = objectMap.entrySet().iterator();
    }

    @Override
    public boolean hasNext() {
        return index < objectMap.size();
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            index++;
            return mapIterator.next();
        }
        return null;
    }

}