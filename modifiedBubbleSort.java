import java.util.HashMap;

public class modifiedBubbleSort {
    public static void main(String[] args) {
        Number[] arr = { 5, 3, 8, 3, 5, 2, 8, 1 };

        System.out.println("Original Array:");
        printArray(arr);

        // Sort in ascending order and detect duplicates
        bubbleSort(arr, true);
        System.out.println("\nSorted Array (Ascending):");
        printArray(arr);
        countDuplicates(arr);

        // Sort in descending order and detect duplicates
        bubbleSort(arr, false);
        System.out.println("\nSorted Array (Descending):");
        printArray(arr);
        countDuplicates(arr);
    }

    public static void bubbleSort(Number[] arr, boolean ascending) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                boolean condition = (arr[j].doubleValue() > arr[j + 1].doubleValue()) == ascending;

                if (condition) {
                    // Swap elements
                    Number temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break; // Exit if the array is already sorted
            }
        }
    }

    public static void countDuplicates(Number[] arr) {
        HashMap<Double, Integer> frequencyMap = new HashMap<>();

        // Count occurrences of each number
        for (Number num : arr) {
            double value = num.doubleValue();
            frequencyMap.put(value, frequencyMap.getOrDefault(value, 0) + 1);
        }

        System.out.println("\nDuplicate Elements and Counts:");
        boolean hasDuplicates = false;
        for (HashMap.Entry<Double, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Element " + entry.getKey() + " occurs " + entry.getValue() + " times.");
                hasDuplicates = true;
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicates found.");
        }
    }

    public static void printArray(Number[] arr) {
        for (Number num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}