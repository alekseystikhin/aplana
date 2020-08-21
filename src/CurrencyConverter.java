import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текущий курс доллара: ");
        double dollarRate = Double.parseDouble(scanner.nextLine().replace(',', '.'));
        System.out.print("Введите количество рублей: ");
        double rubAmount = Double.parseDouble(scanner.nextLine().replace(',', '.'));
        System.out.println("Итого: " + count(dollarRate, rubAmount) + " долларов");
    }
    public static String count(double dollarRate, double rubAmount) {
        return String.format("%.2f", (rubAmount / dollarRate));
    }
}
