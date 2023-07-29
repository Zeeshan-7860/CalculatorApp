package com.example.myapp;

public class User {
    public int id;
    public String name;
    public String pass;
    public int age;
    public User() {
    }

    public User(int id, String name, String pass, int age)
    {
        this.id = id;
        this.name = name;
        this.pass = pass;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
