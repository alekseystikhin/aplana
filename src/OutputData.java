import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class OutputData {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader(new File("resources\\test1.txt"))))
        {
            String s;
            while((s=br.readLine())!=null){

                System.out.println(s);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
