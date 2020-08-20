import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String binaryNumber = scanner.next();
        int decimalNumber = Integer.parseInt(binaryNumber, 2);
        System.out.println("decimal representation of a number: " + decimalNumber);

    }
}
