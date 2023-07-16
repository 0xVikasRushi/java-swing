
import java.awt.event.*;
import java.awt.*;
import java.applet.*;



/*<applet code=ListDemo height=300 width=400></applet> */

public class ListDemo extends Applet implements ActionListener{

    String msg = "";
    List os,browser;
    public void init(){
        os = new List(3,false);
        os.add("win",0);
        os.add("mac",1);
        os.add("linux",2);

          browser = new List(3,false);
          browser.add("brave",0);
          browser.add("chrome",1);
          browser.add("firefox",2);
    
        add(os);
        add(browser);

        os.addActionListener(this);
        browser.addActionListener(this);
        }

    public void actionPerformed(ActionEvent e) {
            repaint();
    }

    public void paint(Graphics g){

        int idx[];
        
        msg = "Current OS :";
        idx  = os.getSelectedIndexes();
        for (int i = 0; i < idx.length; i++) {
            msg+=os.getItem(idx[i]) + "";
        }
        g.drawString(msg, 100 , 100);
        msg="Current Broswer";
        msg+=browser.getSelectedItem();

        g.drawString(msg, 6 , 140);
    }
    
}
