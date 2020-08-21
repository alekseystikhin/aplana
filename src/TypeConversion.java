import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        String S = scanner.nextLine();
        int X = Integer.parseInt(S);
        double Y = X;
        System.out.println("Результат: ");
        System.out.println(S);
        System.out.println(X);
        System.out.println(Y);
    }
}
