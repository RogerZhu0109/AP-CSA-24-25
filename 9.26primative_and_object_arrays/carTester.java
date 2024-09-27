public class carTester {
    public static void main(String[] args) {
        Car[] list = new Car[3];
        list[0] = new Car(2000, "Blue");
        list[1] = new Car(2009, "green");
        list[2] = new Car(2008, "Blue");
        System.out.println("Original:");
        for (Car x : list) {
            System.out.println(x);
        }
        System.out.println("FUNCTION 1");
        function1(list);
        for (Car x : list) {
            System.out.println(x);
        } // was modified because this car points to the same object

        System.out.println("FUNCTION 2");
        function2(list);
        for (Car x : list) {
            System.out.println(x);
        } // does not get modified because it points to a different array

    }

    public static void function1(Car[] x) {
        x[0].setColor("Yellow");
        x[1].setYear(2020);
        x[2] = new Car(2024, "Purple");
    }

    public static void function2(Car[] x) {
        x = new Car[3];
        x[0] = new Car(123213123, "Red");
        x[1] = new Car(123123, "Red");
        x[2] = new Car(123123123, "Red");
    }

}
