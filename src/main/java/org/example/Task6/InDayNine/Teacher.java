package org.example.Task6.InDayNine;

public class Teacher extends Human {
    String lesson;

    public Teacher(String lesson, String name) {
        this.lesson = lesson;
        this.name = name;
    }

    public String getLesson() {
        return this.lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public void printInfo() {
        System.out.println("Этот преподователь с именем " + this.name);
    }
}
