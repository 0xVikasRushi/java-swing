import java.awt.*;
import java.awt.event.*;
import java.applet.*;


/*<applet code=TrafficTest width=500 height=300></applet > */

public class TrafficTest extends Applet implements ItemListener {
    
    Checkbox r,y,g;

    Color c;
    CheckboxGroup group = new CheckboxGroup();
    public void init(){
        r = new Checkbox("red", group, true);
        y = new Checkbox("yellow", group, false);
        g = new Checkbox("green", group, false);
        add(r);add(y);add(g);
        r.addItemListener(this);
        y.addItemListener(this);        
        g.addItemListener(this);        
    }
    public void itemStateChanged(ItemEvent e ){
        String check = group.getSelectedCheckbox().getLabel();
        if(check=="red") {
                c = Color.RED;
        }
         else if(check=="yellow") {
                c = Color.YELLOW;
        }
         else {
                c = Color.GREEN;
        }
        repaint();
    }

    public void paint(Graphics g ){


        g.setColor(Color.BLACK);
        g.drawOval(30, 60, 20, 20);
        g.drawOval(30, 160, 20, 20);
        g.drawOval(30, 210, 20, 20);
        g.drawRect(60, 60, 40,120 );
        g.setColor(c);
      if(c==Color.RED) {
               g.fillOval(30, 60, 20, 20);
        }
         else if(c==Color.YELLOW) {
                g.fillOval(30, 110, 20, 20);
        }
         else {
                g.fillOval(30, 160, 20, 20);
        }
    }
}
