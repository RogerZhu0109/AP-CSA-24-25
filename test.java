public class test {
    public static int toDecimal(String num, int base) {
        int decimal = 0;
        num = num.toUpperCase();
        for (int i = 0; i < num.length(); i++) {
            char x = num.charAt(i);
            int value = 0;
            if (x >= '1' && x <= '9') {
                value = Character.getNumericValue(x);
            } else if (x >= 'A' && x <= 'F') {
                value = 10 + (x - 'A');
            }
            decimal += value * Math.pow(base, num.length() - i - 1);
        }
        return decimal;
    }

    public static void main(String[] args) {
        System.out.println(toDecimal("1010", 2));
    }
}
