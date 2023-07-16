import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class JLableDemo {
    

    JLabel j1,j2,j3;
    JLableDemo(){
        JFrame jfrm = new JFrame("JLableDemo");
        jfrm.setLayout(new GridLayout());
        jfrm.setVisible(true);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(400,400);


        j1 = new JLabel("vikas", null, 0);
        j2 = new JLabel("rushi", null, 0);
        j3 = new JLabel("RUSI", null, 0);

        jfrm.add(j1);
        jfrm.add(j2);
        jfrm.add(j3);
    }


   public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable(){
        public void run (){
            new JLableDemo();
        }
    });
   }
}
