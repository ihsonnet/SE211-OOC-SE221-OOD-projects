package com.storage;

public class User {
    private int id;
    private String Name;
    private int age;

    public User(int id, String name, int age) {
        this.id = id;
        Name = name;
        this.age = age;
    }

    public User() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }



}
