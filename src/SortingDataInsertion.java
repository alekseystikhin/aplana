import java.util.Arrays;
import java.util.Scanner;

public class SortingDataInsertion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = 0;
        String[] split = new String[0];
        do {
            if (arrayLength != split.length) {
                System.out.println("Размерность массива не совпадает с количеством введенных значений");
            }
            System.out.print("Введите размер массива: ");
            arrayLength = Integer.parseInt(scanner.nextLine());
            System.out.print("Введите числа для массива через запятую: ");
            split = scanner.nextLine().split(",");
        } while (arrayLength != split.length);

        int[] arr = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }
        insertionSort(arr);
        System.out.println("Отсортированный массив: " + Arrays.toString(arr));

    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }

}
