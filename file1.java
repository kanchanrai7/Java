import java.io.FileWriter;
import java.io.IOException;

public class file1 {
    public static void main(String[] args) {
        String s ="My name is Kanchan";
        try {
            FileWriter f = new FileWriter("abc.txt");
            f.write(s);
            f.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
