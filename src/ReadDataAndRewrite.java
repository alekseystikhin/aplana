import java.io.*;
import java.util.Scanner;

public class ReadDataAndRewrite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStringsFromFile = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(new File("resources\\test3.txt")))) {
            String s;
            while ((s = br.readLine()) != null) {
                ++numberOfStringsFromFile;
                System.out.println(s);
            }

        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

        String str = "";
        String temp;

        while (numberOfStringsFromFile > 0) {
            temp = scanner.nextLine();
            str += temp + "\r\n";
            --numberOfStringsFromFile;
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File("resources\\test3.txt")))) {
            bw.write(str);
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
