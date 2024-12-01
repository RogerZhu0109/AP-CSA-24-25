package buildingClass;

public class BuildingTester {
    public static void main(String[] args) {
        Building b = new Apartment(15.5);
        b.calcCost(12.5);
        System.out.println(b.toString());

        Building office = new OfficeSpace(20.0, 500.0);
        office.calcCost(15.0);
        System.out.println(office.toString());
    }
}

class Apartment extends Building {
    private double costPerFloor;
    private double totalCost;

    public Apartment(double costPerFloor) {
        this.costPerFloor = costPerFloor;
    }

    public double getcostPerFloor() {
        return costPerFloor;
    }

    public double gettotalCost() {
        return totalCost;
    }

    public void calcCost(double x) {
        totalCost = costPerFloor * getFLoors() + x;
    }

    public double getTotalCost() {
        return totalCost;
    }

    @Override
    public String toString() {
        return "Total Cost: " + totalCost;
    }
}

class OfficeSpace extends Building {
    private double costPerFloor;
    private double totalCost;
    private double squareFeetPerFloor;

    public OfficeSpace(double costPerFloor, double squareFeetPerFloor) {
        this.costPerFloor = costPerFloor;
        this.squareFeetPerFloor = squareFeetPerFloor;
    }

    public double getcostPerFloor() {
        return costPerFloor;
    }

    public double gettotalCost() {
        return totalCost;
    }

    public void calcCost(double x) {
        totalCost = ((costPerFloor * getFLoors()) + x) + (squareFeetPerFloor * 2.75);

    }

    public double getTotalCost() {
        return totalCost;
    }

    @Override
    public String toString() {
        return "Total Cost: " + totalCost;
    }
}