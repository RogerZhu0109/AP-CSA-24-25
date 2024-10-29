public class shapeclasstester {
    public static void main(String[] args) {
        Shape s = new Circle(5, "Red", "Circle");
        Shape a = new Rectangle(5, 5);
        System.out.println(s.compareTo(a));
        System.err.println("the circle is bigger than the rectangle");

    }
}
