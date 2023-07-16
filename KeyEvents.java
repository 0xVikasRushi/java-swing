import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code=KeyEvents height=500 width=500></applet>*/
public class KeyEvents extends Applet implements KeyListener { 


    public void init(){
        setBackground(Color.RED);
        setForeground(Color.WHITE);
        addKeyListener(this);
    }

    public void keyPressed(KeyEvent e){
        showStatus("pressed mf");
    }
    public void keyReleased(KeyEvent e ){
        showStatus("released mf");
    }   
      public void keyTyped(KeyEvent e ){
        showStatus("Typed mf");
    }   
    public void paint(Graphics g){
        g.drawString("this is dumb applet",100,100);
    }
}