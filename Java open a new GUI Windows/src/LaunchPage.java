import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton btn1 = new JButton("Clicl ME ! ");
    LaunchPage(){

        btn1.setBounds(100,160,200,40);
        btn1.setFocusable(false);

        btn1.addActionListener(this);

        frame.add(btn1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==btn1){
        frame.dispose(); //close frame not using
        NewWindow mywindow = new NewWindow();

    }
    }
}
