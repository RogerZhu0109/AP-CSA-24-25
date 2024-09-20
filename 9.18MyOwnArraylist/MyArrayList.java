import java.util.Arrays;

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

    public Object remove(int index) {
        Object removeVal = list[index];
        for (int i = index; i < logical_Size - 1; i++) {
            list[i] = list[i + 1];
        }
        logical_Size--;
        return removeVal;
    }

    public void insert(int index, Object value) {
        if (logical_Size + 1 > physical_Size) {
            increaseSize();
        }
        for (int i = logical_Size; i > index; i--) {
            list[i] = list[i - 1];
        }
        list[index] = value;
        logical_Size++;

    }

    public Object get(int index) {
        return list[index];
    }

    public int contains(Object x) { // return first instance of Object x. Else return -1
        for (int i = 0; i < physical_Size; i++) {
            if (list[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public int getPhysicalSize() {
        return physical_Size;
    }

    public int getLogicalSize() {
        return logical_Size;
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < logical_Size; i++) {
            str += list[i].toString();
            str += ", ";
        }
        return str;
    }

    private void increaseSize() {
        list = Arrays.copyOf(list, physical_Size * 2);
        physical_Size *= 2;
    }

}
