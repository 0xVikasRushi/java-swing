import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;

/*<applet code=Mouse width=500 height=500></applet> */

public class Mouse extends Applet implements MouseListener,MouseMotionListener {

    int x = 30;
    int y = 30;
    String msg=  "MouseEvents";



    public void init(){
        addMouseListener(this);
        addMouseMotionListener(this);
        setBackground(Color.WHITE);
        setBackground(Color.BLACK);
    }

    public void mouseMoved(MouseEvent e){
        setBackground(Color.BLUE);
        showStatus("moved");
    }
     public void mouseReleased(MouseEvent e){
        setBackground(Color.BLUE);
        showStatus("released");
    }
     public void mousePressed(MouseEvent e){
        setBackground(Color.RED);
        showStatus("PRESSED");
    }
     public void mouseEntered(MouseEvent e){
        setBackground(Color.PINK);
        showStatus("ENTERED");
    }


    public void mouseDragged(MouseEvent e) {
        setBackground(Color.BLUE);
        showStatus("DRAGGED");
    }

  
    public void mouseClicked(MouseEvent e) {
          setBackground(Color.BLUE);
        showStatus("Clicked");
    }

   
    public void mouseExited(MouseEvent e) {
      setBackground(Color.BLUE);
        showStatus(msg);
    }

    public void paint(Graphics g){
        g.drawString(msg, x, y);
    }
}