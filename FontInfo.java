import java.awt.Font;
import java.applet.*;
import java.awt.*;

/*<applet code=FontInfo height=300 width=400></applet>*/
public class FontInfo extends Applet{
    public void paint(Graphics g){
        Font f = new Font("Courier", Font.BOLD,100);
        g.setFont(f);
         int size = f.getSize();
         String fontFamily = f.getFamily();
         String msg="HRER ERE" + fontFamily;
         g.drawString(msg, 100, 100);
    }
}