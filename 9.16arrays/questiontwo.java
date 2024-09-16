import java.util.*;

public class questiontwo {
    public static void main(String[] args) {
        Random rand = new Random();
        int length = rand.nextInt(100) + 1;
        int[] a = new int[length];
        for (int i = 0; i < length; i++) {
            int randint = rand.nextInt(100);
            a[i] = randint;
        }

        for (int x : a) {
            System.out.println(x);
        }
        modify(a, rand);
        for (int x : a) {
            System.out.println(x);
        }

    }

    public static void modify(int[] a, Random rand) {
        int randomNumber = rand.nextInt(3) + 1;
        if (randomNumber == 1) {
            for (int i = 0; i < a.length; i++) {
                a[i] = 999;
            }
        } else if (randomNumber == 2) {
            for (int i = 0; i < a.length; i++) {
                a[i] = 555;
            }
        } else {
            for (int i = 0; i < a.length; i++) {
                a[i] = 444;
            }
        }
        System.out.println("MODIFIED" + randomNumber);

    }
}
