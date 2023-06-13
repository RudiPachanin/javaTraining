package org.example.Task6.InDayNine;

public class Student extends Human {
    String group;

    public Student(String group, String name) {
        this.group = group;
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void printInfo() {
        System.out.println("Этот Студент с именем " + name);
    }
}
