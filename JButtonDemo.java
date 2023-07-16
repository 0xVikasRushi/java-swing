import java.awt.*;
import javax.swing.*;
import javax.swing.text.AbstractDocument.LeafElement;

import java.awt.event.*;


public class JButtonDemo implements ActionListener{


    JLabel label;
    JButtonDemo(){
        JFrame jfrm= new JFrame("JButtonDemo");
        jfrm.setLayout(new GridBagLayout());
        jfrm.setVisible(true);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(400,400);

        JButton btn = new JButton("btn");
        label = new JLabel("button not pressed");
        jfrm.add(label);
        jfrm.add(btn);
        btn.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
            String s = e.getActionCommand();
            label.setText(
                "you have selected" + s
            );

    }

public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable(){
        public void run(){
            new JButtonDemo();
        }
    });
}
    


}
