import java.awt.*;
import java.applet.*;

/*<applet code=ColorDemo width=300 height=200></applet>*/
public class ColorDemo extends Applet {
    
    public void paint(Graphics g){

        Color c1 = new Color(50, 60, 90);
        Color c2 = new Color(50, 255, 90);
        Color c3 = new Color(50, 60, 255);

        g.setColor(Color.RED);

        g.drawOval(10, 10, 50, 50);
         g.setColor(Color.CYAN);
         g.drawLine(0, 10, 500, 50);
        g.fillRect(100, 10, 60, 50);
    }
}
