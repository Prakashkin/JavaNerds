package com.iterator;

public class NameIterator implements Iterator {

    Object object[];
    int index;
    NameIterator(Object[] object){
        this.object = object;
    }
    @Override
    public boolean hasNext() {

        if(index < object.length){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {

        if(this.hasNext()){
            return object[index++];
        }
        return null;
    }
}
