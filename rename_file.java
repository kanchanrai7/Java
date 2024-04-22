import java.io.File;

public class rename_file {
    public static void main(String[] args) {
        File f1 = new File("new1.txt");
        File f2 = new File("new.txt");
        
        try {
            if (f1.exists()) {
                System.out.println("Renaming the file...");
                boolean renamed = f1.renameTo(f2);
                if (renamed) {
                    System.out.println("Renamed successfully.");
                } else {
                    System.out.println("Renaming failed.");
                }
            } else {
                System.out.println("File does not exist.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
