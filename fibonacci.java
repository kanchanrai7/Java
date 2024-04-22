import java.util.Scanner;
class fibon{
    public void fibo(int terms){
        int first_term=0;
        int second_term=1;
        for(int i=1;i<=terms;i++){
            System.out.print(first_term+", ");
            int next_term=first_term+second_term;
            first_term=second_term;
            second_term=next_term;
        }
    }

    public int fibo_recursion(int terms){
        if(terms==0){
            return 0;
        }
        if(terms==1 || terms==2){
            return 1;
        }
        return fibo_recursion(terms-1)+fibo_recursion(terms-2);
    }
}

public class fibonacci {
    public static void main(String[] args){
        int t;
        System.out.println("Enter the number of terms:");
        Scanner sc= new Scanner(System.in);
        t=sc.nextInt();
        fibon f=new fibon();
        f.fibo(t);
        fibon f1=new fibon();

        for(int i=0;i<9;i++){
            System.out.println(f1.fibo_recursion(i)+", ");
        }



    }
}
