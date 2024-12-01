package Sortall;

public class Sortall {
    public static <T extends Comparable<T>> void bubbleSort(T[] array) {
        int n = array.length;
        boolean swapped;

        // Bubble sort
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // Already sorted
            if (!swapped) {
                break;
            }
        }
    }

    static class compEx implements Comparable<compEx> {
        private int xyz;

        public compEx(int z) {
            xyz = z;
        }

        @Override
        public int compareTo(compEx c) {
            return Integer.compare(this.xyz, c.xyz);
        }

        @Override
        public String toString() {
            return String.valueOf(xyz);
        }
    }

    static class Main {
        public static void main(String[] args) {
            compEx[] array = {
                    new compEx(21),
                    new compEx(41),
                    new compEx(15),
                    new compEx(32)
            };

            System.out.println("Array before sorting:");
            for (compEx item : array) {
                System.out.print(item + " ");
            }
            System.out.println();

            Sortall.bubbleSort(array);

            System.out.println("Array after sorting:");
            for (compEx item : array) {
                System.out.print(item + " ");
            }
        }
    }
}
