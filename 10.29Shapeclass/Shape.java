abstract public class Shape implements Comparable<Shape> {
    private String name;
    private String color;

    public Shape() {
        this.name = "UNKNOWN";
        this.color = "UNKNOWN";
    }

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;

    }

    public abstract double calcArea();

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int compareTo(Shape other) {
        return Double.compare(this.calcArea(), other.calcArea());
    }

}