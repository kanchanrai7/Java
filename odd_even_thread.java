class thread{
    int counter=1;
    int N=20;
    synchronized public void print_even(){
        while(counter<=N){
            if(counter%2==0){
                try{
                    System.out.println(counter);
                    counter++;
                    notify();
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
            else{
                try{
                    wait();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

    synchronized public void print_odd(){
        while(counter<=N){
            if(counter%2!=0){
                try{
                    System.out.println(counter);
                    counter++;
                    notify();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            else{
                try{
                    wait();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}


public class odd_even_thread {
    public static void main(String[] args) {
        thread t=new thread();
        Thread t1=new Thread(){
            public void run(){
                t.print_odd();
            }
        };
        Thread t2=new Thread(){
            public void run(){
                t.print_even();
            }
        };

        t1.start();
        t2.start();
    }
}
