import java.util.*;

public class primativeArray {
    private int[] array;

    public primativeArray(int size) {
        array = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(100);
        }
    }

    public int[] getArray() {
        return array;
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(", ");
        }
        System.out.println("");
    }

    public void function1(int[] x) {
        Random rand = new Random();
        x[rand.nextInt(x.length)] = rand.nextInt(1000);
        x[rand.nextInt(x.length)] = rand.nextInt(1000);
    }

    public void function2(int[] x) {
        x = new int[5];
        for (int i = 0; i < 5; i++) {
            x[i] = i;
        }
    }
}
