public class useBase {
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

    public static String toBaseX(int decimal, int base) {
        if (decimal == 0)
            return "0";
        char[] list = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        String value = "";
        while (decimal > 0) {
            int r = decimal % base;
            value = list[r] + value;
            decimal /= base;
        }
        return value;
    }

    public static String add(String num1, String num2, int base) {
        return toBaseX(toDecimal(num2, base) + toDecimal(num1, base), base);
    }

    public static String subtract(String num1, String num2, int base) {
        return toBaseX(toDecimal(num1, base) - toDecimal(num2, base), base);
    }

    public static String multiply(String num1, String num2, int base) {
        return toBaseX(toDecimal(num1, base) * toDecimal(num2, base), base);
    }

    public static String divide(String num1, String num2, int base) {
        return toBaseX(toDecimal(num1, base) / toDecimal(num2, base), base);
    }

    public static void main(String[] args) {
        System.out.println(multiply("1010", "1010", 2));
    }
}
