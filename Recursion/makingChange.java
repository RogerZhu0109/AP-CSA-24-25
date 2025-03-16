package Recursion;

public class makingChange {
    public static void main(String[] args) {
        System.out.println(reverseString("Hello World"));
    }

    public static String reverseString(String str) {
        if (str.length() == 1) {
            return str.substring(0, 1);
        }
        return str.substring(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
    }
}
