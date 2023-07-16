import java.awt.*;
import java.awt.event.*;

 class FrameDemo extends Frame{

    FrameDemo(String title){
        super(title);
        setSize(700, 700);
        setVisible(true);
        setBackground(Color.YELLOW);
        setForeground(Color.CYAN);
        addWindowListener(new WindowListener() 
        
        {
            public void windowClosing(WindowEvent e ){
                System.exit(0);
            }

            @Override
            public void windowOpened(WindowEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'windowOpened'");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'windowClosed'");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'windowIconified'");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'windowDeiconified'");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'windowActivated'");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'windowDeactivated'");
            }
            
        });

    }

    public void paint(Graphics g){
        g.setColor(Color.RED);

        g.drawOval(10, 10, 50, 50);
         g.setColor(Color.CYAN);
         g.drawLine(0, 10, 500, 50);
        g.fillRect(100, 10, 60, 50);
    }


    public static void main(String args[]) {
        new FrameDemo("testestse");
        System.out.println("this is an application");
    }
}
