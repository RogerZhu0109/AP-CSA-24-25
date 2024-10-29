public class Triangle extends Shape {
    private int base;
    private int height;

    public Triangle(int base, int height) {
        super();
        this.base = base;
        this.height = height;

    }

    public Triangle(int base, int height, String name, String color) {
        super(name, color);
        this.base = base;
        this.height = height;
    }

    public double calcArea() {
        return base * height / 2;
    }

}
