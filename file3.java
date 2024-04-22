import java.io.File;
public class file3 {
    public static void main(String[] args) {
        File f1=new File("file1.txt");
        File f2=new File("abc.txt");
        if(f1.exists()){
            System.out.println("Renaming file...");
            System.out.println(f1.renameTo(f2));
            System.out.println(f1.getName());
        }
        else{
            System.out.println("The file does not exits...");
        }
    }
}
