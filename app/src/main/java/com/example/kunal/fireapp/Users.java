package com.example.kunal.fireapp;

/**
 * Created by Kunal on 7/24/2017.
 */

public class Users {

    String name;
    Double age;

    public Users(String name, Double age) {
        this.name = name;
        this.age = age;
    }

    public Users() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
