public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        super();
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width, int height, String name, String color) {
        super(name, color);
        this.width = width;
        this.height = height;
    }

    public double calcArea() {
        return width * height;
    }

}
