package org.example;

public abstract class Person {
    //properties
    public String name;
    public String email;
    //empty constructor
    public Person(){
    }
    //person constructor for name and email
    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }
    //abstract method with no base implementation
    public abstract String personDetails();

    @Override
    public String toString(){
        return "Name="+this.name+" Email="+this.email;
    }

}



