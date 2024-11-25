package numberPrac;

import java.util.Random;
import java.util.HashMap;

public class numberPractice {
    public static void main(String[] args) {
        Number[] numbers = new Number[10000];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            if (rand.nextBoolean()) {
                numbers[i] = rand.nextInt(19) + 2;
            } else {
                numbers[i] = 2 + (18 * rand.nextDouble());
            }
        }

        bubbleSort(numbers);

        int integerCount = 0;
        int doubleCount = 0;

        for (Number x : numbers) {
            if (x instanceof Integer) {
                integerCount++;
            } else {
                doubleCount++;
            }
            System.out.println(x);
        }
        System.out.println("Integer Count:" + integerCount + " Double Count: " + doubleCount);

        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int i = 2; i <= 20; i++) {
            frequency.put(i, 0);
        }
        for (Number num : numbers) {
            int truncated = (int) Math.floor(num.doubleValue());
            frequency.put(truncated, frequency.get(truncated) + 1);
        }

        System.out.println("Frequency Distribution:");
        for (int i = 2; i <= 20; i++) {
            System.out.println(i + ": " + frequency.get(i));
        }
    }

    public static void bubbleSort(Number[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].doubleValue() > arr[j + 1].doubleValue()) {
                    Number temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }
}
