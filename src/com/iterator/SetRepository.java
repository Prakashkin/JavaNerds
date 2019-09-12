package com.iterator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetRepository implements Container {

    private Set<String> setOfStrings = new HashSet();

    SetRepository() {
        setOfStrings.addAll(Arrays.asList("Mark", "John", "Philip", "Dyna", "Jeff"));
    }

    @Override
    public Iterator getIterator() {
        return new SetIterator(setOfStrings);
    }
}
