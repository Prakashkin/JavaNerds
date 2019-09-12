package com.iterator;

import java.util.Set;

public class SetIterator implements Iterator {

    private Set<Object> objectSet;
    private int index;
    private java.util.Iterator<Object> setIterator;

    SetIterator(Set objectSet) {
        this.objectSet = objectSet;
        setIterator = objectSet.iterator();
    }

    @Override
    public boolean hasNext() {
        return index < objectSet.size();
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            index++;
            return setIterator.next();
        }
        return null;
    }

}