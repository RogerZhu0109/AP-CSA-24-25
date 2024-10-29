
public class cartester {
    public static void main(String[] arg) {
        CarComparable x = new CarComparable(1);
        Comparable<CarComparable> y = new CarComparable(5);
        System.out.println(y.compareTo(x));
    }
}
