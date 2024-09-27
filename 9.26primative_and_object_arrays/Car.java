public class Car {
    private int year;
    private String color;

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public void setYear(int x) {
        year = x;
    }

    public void setColor(String str) {
        color = str;
    }

    public String toString() {
        return "Color: " + color + " year: " + year;
    }

}
