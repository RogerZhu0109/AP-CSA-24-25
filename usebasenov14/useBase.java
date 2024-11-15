public class useBase {
    public static int toDecimal(String num, int base) {
        int decimal = 0;
        if (base == 2) {
            for (int i = 0; i < num.length(); i++) {
                char x = num.charAt(i);
                if (x == '1') {
                    decimal += Math.pow(2, num.length() - i - 1);
                }
            }
            return decimal;

        } else if (base == 16) {
            return 0;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(toDecimal("1010", 2));
    }
}
