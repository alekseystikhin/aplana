import java.util.Scanner;

public class DataEntryConditions {
    private static final int X = 1;
    private static final int Y = 2;
    private static final int Z = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите с клавиатуры число:");
        int number = Integer.parseInt(scanner.next());
        switch (number) {
            case X:
            case Y:
            case Z:
                System.out.println("Данное значение имеется в константах");
                break;
            default:
                System.out.println("Такой константы нет!");
                break;
        }
    }
}
