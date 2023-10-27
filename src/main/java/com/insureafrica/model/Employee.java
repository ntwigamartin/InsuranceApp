package com.insureafrica.model;

public class Employee {
    private String title;

    public Employee(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void earnSalary() {
        System.out.println(title + " has been paid");
    }

}
