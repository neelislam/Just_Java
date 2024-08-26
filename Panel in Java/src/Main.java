import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) {
        JLabel label = new JLabel();
        label.setText("Helloo");
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.CENTER);


        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.red);
        redpanel.setBounds(0,0,250,250);

        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.blue);
        bluepanel.setBounds(250,0,250,250);



        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.green);
        greenpanel.setBounds(0,250,500,200);
        greenpanel.setLayout(new BorderLayout());



    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    frame.setSize(720,720);
    frame.setVisible(true);
    greenpanel.add(label);
    frame.add(redpanel);
    frame.add(bluepanel);
    frame.add(greenpanel);

    }
}