package com.iterator;

public class IteratorPatternDemo {

    public static void main(String[] args) {
        ArrayRepository arrayRepository = new ArrayRepository();
        ListRepository listRepository = new ListRepository();
        SetRepository setRepository = new SetRepository();
        MapRepository mapRepository = new MapRepository();

        System.out.println("\n------------Array--------------\n");

        for (Iterator iter = arrayRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Array Of Name : " + name);
        }

        System.out.println("\n------------List--------------\n");

        for (Iterator iter = listRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("List of Name : " + name);
        }

        System.out.println("\n------------Set--------------\n");

        for (Iterator iter = setRepository.getIterator(); iter.hasNext(); ) {
//            String name = (String) iter.next();
            System.out.println("Set of Name : " + iter.next());
        }

        System.out.println("\n-----------Map---------------\n");

        for (Iterator iter = mapRepository.getIterator(); iter.hasNext(); ) {
            System.out.println("Map Values : " + iter.next());
        }

    }
}