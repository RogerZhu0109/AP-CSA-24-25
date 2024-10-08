import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<student> array = new ArrayList<student>();
        array.add(new student("Roger", 100));
        array.add(new student("Wenhao", 80));
        System.out.println(array.get(0));
    }
}
