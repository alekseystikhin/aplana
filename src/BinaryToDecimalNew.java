import java.util.Scanner;

public class BinaryToDecimalNew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Результат перевода в десятичную: " + BinaryToDecimalNew.toDecimal(scanner.next()));
    }

    public static int toDecimal(String binaryNumber) {
        char[] chars = binaryNumber.toCharArray();
        int result = 0;
        int mult = 1;
        for (int i = binaryNumber.length() - 1; i >= 0; i--) {
            if (chars[i] == '1') {
                result += mult;
            }
            mult *= 2;
        }
        return result;
    }
}
