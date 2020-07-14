package main.java.com.iterator;

import java.util.*;

public class IteratorEverydayDemo {
    public static void main (String[] args){
        List <String> names = new ArrayList<>();
        //Set<String> names = new HashSet<>();

        names.add("Bryan");
        names.add("Aaron");
        names.add("Jason");

        Iterator<String> namesItr = names.iterator();

        while(namesItr.hasNext()) {
            String name = namesItr.next();
            System.out.println(name);
            namesItr.remove();
        }
        System.out.println("Names size" + names.size());
    }
}
