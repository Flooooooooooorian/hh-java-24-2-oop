public class Main {

    public static void main(String[] args) {
        System.out.println("hello world");

        Cup danielsCup = new Cup("Portugal", "zylinder");

//        danielsCup.text = "Portugal";
        danielsCup.color = "White";
        danielsCup.pattern = "Muster";
//        danielsCup.shape = "Zylinder";
        danielsCup.size = 150;

        System.out.println(danielsCup.color);
        System.out.println(danielsCup.pattern);
        System.out.println(danielsCup.text);


        Cup viktorsCup = new Cup("KEIN TEXT", "zylinder");

        viktorsCup.size = 250;
        viktorsCup.shape = "zylinder";
        viktorsCup.color = "White";

        System.out.println(viktorsCup.shape);
        System.out.println(viktorsCup.size);
        System.out.println(viktorsCup.text);

        Cup FloriansCup = new Cup();
    }
}
