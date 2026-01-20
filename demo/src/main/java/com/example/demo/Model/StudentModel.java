package com.example.demo.Model;
public class StudentModel {

    private int id;
    private String name;
    private String email;

    // ✅ No-args constructor (needed by Spring/Jackson)
    public StudentModel() {
    }

    // ✅ Correct constructor
    public StudentModel(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // getters & setters
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}