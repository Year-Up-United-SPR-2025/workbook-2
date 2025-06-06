package com.pluralsight;

//this is declaring a person
public class Person {

    private String fullName;
    private int age;
    private String profession;

    public Person(String fullName, int age, String profession){
        this.fullName = fullName;
        this.age = age;
        this.profession = profession;
    }

    public String getFullName(){
        return  this.fullName;
    }

    public void setFullName(String newFullname){
        this.fullName = fullName;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
       this.age = age;
    }

    public  String getProfession(){
        return  this.profession;
    }

    public void setProfession(String profession){
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", profession='" + profession + '\'' +
                '}';
    }
}
