package genericslab;

import java.util.*;

public class generics<T> {
    private ArrayList<T> items;

    public generics() {
        items = new ArrayList<>();
    }

    public void remove(int index) {
        items.remove(index);
    }

    public T get(int index) {
        return items.get(index);
    }

    public void add(T item) {
        items.add(item);
    }

    public static void main(String[] args) {
        generics<Integer> intContainer = new generics<>();
        intContainer.add(1);
        intContainer.add(2);
        intContainer.add(3);
        System.out.println("index 1: " + intContainer.get(1));
        intContainer.remove(1);
        System.out.println("after removal, index 1: " + intContainer.get(1));

        generics<String> stringContainer = new generics<>();
        stringContainer.add("Hello");
        stringContainer.add("World");
        System.out.println("index 0: " + stringContainer.get(0));
        stringContainer.remove(0);
        System.out.println("after removal, index 0: " + stringContainer.get(0));
    }
}