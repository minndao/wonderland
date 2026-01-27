package com.magical.people;

public class Person {
    private String name;
    private int age;

    private static final int DEFAULT_AGE = 18;
    private static int personCount = 0;

    public Person(){
        this.name = "Unknown Student";
        this.age = DEFAULT_AGE;
        personCount++;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        personCount++;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        if (age < 0){
            throw new IllegalArgumentException("Invalid age.");
        }else{this.age = age;}
    }

    public static int getPersonCount(){
        return personCount;
    }

    public boolean compareTo(Person other){
        return this.age == other.age;}
    }

