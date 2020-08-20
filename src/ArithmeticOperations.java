import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.next());
        double y = Double.parseDouble(scanner.next());
        double z = Double.parseDouble(scanner.next());
        double arithmeticMeanValue = (x + y + z) / 3;
        System.out.println("Среднеарифметическое: " + arithmeticMeanValue);
        int temp = (int) (arithmeticMeanValue / 2);
        if (temp > 3) System.out.println("Программа выполнена корректно");
    }
}
