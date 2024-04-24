package de.neuefische.java.statics;

public class Main {

    public static void main(String[] args) {
        Human h1 = new Human("Marcell");

        System.out.println(Human.age);
        Human.age = 4000;
        System.out.println(Human.age);

        System.out.println(h1);

        h1.setName("Florian");

        System.out.println(h1);

    }

    public int add(int a, int b)  {
        return a + b;
    }
}
