package com.iterator;

public class IteratorPatternDemo {

    public static void main(String[] args) {
        ArrayRepository arrayRepository = new ArrayRepository();
        ListRepository listRepository = new ListRepository();
        SetRepository setRepository = new SetRepository();
        for (Iterator iter = arrayRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Array Of Name : " + name);
        }

        System.out.println("\n--------------------------\n");

        for (Iterator iter = listRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("List of Name : " + name);
        }

        System.out.println("\n--------------------------\n");

        for (Iterator iter = setRepository.getIterator(); iter.hasNext(); ) {
//            String name = (String) iter.next();
            System.out.println("Set of Name : " + iter.next());
        }

    }
}