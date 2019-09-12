package com.iterator;

public class ArrayIterator implements Iterator {

    private Object[] object;
    int index;

    ArrayIterator(Object[] object) {
        this.object = object;
    }

    ArrayIterator(Integer[] object) {
        this.object = object;
    }

    @Override
    public boolean hasNext() {

        return index < object.length;
    }

    @Override
    public Object next() {

        if(this.hasNext()){
            return object[index++];
        }
        return null;
    }
}
