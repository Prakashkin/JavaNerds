package com.iterator;

import java.util.List;

public class ListIterator implements Iterator {

    private List<Object> objectList;
    private int index;

    ListIterator(List objectList) {
        this.objectList = objectList;
    }

    @Override
    public boolean hasNext() {
        return index < objectList.size();
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return objectList.get(index++);
        }
        return null;
    }

}
