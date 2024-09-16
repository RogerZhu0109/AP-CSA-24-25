import java.util.*;

public class questionthree {
    public static final String[] FISH_TYPES = {
            "Salmon", "Tuna", "Trout", "Cod", "Herring",
            "Mackerel", "Halibut", "Sardine", "Swordfish", "Catfish",
            "Snapper", "Bass", "Perch", "Pike", "Carp",
            "Flounder", "Grouper", "Anchovy", "Marlin", "Barracuda"
    };

    public static void main(String[] args) {
        Random rand = new Random();
        int arraylength = rand.nextInt(100) + 1;
        Fish[] a = new Fish[arraylength];
        for (int i = 0; i < arraylength; i++) {
            int randomFishIndex = rand.nextInt(20);
            int fishLength = rand.nextInt(20) + 1;
            a[i] = new Fish(FISH_TYPES[randomFishIndex], fishLength);
        }
        for (Fish x : a) {
            System.out.println(x.getName());
        }
        modify(a, rand);
        for (Fish x : a) {
            System.out.print(x.getName());
            System.out.println(x.getLength());
        }
    }

    public static void modify(Fish[] a, Random rand) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].getLength() > 10) {
                a[i].changeName("TUNA");
            }
        }
        System.out.println("MODIFIED");
    }
}
