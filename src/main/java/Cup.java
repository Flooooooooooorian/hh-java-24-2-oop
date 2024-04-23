public class Cup {

    String text;
    String pattern;
    String shape;
    String color;
    int size;

    public Cup() {
    }

    public Cup(String myText, String pattern) {
        text = myText;
        this.pattern = pattern;
    }

    public Cup(String text, String pattern, String shape, String color, int size) {
        this.color = color;
        this.pattern = pattern;
        this.shape = shape;
        this.size = size;
        this.text = text;
    }
}
