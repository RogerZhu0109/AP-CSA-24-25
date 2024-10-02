import java.util.*;
import java.io.*;

public class names {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("/Users/rogerzhu/Documents/GitHub/AP-CSA-24-25/10.2names/names.txt"));
        ArrayList<String> uniqueNames = new ArrayList<>();
        ArrayList<Integer> occurrences = new ArrayList<>();

        while (scanner.hasNext()) {
            String str = scanner.nextLine().toLowerCase();
            if (uniqueNames.contains(str)) {
                int index = uniqueNames.indexOf(str);
                occurrences.set(index, occurrences.get(index) + 1);
            } else {
                uniqueNames.add(str);
                occurrences.add(1);
            }
        }
        scanner.close();
        for (int i = 0; i < uniqueNames.size(); i++) {
            System.out.println(uniqueNames.get(i) + " " + occurrences.get(i));
        }
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the Name to Search: ");
        String word = reader.nextLine().toLowerCase();
        reader.close();
        if (uniqueNames.contains(word)) {
            System.out.println("Frequency: " + occurrences.get(uniqueNames.indexOf(word)));
        } else {
            System.out.println("doesnt exist");
        }
    }
}