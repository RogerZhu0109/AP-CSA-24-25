package Recursion;

public class makingChange {
    public static void main(String[] args) {
        System.out.println(reverseString("Hot Coffee is better than iced coffee"));
    }

    public static String reverseString(String str) {
        if (str.length() == 1) {
            return str;
        }
        return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
    }
}
