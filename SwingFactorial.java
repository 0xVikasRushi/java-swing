import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class SwingFactorial implements ActionListener { 


    JTextField n1,n2;
    JButton compute;
    JLabel label;
    SwingFactorial(){
        JFrame jfrm = new JFrame();
        jfrm.setVisible(true);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setLayout(new GridLayout());
        jfrm.setSize(300, 200);
        compute = new JButton("compute");
        n1 = new JTextField("",10);
        n2 = new JTextField("",20);
        label = new JLabel("ans");
        
        compute.addActionListener(this);
        jfrm.add(n1);
        jfrm.add(n2);
        jfrm.add(label);

        jfrm.add(compute);
    }

    public void actionPerformed(ActionEvent e ){
     
        int num1 = Integer.parseInt(n1.getText());
        int num2 = Integer.parseInt(n2.getText());
        
        String str = e.getActionCommand();

        if(str.equals("compute")){
            System.out.println("int");
            String ans = num1/num2 + "";
            label.setText(ans);
        }
        
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run (){
                new SwingFactorial();
            }
        });
    }
}