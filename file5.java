import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class file5 {
    public static void main(String[] args) {
       
        try{
            File myfile=new File("abc.txt");
            Scanner sc= new Scanner(myfile);
            while(sc.hasNextLine()){
                String s=sc.nextLine();
                System.out.println(s);

            }      
        }catch(IOException e){
            System.out.println("Couldn't read file....");
        }
    }
}
