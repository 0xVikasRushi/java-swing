import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*<applet code=ChoiceDemo height=300 width=400></applet> */


public class ChoiceDemo extends Applet implements ItemListener{
    
    Choice mobile ,apps;


    public void init(){
        mobile  = new Choice();
        apps = new Choice();
        mobile.add("iphone");
        mobile.add("andriod");
        apps.add("insta");
        apps.add("snap");

        mobile.addItemListener(this);
        apps.addItemListener(this);

        add(mobile);add(apps);

    }
    public void itemStateChanged(ItemEvent e){
        repaint();
    }

    public void paint(Graphics g){
        String  msg = "Mobile";

        msg += mobile.getSelectedItem();
        
        g.drawString(msg, 100, 100);
  String  msga = "Mobile";

        msga += apps.getSelectedItem();
        g.drawString(msga, 100, 200);
    }
}
