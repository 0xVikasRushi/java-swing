import java.applet.*;
import java.awt.*;

import java.awt.event.*;

public class ButtonDemo extends Applet implements ActionListener {

    String msg = "";
    Button yes,no,maybe;
    public void init(){
        yes = new Button("yes");
        no = new Button("no");
        maybe = new Button("maybe");
        add(yes);
        add(no);
        add(maybe);
        yes.addActionListener(this);
        no.addActionListener(this);
        maybe.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e )  {
        String strmf = e.getActionCommand();
        
        if(strmf.equals("Yes")){
            msg+="yes";
        }else{
            msg+="No";
        }
        repaint();
     }


     public void paint(Graphics g ){
        g.drawString(msg,6,10 );
     }




}


