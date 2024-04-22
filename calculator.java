import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator {
    public static void main(String[] args) {
        Frame f=new Frame("Calculator");
        Label n1=new Label("Enter first number:");
        Label n2=new Label("Enter Second Number:");
        TextField t1= new TextField();
        TextField t2=new TextField();
        Button adButton=new Button("+");
        Button sbButton=new Button("-");
        Button mltButton=new Button("x");
        Button divButton=new Button("/");

        Button exitButton=new Button("Exit");
        adButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                double num1=Double.parseDouble(t1.getText());
                double num2=Double.parseDouble(t1.getText());
                double result=num1+num2;
                displayResult(result);
            }
            
        });
        sbButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                double num1=Double.parseDouble(t1.getText());
                double num2=Double.parseDouble(t1.getText());
                double result=num1-num2;
                displayResult(result);
            }
            
        });
        mltButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                double num1=Double.parseDouble(t1.getText());
                double num2=Double.parseDouble(t1.getText());
                double result=num1*num2;
                displayResult(result);
            }
            
        });
        divButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                double num1=Double.parseDouble(t1.getText());
                double num2=Double.parseDouble(t1.getText());
                double result=num1/num2;
                displayResult(result);
            }
            
        });

        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });

        f.setLayout(new GridLayout(6,4));
        f.add(n1);
        f.add(t1);
        f.add(n2);
        f.add(t2);
        f.add(adButton);
        f.add(sbButton);
        f.add(mltButton);
        f.add(divButton);
        f.add(exitButton);
        f.setSize(300,200);
        f.setVisible(true);
    }

    private static void displayResult(double result){
        Dialog d= new Dialog(new Frame(),"Result");
        d.setLayout(new FlowLayout());
        // Creating a label to display the result
        Label l = new Label("Result: " + result);
        // Adding the label to the dialog box
        d.add(l);
        // Setting the size of the dialog box
        d.setSize(200, 100);
        // Setting the visibility of the dialog box
        d.setVisible(true);
    }
}
