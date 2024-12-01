package buildingClass;

public abstract class Building implements Comparable<Building> {
    int floors = 5;

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getFLoors() {
        return floors;
    }

    public abstract void calcCost(double x);

    @Override
    public int compareTo(Building a) {

        if (this.floors > a.floors) {
            return 1;
        } else if (this.floors < a.floors) {
            return 0;
        } else {
            return 0;
        }

    }
}
