package com.iterator;

/*Holds Array of Data.*/
public class ArrayRepository implements Container {

    public Integer[] integerArry = {1, 2, 11, 4};
    private Object[] names = {"Robert", "John", "Julie", "Lora"};

    /*Returns Iterator Object*/
    @Override
    public Iterator getIterator() {
        return new ArrayIterator(names);
    }
}