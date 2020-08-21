import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteDataInFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        try (FileOutputStream out = new FileOutputStream(new File("resources\\test2.txt"));
             BufferedOutputStream bos = new BufferedOutputStream(out)) {
            String temp = "";
            System.out.println("Признак конца ввода - строка \"stop\"");
            do {
                temp = scanner.nextLine();
                if ("stop".compareTo(temp) == 0) break;
                str += temp + "\r\n";
            } while ("stop".compareTo(temp) != 0);

            byte[] buffer = str.getBytes();
            bos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
