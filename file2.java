import java.io.IOException;
import java.io.FileReader;

public class file2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String name = "abc.txt";
        int count = 0;
        int i;
        try {
            FileReader f = new FileReader(name);
            while ((i = f.read()) != -1) {
                count++;
            }
            f.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Number of characters in the file: " + count);
    }
}
