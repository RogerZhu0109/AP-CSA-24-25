public class CarComparable implements Comparable<CarComparable> {
    private int year;

    public CarComparable(int y) {
        year = y;
    }

    public int compareTo(CarComparable other) {
        return Integer.compare(this.year, other.year);
    }
}
