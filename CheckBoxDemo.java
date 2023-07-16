import java.awt.event.*;
import java.awt.*;
import java.applet.*;
import java.awt.Checkbox;


/*<applet code=CheckBoxDemo height=300 width=400></applet> */

public class CheckBoxDemo extends Applet implements ItemListener{
    

    Checkbox c1 ,c2,c3;
    String msg = "";
    public void init ()
    {
        c1 = new Checkbox("c1");
        c2 = new Checkbox("c2");
        c3 = new Checkbox("c3");
        add(c1);  add(c2);  add(c3);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
    }


    public void  itemStateChanged(ItemEvent e) {
        repaint();
    }


    public void paint(Graphics g){
        msg = "Current State : ";
        g.drawString(msg,50,50);
        msg = "c1" + c1.getState();
        g.drawString(msg,50,100);

         msg = "c2" + c2.getState();
        g.drawString(msg,50,150);
         msg = "c3" + c3.getState();
        g.drawString(msg,50,200);




    }

}
