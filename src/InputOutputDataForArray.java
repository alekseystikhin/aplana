import java.util.Scanner;

public class InputOutputDataForArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int[] arr = new int[Integer.parseInt(scanner.next())];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введите число для массива: ");
            arr[i] = Integer.parseInt(scanner.next());
        }
        System.out.println("Результат:");
        for (int temp : arr) {
            System.out.println(temp * 2);
        }


    }
}
