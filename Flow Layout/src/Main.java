import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500,500);
    frame.setLayout(new FlowLayout(FlowLayout.CENTER,1,10));

    JPanel panel =  new JPanel();
    panel.setPreferredSize(new Dimension(250,250));
    panel.setBackground(Color.BLACK);


    JButton btn1 = new JButton("Red");
    JButton btn2 = new JButton("Blue");
    JButton btn3 = new JButton("Green");
    JButton btn4 = new JButton("Yellow");
    JButton btn5 = new JButton("Purple");
    JButton btn6 = new JButton("Black");
    JButton btn7 = new JButton("White");
    JButton btn8 = new JButton("Pink");





    panel.add(btn1);
    panel.add(btn2);
    panel.add(btn3);
    panel.add(btn4);
    panel.add(btn5);
    panel.add(btn6);
    panel.add(btn7);
    panel.add(btn8);


        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.RED);
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.BLUE);
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.GREEN);
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.YELLOW);
            }
        });



    frame.add(panel);
    frame.setVisible(true);
    }
}