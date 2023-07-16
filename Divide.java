import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code=Divide height=300 width=400></applet> */


public class Divide extends Applet implements ActionListener {
     TextField t1,t2,ans;
     Button btn;
     String msg = "";
     public void init(){
        t1 = new TextField("");
        t2 = new TextField("");
        ans = new TextField("ans");
        btn = new Button("Compute");
        add(t2);
        add(ans);
        add(btn);
        btn.addActionListener(this);
     }
   
    public void actionPerformed(ActionEvent e ){
        String c;
        try {
            int a = Integer.parseInt(t1.getText());       
            int b = Integer.parseInt(t2.getText());
            
            c ="" + a / b;
            ans.setText(c);
            
        } catch (NumberFormatException b) {
            showStatus(b.getMessage());
            ans.setText("");
        }
        catch (ArithmeticException b) {
            showStatus(b.getMessage());
            ans.setText("");
        }
        repaint();
    }
}
