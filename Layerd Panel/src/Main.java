import javax.swing.*;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JLabel label1 =  new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.red);
        label1.setText("I am label 1");
        label1.setBounds(50,50,200,200);


        JLabel label2 =  new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.gray);
        label2.setBounds(100,100,200,200);


        JLabel label3 =  new JLabel();
        label3.setOpaque(true);
        label3.setText("I am label 3");
        label3.setBackground(Color.green);
        label3.setBounds(150,150,200,200);

        JLayeredPane layered_pane = new JLayeredPane();
        layered_pane.setBounds(0,0,500,500);

        layered_pane.add(label1, Integer.valueOf(0));
        layered_pane.add(label2, Integer.valueOf(2));
        layered_pane.add(label3, Integer.valueOf(1));



        JFrame frame = new JFrame("JLayered_Pane");
        frame.add(layered_pane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500,500));
        frame.setLayout(null);
        frame.setVisible(true);
        }
    }
