import javax.swing.*;
import java.awt.*;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {
JLabel lbl;
JLabel lbl2;
ImageIcon GG;
ImageIcon Cry;
ImageIcon LachendesDenken;
ImageIcon Thinking;
MyFrame(){

        //lbl = new JLabel();
        //lbl.addMouseListener(this);
        //lbl.setBounds(0,0,100,100);
        //this.setBackground(Color.RED);
        //lbl.setOpaque(true);

        JLabel label = new JLabel();
        label = new JLabel();
        label.addMouseListener(this);
        label.setBounds(10,10,100,100);
        label.setBackground(Color.RED);





        GG = new ImageIcon("GG.png");
        label.setIcon(GG);
        //Cry = new ImageIcon("Cry.png");
        //LachendesDenken= new ImageIcon("LachendesDenken.png");
        //Thinking = new ImageIcon("Thinking.png");


        //lbl2.addMouseListener(this);




        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);
        //this.setLayout(new FlowLayout());
        //this.pack();
        //this.setLocationRelativeTo(null);
        this.setSize(500,500);
        this.add(label);











    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("CLICKED!");

    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("CLICKED!");


        //lbl2.setIcon(Thinking);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Released!");

        //lbl.setBackground(Color.blue);
        //lbl2.setIcon(LachendesDenken);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("You entered my heart!");
        //lbl.setBackground(Color.red);

        //lbl2.setIcon(GG);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Out");
        //lbl.setBackground(Color.yellow);
        //lbl2.setIcon(Cry);
    }
}
