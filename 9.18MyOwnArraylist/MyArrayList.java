public class MyArrayList {
    private Object[] list;
    private int logical_Size;
    private int physical_Size;

    public MyArrayList() {
        list = new Object[10];
        logical_Size = 0;
        physical_Size = 10;
    }

    public void add(Object value) {
        if (logical_Size == physical_Size) {
            increaseSize();
        }
        list[logical_Size] = value;
        logical_Size++;

    }

    public void insert(int index, Object value) {

    }

    public Object get(int index) {

        return -1;
    }

    public int getPhysicalSize() {
        return physical_Size;
    }

    public int getLogicalSize() {
        return logical_Size;
    }

    public int obtains(Object x) {

        return -1;
    }

    public String toString() {
        return "";
    }

    private void increaseSize() {

    }

}
