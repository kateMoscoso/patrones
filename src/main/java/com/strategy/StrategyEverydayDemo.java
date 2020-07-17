package main.java.com.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StrategyEverydayDemo {

    private static void printContents(List<Person> people){
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

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getAge() > o2.getAge()) {
                    return 1;
                }
                if (o1.getAge() < o2.getAge()) {
                    return -1;
                }
                return 0;
            }
        });

        System.out.println(" Sorted by age");
        printContents(people);

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println(" Sorted by name");
        printContents(people);

    }
}
