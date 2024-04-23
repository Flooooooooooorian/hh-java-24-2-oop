package oop;

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
    }
}
