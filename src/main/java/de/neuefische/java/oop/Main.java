package de.neuefische.java.oop;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello world");

        Cup danielsCup = new Cup("Portugal", "zylinder");


        danielsCup.setText("Spanien");
        danielsCup.setColor("White");
        danielsCup.setPattern("Muster");
//        danielsCup.shape = "Zylinder";
        danielsCup.setSize(100);

        System.out.println(danielsCup.getColor());
        System.out.println(danielsCup.getPattern());
        System.out.println(danielsCup.getText());


        Cup viktorsCup = new Cup("KEIN TEXT", "zylinder");

        viktorsCup.setText("NICHTS");
        viktorsCup.setSize(200);
        viktorsCup.setShape("Zylinder");

        System.out.println(viktorsCup.getShape());
        System.out.println(viktorsCup.getSize());
        System.out.println(viktorsCup.getText());

        Cup floriansCup = new Cup();
        Cup jonasCup = new Cup();

        System.out.println(jonasCup);
        System.out.println(floriansCup);
        System.out.println(danielsCup);

        if (floriansCup.equals(jonasCup)) {
            System.out.println("gleich");
        }
        else {
            System.out.println("nicht gleich");
        }

        Library myLibrary = new Library(new Book[]{
                new Book("978-0132350884", "Effective Java", "Joshua Bloch", "Daniel"),
                new Book("978-0132350885", "Effective Java Teil 2", "Joshua Bloch JR", "Viktor"),
                new Book("978-0132350886", "Effective Java Advanced", "Joshua Bloch SR", "Aljoscha")
        });
        myLibrary.addBook(new Book("978-013235088000", "Effe Java", "Joshuloch", "Dael"));
    }
}
