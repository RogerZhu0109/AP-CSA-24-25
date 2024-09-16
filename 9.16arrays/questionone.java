import java.util.*;

public class questionone {
    public static void main(String[] args) {
        Random rand = new Random();
        Random randletter = new Random();
        int arraylength = rand.nextInt(100) + 1;
        String[] a = new String[arraylength];
        String[] letters = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z" };

        for (int i = 0; i < arraylength; i++) {
            int index = randletter.nextInt(26);
            a[i] = letters[index];

        }
        for (String str : a) {
            System.out.println(str);
        }
        changeFirstLetter(a);
        for (String str : a) {
            System.out.println(str);
        }

    }

    public static void changeFirstLetter(String[] a) {
        if (a[0].compareTo("p") >= 0) {
            a[0] = "z";
            System.out.println("MODIFIED");
        } else {
            System.out.println("NO MODIFICATION");
        }
    }
}