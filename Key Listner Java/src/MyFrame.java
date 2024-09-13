import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener{
 JLabel lbl;
 JLabel lbl2;
    MyFrame(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);
        this.setSize(500,500);

        this.addKeyListener(this);
        lbl= new JLabel();
        lbl.setBounds(0,0,100,100);
        lbl.setBackground(Color.cyan);
        lbl.setText("Neel");
        lbl.setOpaque(true);

        this.add(lbl);

        lbl2 = new JLabel();
        lbl2.setBounds(0,0,90,90);
        lbl2.setBackground(Color.pink);
        lbl2.setOpaque(true);
        lbl2.setText("Sneha");
        this.add(lbl2);


    }

    @Override
    public void keyTyped(KeyEvent e) {
         switch(e.getKeyChar()){
             case'a': lbl.setLocation(lbl.getX()-10,lbl.getY());
             break;

             case 'w':
              lbl.setLocation(lbl.getX(),lbl.getY()-10);
                 break;
             case 's':
                 lbl.setLocation(lbl.getX(),lbl.getY()+10);
                 break;
             case 'd':
                 lbl.setLocation(lbl.getX()+10,lbl.getY());
                 break;

         }    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()){
            case 37: lbl.setLocation(lbl.getX()-10,lbl.getY());
                break;

            case 38:
                lbl.setLocation(lbl.getX(),lbl.getY()-10);
                break;
            case 39:
                lbl.setLocation(lbl.getX()+10,lbl.getY());
                break;
            case 40:
                lbl.setLocation(lbl.getX(),lbl.getY()+10);
                break;

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("You released Key Car "+ e.getKeyChar());
        System.out.println("You released Key Code "+ e.getKeyCode());
    }
}
