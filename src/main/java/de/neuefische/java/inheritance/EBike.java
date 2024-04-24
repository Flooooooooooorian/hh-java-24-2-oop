package de.neuefische.java.inheritance;

public class EBike extends Bike{

    @Override
    public String toString() {
        return "EBike{" +
               "wheelCount=" + wheelCount +
               ", color='" + color + '\'' +
               ", speed=" + speed +
               '}';
    }
}
