import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class file4{
    public static void main(String[] args) {
        try{
            FileReader f1=new FileReader("abc.txt");
            FileWriter f2= new FileWriter("copy.txt");
            int i;
            while((i=f1.read())!=-1){
                f2.write((char)i);
            }
            f1.close();
            f2.close();
            System.out.println("Data Copied Successfully....");
        }
        catch(IOException e){
            System.out.println("Could'nt copy......");
        }
        

    }
      
    
}
