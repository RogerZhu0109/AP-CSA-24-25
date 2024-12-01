package buildingClass;

public abstract class Building implements Comparable<Building> {
    private static int floors = 5;

    public static void setFloors(int x) {
        floors = x;
    }

    public static int getFLoors() {
        return floors;
    }

    public abstract void calcCost(double x);

    public abstract double getTotalCost();

    @Override
    public int compareTo(Building a) {
        return Double.compare(this.getTotalCost(), a.getTotalCost());

    }
}
