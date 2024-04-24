package de.neuefische.java.inheritance;

public class Bike extends Vehicle {

    public Bike() {
    }

    public Bike(String color, int speed) {
        super(2, color, speed);
    }

    @Override
    public String toString() {
        return "Bike{" +
               "wheelCount=" + wheelCount +
               ", color='" + color + '\'' +
               ", speed=" + speed +
               '}';
    }
}
