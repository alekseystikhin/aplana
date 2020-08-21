import java.util.Scanner;

public class CompareTwoStings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String firstString = scanner.nextLine();
        System.out.println("Введите вторую строку: ");
        String secondString = scanner.nextLine();
        String result = "";
        if (firstString.length() > secondString.length()) {
            result = firstString;
        } else if (firstString.length() < secondString.length()) {
            result = secondString;
        } else {
            result = "Строки равны";
        }
        System.out.println(result);
    }
}
