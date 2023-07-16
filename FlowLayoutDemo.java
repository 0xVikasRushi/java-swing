import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.applet.*;

/*<applet code=FlowLayoutDemo height=300 width=400></applet> */

public class FlowLayoutDemo extends Applet implements ItemListener{
    

    Checkbox win,nt,sol,mac;
    String n;
    public void init(){
    setLayout(new FlowLayout(FlowLayout.LEFT));    
     win = new Checkbox("win", null,false);
     nt=  new Checkbox("nt", null, false);
     sol = new Checkbox("sol", null, false);
     mac = new Checkbox("mac", null, false);
    

     add(win);
     add(nt);
     add(mac);
     add(sol);
    win.addItemListener(this);
    nt.addItemListener(this);
    sol.addItemListener(this);
    mac.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        repaint();
    }
    public void paint(Graphics g){
        n = "windows : " + win.getState();
        g.drawString(n,200,10);
         n = "nt : " + nt.getState();
        g.drawString(n,400,20);


        n = "sol : " + sol.getState();
        g.drawString(n,600,30);
        n = "mac : " + mac.getState();
        g.drawString(n,800,40);
    }
   
}
