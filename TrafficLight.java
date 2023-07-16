import java.applet.*;
import java.awt.event.*;
import java.awt.*;


/*<applet code=TrafficLight width=500 height=300></applet > */
public class TrafficLight extends Applet implements ItemListener {
    

    Checkbox red,yellow,green;
    CheckboxGroup group = new CheckboxGroup();
    Color dynamicColor;

    String s;


    public void init (){
        red = new Checkbox("Red", group, true);
        yellow = new Checkbox("YELLOW", group, false);
        green = new Checkbox("gREEN", group,false);


        add(red);add(yellow);add(green);

        red.addItemListener(this);
        yellow.addItemListener(this);
        green.addItemListener(this);
        
        dynamicColor = Color.RED;
        s = "RED";
}
    public void itemStateChanged(ItemEvent e ){
        String s = group.getSelectedCheckbox().getLabel();

        if(s=="Red"){
            dynamicColor = Color.RED;
        }
        else if(s=="YELLOW"){
            dynamicColor = Color.YELLOW;
        }
        else { dynamicColor = Color.GREEN;}
        repaint();
    }



    public void paint(Graphics g){ 
        g.setColor(Color.BLACK);
        g.drawOval(70, 70, 20, 20);
        g.drawOval(70, 110, 20, 20);
        g.drawOval(70, 150, 20, 20);
        g.drawRect(60, 60, 40,120 );

        g.setColor(dynamicColor);
        if(dynamicColor==Color.RED){
               g.fillOval(70, 70, 20, 20);
        }
        else if(dynamicColor==Color.YELLOW){
        g.fillOval(70, 110, 20, 20);
        } else {g.fillOval(70, 150, 20, 20);
}
        
    
    }
}



// t