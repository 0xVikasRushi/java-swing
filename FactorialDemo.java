import java.awt.Label;
import java.awt.TextField;
import java.awt.event.*;
import java.applet.*;
import java.awt.Button;

/*<applet code=FactorialDemo height=300 width=400></applet> */

public class FactorialDemo extends Applet implements ActionListener  {
    String msg = "";
     TextField  num = new TextField("");
     TextField ans = new TextField(""); 
 Button  compute;
    public void init(){
    
        Label t1 = new Label("Enter Number to find Factorial");
        Label ansLabel  = new Label("Answer");
       compute = new Button("compute");
        add(t1);add(num);add(ansLabel);add(ans);add(compute);
        compute.addActionListener(this);
    
    }

    public int Factorial(int n){
        if(n ==1) return 1;
        return n * Factorial(n-1);
    }
    public void actionPerformed(ActionEvent ae ){

        String buttonPressed = ae.getActionCommand();
        int n = Integer.parseInt(num.getText());
        
        if(buttonPressed.equals(compute.getActionCommand())){
            String stfs= Factorial(n) + "";
            ans.setText(stfs);
        }
        
    }
}
