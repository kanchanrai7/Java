import java.util.*;
class vowel_exception extends Exception{

}

class digit_in_string extends Exception{
    
}
public class own_exception_vowel {
    public static void main(String[] args) {
        String s;
    System.out.println("Enter a string");
    Scanner sc=new Scanner(System.in);
    s=sc.nextLine();
    String copy=s.toLowerCase();
    try{
        for(int i=0;i<copy.length();i++){
            if(copy.charAt(i)=='a' || copy.charAt(i)=='e' || copy.charAt(i)=='i' || copy.charAt(i)=='o' || copy.charAt(i)=='u'){
                throw new vowel_exception();
            }
            else if(Character.isDigit(copy.charAt(i))){
                throw new digit_in_string();

            }
        }
    }catch(digit_in_string e){
        e.printStackTrace();
    }catch(vowel_exception e){
        e.printStackTrace();
    }
    }
    
   
    
}
