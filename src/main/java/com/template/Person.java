package main.java.com.template;

public class Person implements Comparable<Person>{


    private int age;
    private String name;
    private String phoneNumber;

    public Person(){}

    public Person(String name, String phoneNumber, int age){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //template method
    @Override
    public int compareTo(Person o) {
        if(this.age > o.age){
            return 1;
        }
        if(this.age < o.age){
            return -1;
        }
        return 0;
    }
}