package dev.lvpq.DependencyInjection;

public class Student {
    private final String name;
    private final int id;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("Student id: " + id);
        System.out.println("Student name: " + name);
    }
}
