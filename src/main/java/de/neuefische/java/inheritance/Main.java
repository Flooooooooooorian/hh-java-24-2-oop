package de.neuefische.java.inheritance;

public class Main {

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();

        Car c1 = new Car();

        c1.setColor("Schwarz");
        System.out.println(c1.getColor());

        System.out.println(v1);
        System.out.println(c1);

        Bike b1 = new Bike("white", 0);

        System.out.println(b1);

        EBike e1 = new EBike();

        System.out.println(e1.toString());
    }
}
