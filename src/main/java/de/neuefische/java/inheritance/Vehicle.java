package de.neuefische.java.inheritance;

import java.util.Objects;

public class Vehicle extends Object{

    protected int wheelCount;
    protected String color;
    protected int speed;

    public Vehicle() {
        this.wheelCount = 4;
    }

    public Vehicle(int wheelCount, String color, int speed) {
        this.color = color;
        this.speed = speed;
        this.wheelCount = wheelCount;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle vehicle)) return false;

        if (wheelCount != vehicle.wheelCount) return false;
        if (speed != vehicle.speed) return false;
        return Objects.equals(color, vehicle.color);
    }

    @Override
    public int hashCode() {
        int result = wheelCount;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + speed;
        return result;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
               "wheelCount=" + wheelCount +
               ", color='" + color + '\'' +
               ", speed=" + speed +
               '}';
    }
}
