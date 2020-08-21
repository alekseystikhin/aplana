import java.util.Scanner;

public class DeleteSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (char c : scanner.nextLine().toCharArray()) {
            if (c != ' ') System.out.print(c);
        }
    }
}
