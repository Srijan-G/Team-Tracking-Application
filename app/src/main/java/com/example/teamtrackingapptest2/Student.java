package com.example.teamtrackingapptest2;

public class Student {
    String name;
    String id;
    String domanin;
    public Student(){}

    public Student(String name, String id, String domanin) {
        this.name = name;
        this.id = id;
        this.domanin = domanin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDomanin() {
        return domanin;
    }

    public void setDomanin(String domanin) {
        this.domanin = domanin;
    }
}
