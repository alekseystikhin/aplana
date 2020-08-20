import java.util.Scanner;

public class InputOutputDataForMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк массива: ");
        int n = Integer.parseInt(scanner.next());
        System.out.print("Введите количество столбцов массива: ");
        int m = Integer.parseInt(scanner.next());
        int[][] arr = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Введите число для помещения в массив: ");
                arr[i][j] = Integer.parseInt(scanner.next());
            }
        }
        System.out.println("Результат:");
        for (int temp : arr[0])
            System.out.print((temp * 3) + " ");
    }
}
