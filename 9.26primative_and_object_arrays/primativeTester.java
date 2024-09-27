public class primativeTester {
    public static void main(String[] args) {
        primativeArray list = new primativeArray(10);
        System.out.println("Original");
        list.print();
        list.function1(list.getArray());
        System.out.println("Modified");
        list.print(); // does change becuase it points to the same location
        System.out.println("Reallocating");
        list.function2(list.getArray());
        list.print(); // doest not change because it points to a new location
    }
}