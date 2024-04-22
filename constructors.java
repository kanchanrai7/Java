class ctor{
    private int x;
    private String name;
    ctor(){
        x = 0;
        name= "no_name";
    }

    ctor(int x,String name){
        this.x=x;
        this.name=name;


    }

    ctor(ctor obj){
        this.x=obj.x;
        this.name=obj.name;
    }

    public void print(){
        System.out.println("x= "+x);
        System.out.println("String= "+name);
    }
}

public class constructors {
    public static void main(String[] args) {
        ctor c=new ctor();
        c.print();
        ctor c2=new ctor(10,"kanchan");
        c2.print();
        ctor c3 = new ctor(c2);
        c3.print();
    }
    
}
