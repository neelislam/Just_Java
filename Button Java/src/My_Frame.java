import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class My_Frame extends JFrame implements ActionListener {
    JButton btn =  new JButton();
    My_Frame(){
        ImageIcon icon = new ImageIcon("C:\\Users\\rabiu\\OneDrive\\Desktop\\Tickle.png");
        btn =  new JButton();
        btn.setBounds(200,100,300,350);

        btn.addActionListener(e -> System.out.println("Hahaha"));
        btn.setText("Tickle me!");
        btn.setFocusable(false);
        btn.setBounds(100,100,350,300);
        btn.setIcon(icon);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(btn);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==btn){
            System.out.println("Hahaha");

        }
    }
}


