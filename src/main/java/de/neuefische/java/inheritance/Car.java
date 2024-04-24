package de.neuefische.java.inheritance;

public class Car extends Vehicle{

    private int countDoors;

    public int getCountDoors() {
        return countDoors;
    }

    public void setCountDoors(int countDoors) {
        this.countDoors = countDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
               "countDoors=" + countDoors +
               ", wheelCount=" + wheelCount +
               ", color='" + color + '\'' +
               ", speed=" + speed +
               '}';
    }
}
