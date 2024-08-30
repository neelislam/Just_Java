import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) {
    JFrame frame =  new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500,500);
    frame.setLayout(new BorderLayout(10,10));
    frame.setVisible(true);

    JPanel panel1 =  new JPanel();
    JPanel panel2 =  new JPanel();
    JPanel panel3 =  new JPanel();
    JPanel panel4 =  new JPanel();
    JPanel panel5 =  new JPanel();
    //-----------------------------------------------------
        JPanel panel6 =  new JPanel();

    panel1.setBackground(Color.red);
    panel2.setBackground(Color.blue);
    panel3.setBackground(Color.yellow);
    panel4.setBackground(Color.green);
    panel5.setBackground(Color.magenta);


        panel6.setBackground(Color.black);

    panel1.setPreferredSize(new Dimension(100,100));
    panel2.setPreferredSize(new Dimension(100,100));
    panel3.setPreferredSize(new Dimension(100,100));
    panel4.setPreferredSize(new Dimension(100,100));
    panel5.setPreferredSize(new Dimension(100,100));
        panel6.setPreferredSize(new Dimension(50,50));

        panel5.add(panel6,BorderLayout.WEST);


    frame.add(panel1,BorderLayout.NORTH);
    frame.add(panel2,BorderLayout.WEST);
    frame.add(panel3,BorderLayout.EAST);
    frame.add(panel4,BorderLayout.SOUTH);
    frame.add(panel5,BorderLayout.CENTER);


    }
}