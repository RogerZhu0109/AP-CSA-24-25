package Recursion;

public class test {
    public static void main(String[] args) {
        System.out.println(toBinary(50));

    }

    public static String toBinary(int n) {
        if (n == 1) {
            return "1";
        }
        return toBinary(n / 2) + (n % 2);
    }

}
