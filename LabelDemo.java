import java.applet.*;
import java.awt.Label;
import java.awt.*;

/*<applet code=LabelDemo width=300 height=200></applet>*/
public class LabelDemo extends Applet {
public void init(
){
     Label one = new Label("One");
    Label two = new Label("222");
    Label three = new Label("333");
    add(one);add(two);add(three);
}
    
public void paint(Graphics g){
    g.drawString("msg",100,100);
}
}
