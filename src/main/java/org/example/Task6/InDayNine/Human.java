package org.example.Task6.InDayNine;

public class Human {
    String name;

    public Human() {
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Этот человек с именем " + this.name);
    }
}
