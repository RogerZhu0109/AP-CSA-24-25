public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, String name) {
        super(name, color);
        this.radius = radius;
    }

    public double calcArea() {
        return 3.14 * (radius * radius);
    }

}
