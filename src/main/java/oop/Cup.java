package oop;

public class Cup {

    private String text;
    private String pattern;
    private String shape;
    private String color;
    private int size;

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

    public String getText() {
        return text;
    }

    public String getPattern() {
        return pattern;
    }

    public String getShape() {
        return shape;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cup cup)) return false;

        if (getSize() != cup.getSize()) return false;
        if (getText() != null ? !getText().equals(cup.getText()) : cup.getText() != null) return false;
        if (getPattern() != null ? !getPattern().equals(cup.getPattern()) : cup.getPattern() != null) return false;
        if (getShape() != null ? !getShape().equals(cup.getShape()) : cup.getShape() != null) return false;
        return getColor() != null ? getColor().equals(cup.getColor()) : cup.getColor() == null;
    }

    public int hashCode() {
        int result = getText() != null ? getText().hashCode() : 0;
        result = 31 * result + (getPattern() != null ? getPattern().hashCode() : 0);
        result = 31 * result + (getShape() != null ? getShape().hashCode() : 0);
        result = 31 * result + (getColor() != null ? getColor().hashCode() : 0);
        result = 31 * result + getSize();
        return result;
    }

    public String toString() {
        return "Cup{" +
               "text='" + text + '\'' +
               ", pattern='" + pattern + '\'' +
               ", shape='" + shape + '\'' +
               ", color='" + color + '\'' +
               ", size=" + size +
               '}';
    }
}
