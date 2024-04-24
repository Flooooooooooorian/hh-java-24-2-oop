package de.neuefische.java.statics;

public class Human {
    public static final int MINIMUM_AGE = 18;
    public static int age = 3000;
    private final String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
               "name='" + name + '\'' +
               '}';
    }
}
