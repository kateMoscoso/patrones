package main.java.com.template;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TemplateEverydayDemo {

    private static void printContents(List< Person > people){
        for (Person person: people){
            System.out.println(person.getName());
        }
    }
    public static void main(String[] args) {
        Person daniel = new Person("Daniel", "555666999", 31);
        Person daniela = new Person("Daniela", "555666999", 35);
        Person laura = new Person("Laura", "555666999", 28);
        Person ana = new Person("Ana", "555666999", 31);

        List<Person> people = new ArrayList<Person>();
        people.add(daniel);
        people.add(daniela);
        people.add(laura);
        people.add(ana);

        System.out.println("Not sorted");
        printContents(people);

        Collections.sort(people);

        System.out.println(" Sorted by age");
        printContents(people);


    }
}

