package com.iterator;

import java.util.Arrays;
import java.util.List;

public class ListRepository implements Container {

    private List<String> listOfStrings = Arrays.asList("Mark", "John", "Philip", "Dyna", "Jeff");

    @Override
    public Iterator getIterator() {
        return new ListIterator(listOfStrings);
    }
}
